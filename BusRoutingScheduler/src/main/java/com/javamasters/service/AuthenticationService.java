package com.javamasters.service;

import com.javamasters.request.AuthRequestDto;
import jakarta.servlet.http.HttpServletRequest;


public interface AuthenticationService {
    String generateToken(AuthRequestDto authRequestDto);

    void isAuthenticated(HttpServletRequest request);
}
