package com.kmd_project.pos_system.payload.dto;

import com.kmd_project.pos_system.domain.UserRole;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDto {


    private Long id;

    private String fullName;

    private String email;

    private String phone;

    private String password;

    private UserRole role;

    private Long branchId;
    private Long storeId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime lastLogin;
}
