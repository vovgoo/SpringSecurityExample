package com.example.testSecurity.dto;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {
    private String token;

    private String refreshToken;
}
