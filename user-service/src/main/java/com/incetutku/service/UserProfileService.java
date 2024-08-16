package com.incetutku.service;

import com.incetutku.document.UserProfile;
import com.incetutku.dto.request.CreateUserRequestDTO;
import com.incetutku.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;

    public void createUser(CreateUserRequestDTO createUserRequestDTO) {
        userProfileRepository.save(UserProfile.builder()
                .authenticationId(createUserRequestDTO.authenticationId())
                .username(createUserRequestDTO.username())
                .email(createUserRequestDTO.email())
                .build());
    }

    public List<UserProfile> getUserList() {
        return userProfileRepository.findAll();
    }

}
