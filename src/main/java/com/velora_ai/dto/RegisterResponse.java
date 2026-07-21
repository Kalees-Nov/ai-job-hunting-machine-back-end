package com.velora_ai.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.*;

@Getter
@Builder
public class RegisterResponse {

    private UUID id;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String message;

    private LocalDateTime registeredAt;
}