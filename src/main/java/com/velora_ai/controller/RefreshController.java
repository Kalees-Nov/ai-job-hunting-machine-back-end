package com.velora_ai.controller;


import com.velora_ai.dto.LoginResponse;
import com.velora_ai.dto.RefreshTokenRequest;
import com.velora_ai.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
@RequiredArgsConstructor
public class RefreshController {
    private final AuthService authService;
    @PostMapping("/refresh")
    public ResponseEntity<LoginResponse> refreshToken(
            @Valid @RequestBody RefreshTokenRequest request) {

        return ResponseEntity.ok(authService.refreshToken(request));
    }
}
