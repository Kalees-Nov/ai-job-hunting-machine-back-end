package com.velora_ai.controller;


import com.velora_ai.dto.RegisterRequest;
import com.velora_ai.dto.RegisterResponse;
import com.velora_ai.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class RegisterController {

    public RegisterController(AuthService authService) {
        this.authService = authService;
    }

    private final AuthService authService;

    @PostMapping("/register")
    public RegisterResponse registerResponse(@Valid
                                             @RequestBody RegisterRequest registerRequest){
        return authService.register(registerRequest);
    }
}
