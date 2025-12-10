package com.kmd_project.pos_system.service;

import com.kmd_project.pos_system.exceptions.UserException;
import com.kmd_project.pos_system.payload.dto.UserDto;
import com.kmd_project.pos_system.payload.response.AuthResponse;

public interface AuthService {

    AuthResponse signup(UserDto userDto) throws UserException;
    AuthResponse login(UserDto userDto) throws UserException;

}
