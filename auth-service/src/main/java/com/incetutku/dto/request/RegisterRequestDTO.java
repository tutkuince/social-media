package com.incetutku.dto.request;

public record RegisterRequestDTO(
        String username,
        String password,
        String rePassword,
        String email
) {
}
