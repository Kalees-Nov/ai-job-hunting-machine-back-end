package com.velora_ai.repository;

import com.velora_ai.entity.RefreshToken;
import com.velora_ai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, UUID> {

    Optional<RefreshToken> findByToken(String token);

    void deleteByUser(User user);
}
