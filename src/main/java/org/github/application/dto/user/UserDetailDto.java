package org.github.application.dto.user;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDetailDto {
    private Long id;
    private String fullName;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
