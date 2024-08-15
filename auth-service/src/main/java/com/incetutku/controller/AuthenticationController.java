package com.incetutku.controller;

import com.incetutku.entity.Authentication;
import com.incetutku.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    /*@PostMapping
    public ResponseEntity<Authentication> register() {

    }*/
}
