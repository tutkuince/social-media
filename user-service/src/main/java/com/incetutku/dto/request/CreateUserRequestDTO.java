package com.incetutku.dto.request;

public record CreateUserRequestDTO(
        Long authenticationId,
        String username,
        String email
) {
}
