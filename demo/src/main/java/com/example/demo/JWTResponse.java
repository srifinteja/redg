package com.example.demo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JWTResponse {
    private String token;
    private String username;
}
