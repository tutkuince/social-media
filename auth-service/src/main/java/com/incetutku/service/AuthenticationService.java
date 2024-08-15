package com.incetutku.service;

import com.incetutku.dto.request.RegisterRequestDTO;
import com.incetutku.entity.Authentication;
import com.incetutku.repository.AuthenticationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final AuthenticationRepository authenticationRepository;

    public Authentication register(RegisterRequestDTO registerRequestDTO) {
        return authenticationRepository.save(Authentication.builder()
                .username(registerRequestDTO.username())
                .email(registerRequestDTO.email())
                .password(registerRequestDTO.password())
                .build());
    }
}
