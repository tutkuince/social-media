package com.incetutku.controller;

import com.incetutku.config.RestAPIs;
import com.incetutku.dto.request.LoginRequestDTO;
import com.incetutku.dto.request.RegisterRequestDTO;
import com.incetutku.entity.Authentication;
import com.incetutku.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.incetutku.config.RestAPIs.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(AUTH_SERVICE)
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping(AUTH_SERVICE_REGISTER)
    public ResponseEntity<Authentication> register(@RequestBody RegisterRequestDTO registerRequestDTO) {
        if (!registerRequestDTO.password().equals(registerRequestDTO.rePassword()))
            throw new RuntimeException("Passwords do not match");
        return new ResponseEntity<>(authenticationService.register(registerRequestDTO), HttpStatus.CREATED);
    }

    @PostMapping(AUTH_SERVICE_LOGIN)
    public ResponseEntity<Boolean> login(@RequestBody LoginRequestDTO loginRequestDTO) {
        return ResponseEntity.ok(authenticationService.login(loginRequestDTO));
    }
}
