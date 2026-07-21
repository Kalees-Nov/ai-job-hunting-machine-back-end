package com.velora_ai.service.serviceimpl;

import com.velora_ai.dto.RegisterRequest;
import com.velora_ai.dto.RegisterResponse;
import com.velora_ai.entity.Role;
import com.velora_ai.entity.User;
import com.velora_ai.enums.RoleType;
import com.velora_ai.exception.EmailAlreadyExistsException;
import com.velora_ai.exception.ResourceNotFoundException;
import com.velora_ai.repository.RoleRepository;
import com.velora_ai.repository.UserRepository;
import com.velora_ai.service.AuthenticationService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public RegisterResponse registerAdmin(RegisterRequest request) {

        boolean UserRepo = userRepository.existsByEmail(request.getEmail());
        if (UserRepo) {
            throw new EmailAlreadyExistsException("Email already exists");
        }

        Role adminRole = roleRepository.findByName(RoleType.ADMIN)
                .orElseThrow(() ->
                        new ResourceNotFoundException("ADMIN role not found"));

        User user = new User();


                user.setFirstName(request.getFirstName());
                user.setLastName(request.getLastName());
                user.setEmail(request.getEmail());
                user.setPassword(passwordEncoder.encode(request.getPassword()));
                user.setRoles(Set.of(adminRole));
                user.setPhoneNumber(request.getPhoneNumber());
                user.setEnabled(true);
                user.setAccountNonLocked(true);
                user.setCredentialsNonExpired(true);


        userRepository.save(user);
        User savedUser = userRepository.save(user);

        return RegisterResponse.builder()
                .id(savedUser.getId())
                .firstName(savedUser.getFirstName())
                .lastName(savedUser.getLastName())
                .email(savedUser.getEmail())
                .phoneNumber(savedUser.getPhoneNumber())
                .registeredAt(savedUser.getCreatedAt())
                .message("Admin registered successfully")
                .build();
    }
}
