package com.javamasters.service;

import com.javamasters.model.UserEntity;
import com.javamasters.request.AuthRequestDto;


public interface UserService {
    UserEntity findAndValidateUser(AuthRequestDto username);

    UserEntity findByUsername(String username);
}
