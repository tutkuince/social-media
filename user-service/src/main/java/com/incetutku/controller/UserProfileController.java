package com.incetutku.controller;

import com.incetutku.document.UserProfile;
import com.incetutku.dto.request.CreateUserRequestDTO;
import com.incetutku.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.incetutku.config.ResAPIs.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(USER_SERVICE)
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping(USER_SERVICE_CREATE_USER)
    public ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDTO createUserRequestDTO) {
        userProfileService.createUser(createUserRequestDTO);
        return ResponseEntity.ok(true);
    }

    @GetMapping(USER_SERVICE_GET_USER_LIST)
    public ResponseEntity<List<UserProfile>> getUserList() {
        return ResponseEntity.ok(userProfileService.getUserList());
    }
}
