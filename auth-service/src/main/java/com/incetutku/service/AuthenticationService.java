package com.incetutku.service;

import com.incetutku.dto.request.CreateUserRequestDTO;
import com.incetutku.dto.request.LoginRequestDTO;
import com.incetutku.dto.request.RegisterRequestDTO;
import com.incetutku.entity.Authentication;
import com.incetutku.manager.UserProfileManager;
import com.incetutku.repository.AuthenticationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final AuthenticationRepository authenticationRepository;
    private final UserProfileManager userProfileManager;

    public Authentication register(RegisterRequestDTO registerRequestDTO) {
        Authentication authentication = authenticationRepository.save(Authentication.builder()
                .username(registerRequestDTO.username())
                .email(registerRequestDTO.email())
                .password(registerRequestDTO.password())
                .build());
        userProfileManager.createUser(CreateUserRequestDTO.builder()
                .authenticationId(authentication.getId())
                .email(authentication.getEmail())
                .username(authentication.getUsername())
                .build());
        return authentication;
    }

    public Boolean login(LoginRequestDTO loginRequestDTO) {
        return authenticationRepository.existsByUsernameAndPassword(loginRequestDTO.username(), loginRequestDTO.password());
    }
}
