package com.javamasters.dao;

import com.javamasters.model.UserEntity;


public interface UserDaoService {
    UserEntity findByUsername(String username);
}
