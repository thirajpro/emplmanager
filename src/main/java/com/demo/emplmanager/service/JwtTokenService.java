package com.demo.emplmanager.service;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

@Service
public class JwtTokenService {

    private final String SECRET_KEY = "mySecretKey"; // Use a secure secret in production
    private final long EXPIRATION_TIME = 86400000; // 1 day in milliseconds

    @SuppressWarnings("deprecation")
    public String generateToken(Authentication authentication) {
        String username = authentication.getName();
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}
