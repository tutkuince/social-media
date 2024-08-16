package com.incetutku.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class UserProfile {
    @Id
    private String id;
    private Long authenticationId;
    private String username;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String avatar;
    private String instagram;
    private String twitter;
    private Boolean isActive;
    private Long createdAt;
}
