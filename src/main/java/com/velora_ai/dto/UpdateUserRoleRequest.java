package com.velora_ai.dto;

import com.velora_ai.enums.RoleType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateUserRoleRequest {

    @NotNull(message = "Role is required")
    private RoleType role;

}