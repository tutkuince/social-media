package com.incetutku.service;

import com.incetutku.document.UserProfile;
import com.incetutku.dto.request.CreateUserRequestDTO;
import com.incetutku.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;
    private final CacheManager cacheManager;

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

    @Cacheable("convert-to-uppercase")
    public String convertNameToUpperCase(String name) throws InterruptedException {
        Thread.sleep(3000L);
        return name.toUpperCase();
    }

    public void clearCache() {
        Objects.requireNonNull(cacheManager.getCache("convert-to-uppercase")).clear();
    }
}
