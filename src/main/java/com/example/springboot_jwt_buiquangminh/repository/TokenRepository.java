package com.example.springboot_jwt_buiquangminh.repository;

import com.example.springboot_jwt_buiquangminh.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
