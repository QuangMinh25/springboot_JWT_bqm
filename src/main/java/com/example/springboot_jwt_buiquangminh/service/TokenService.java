package com.example.springboot_jwt_buiquangminh.service;

import com.example.springboot_jwt_buiquangminh.entity.Token;
import org.springframework.stereotype.Service;
@Service

public interface TokenService {
    Token createToken(Token token);
}
