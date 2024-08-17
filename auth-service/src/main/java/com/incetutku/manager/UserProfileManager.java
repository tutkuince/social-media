package com.incetutku.manager;

import com.incetutku.dto.request.CreateUserRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.incetutku.config.RestAPIs.*;

@FeignClient(url = "http://localhost:9091/dev/v1/user-profile", name = "userProfileManager")
public interface UserProfileManager {
    @PostMapping(USER_SERVICE_CREATE_USER)
    ResponseEntity<Boolean> createUser(@RequestBody CreateUserRequestDTO createUserRequestDTO);
}
