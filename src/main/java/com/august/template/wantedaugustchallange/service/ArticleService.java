package com.august.template.wantedaugustchallange.service;

import com.august.template.wantedaugustchallange.entity.Article;
import com.august.template.wantedaugustchallange.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public String test() {
        var hello = "hello";
        var article = Article.builder()
                .title(hello)
                .build();
        articleRepository.save(article);
        var article1 = articleRepository.findByTitle(hello);
        return article1.get().getTitle();
    }
}
