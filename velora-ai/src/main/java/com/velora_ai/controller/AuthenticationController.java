package com.velora_ai.controller;

import com.velora_ai.dto.RegisterRequest;
import com.velora_ai.dto.RegisterResponse;
import com.velora_ai.service.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register-admin")
    public ResponseEntity<RegisterResponse> registerAdmin(
            @Valid @RequestBody RegisterRequest request) {

        RegisterResponse response = authenticationService.registerAdmin(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}