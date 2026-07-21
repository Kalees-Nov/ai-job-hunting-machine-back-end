package com.velora_ai.service;

import com.velora_ai.enums.RoleType;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface UserService {
    public void updateUserRole(UUID userId, RoleType roleType);
}
