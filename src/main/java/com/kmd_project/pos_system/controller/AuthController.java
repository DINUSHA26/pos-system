package com.kmd_project.pos_system.controller;

import com.kmd_project.pos_system.exceptions.UserException;
import com.kmd_project.pos_system.payload.dto.UserDto;
import com.kmd_project.pos_system.payload.response.AuthResponse;
import com.kmd_project.pos_system.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signupHandler(
            @RequestBody UserDto userDto
    ) throws UserException {

        return ResponseEntity.ok(
                authService.signup(userDto) 
        );

    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> loginHandler(
            @RequestBody UserDto userDto
    ) throws UserException {

        return ResponseEntity.ok(
                authService.login(userDto)
        );

    }


}
