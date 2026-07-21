package com.velora_ai.service;

import com.velora_ai.dto.*;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    RegisterResponse register(RegisterRequest request);
    public LoginResponse login(LoginRequest request);
    LoginResponse refreshToken(RefreshTokenRequest request);
}
