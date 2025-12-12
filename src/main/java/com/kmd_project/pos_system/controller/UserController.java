package com.kmd_project.pos_system.controller;


import com.kmd_project.pos_system.exceptions.UserException;
import com.kmd_project.pos_system.mapper.UserMapper;
import com.kmd_project.pos_system.model.User;
import com.kmd_project.pos_system.payload.dto.UserDto;
import com.kmd_project.pos_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<UserDto> getUserProfile(
            @RequestHeader("Authorization") String jwt
    ) throws UserException {

        User user = userService.getUserFromJwtToken(jwt);
        return ResponseEntity.ok(UserMapper.toDTO(user));

    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(
            @PathVariable Long id
    ) throws  Exception {

        User user = userService.getUserById(id);

        return ResponseEntity.ok(UserMapper.toDTO(user));

    }


}
