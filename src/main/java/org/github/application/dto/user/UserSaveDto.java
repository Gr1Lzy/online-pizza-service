package org.github.application.dto.user;

import lombok.Data;

@Data
public class UserSaveDto {
    private String fullName;
    private String email;
    private String password;
}
