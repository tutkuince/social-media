package com.incetutku.repository;

import com.incetutku.entity.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationRepository extends JpaRepository<Authentication, Long> {
    Boolean existsByUsernameAndPassword(String username, String password);
}
