package com.example.demo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JWTrequest {
    private String email;
    private String password;
}
