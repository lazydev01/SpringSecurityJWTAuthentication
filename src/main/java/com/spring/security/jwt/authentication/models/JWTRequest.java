package com.spring.security.jwt.authentication.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JWTRequest {
    private String email;
    private String password;
}
