package com.example.testSecurity.dto;

import lombok.Data;

@Data
public class SignUpRequest {

    private String firstname;

    private String lastname;

    private String email;

    private String password;
}
