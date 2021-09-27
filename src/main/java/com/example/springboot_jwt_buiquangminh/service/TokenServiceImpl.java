package com.example.springboot_jwt_buiquangminh.service;


import com.example.springboot_jwt_buiquangminh.entity.Token;
import com.example.springboot_jwt_buiquangminh.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TokenServiceImpl {
    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }
}
