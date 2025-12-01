package com.kmd_project.pos_system.payload.response;

import com.kmd_project.pos_system.payload.dto.UserDto;
import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;
    private String message;
    private UserDto user;

}
