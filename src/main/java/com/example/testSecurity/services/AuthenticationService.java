package com.example.testSecurity.services;

import com.example.testSecurity.dto.JwtAuthenticationResponse;
import com.example.testSecurity.dto.RefreshTokenRequest;
import com.example.testSecurity.dto.SignInRequest;
import com.example.testSecurity.dto.SignUpRequest;
import com.example.testSecurity.entities.User;

public interface AuthenticationService {
    
    User signUp(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signIn(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
