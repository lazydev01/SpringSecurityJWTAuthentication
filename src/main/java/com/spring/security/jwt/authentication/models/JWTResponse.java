package com.spring.security.jwt.authentication.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JWTResponse {
    private String jwtToken;
    private String username;
}
