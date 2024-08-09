package com.august.template.wantedaugustchallange.repository;

import com.august.template.wantedaugustchallange.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
