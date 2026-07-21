package com.velora_ai.controller;

import com.velora_ai.dto.UpdateUserRoleRequest;
import com.velora_ai.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {

    private final UserService userService;

    @PutMapping("/users/{userId}/role")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> updateUserRole(
            @PathVariable UUID userId,
            @Valid @RequestBody UpdateUserRoleRequest request) {

        userService.updateUserRole(userId, request.getRole());

        return ResponseEntity.ok("User role updated successfully");
    }
}