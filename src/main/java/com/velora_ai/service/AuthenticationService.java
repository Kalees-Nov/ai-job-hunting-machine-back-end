package com.velora_ai.service;

import com.velora_ai.dto.RegisterRequest;
import com.velora_ai.dto.RegisterResponse;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    RegisterResponse registerAdmin(RegisterRequest request);
}
