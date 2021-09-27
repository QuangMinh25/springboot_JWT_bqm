package com.example.springboot_jwt_buiquangminh.service;

import com.example.springboot_jwt_buiquangminh.authen.UserPrincipal;
import com.example.springboot_jwt_buiquangminh.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
