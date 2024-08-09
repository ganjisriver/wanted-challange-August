package com.august.template.wantedaugustchallange.controller;

import com.august.template.wantedaugustchallange.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService articleService;

    @PostMapping("/test")
    public ResponseEntity<String> test() {
        var result = articleService.test();
        return ResponseEntity.ok(result);
    }

}
