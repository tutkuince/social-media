package com.incetutku.dto.request;

import lombok.Builder;

@Builder
public record CreateUserRequestDTO(
        Long authenticationId,
        String username,
        String email
) {
}
