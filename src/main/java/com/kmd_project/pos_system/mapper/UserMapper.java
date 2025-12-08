package com.kmd_project.pos_system.mapper;

import com.kmd_project.pos_system.model.User;
import com.kmd_project.pos_system.payload.dto.UserDto;

public class UserMapper {

    public static UserDto toDTO(User savedUser) {
        UserDto userDto = new UserDto();
        userDto.setId(savedUser.getId());
        userDto.setFullName(savedUser.getFullName());
        userDto.setEmail(savedUser.getEmail());
        userDto.setRole(savedUser.getRole());
        userDto.setCreatedAt(savedUser.getCreatedAt());
        userDto.setUpdatedAt(savedUser.getUpdatedAt());
        userDto.setLastLogin(savedUser.getLastLogin());
        userDto.setPhone(savedUser.getPhone());
        userDto.setBranchId(savedUser.getBranch() != null ? savedUser.getBranch().getId() : null);
        userDto.setStoreId(savedUser.getStore() != null ? savedUser.getStore().getId() : null);

        return userDto;
    }

    public static User toEntity(UserDto userDto) {
        User createdUser = new User();
//        createdUser.setId(userDto.getId());
        createdUser.setEmail(userDto.getEmail());
        createdUser.setFullName(userDto.getFullName());
        createdUser.setPassword(userDto.getPassword());
        createdUser.setRole(userDto.getRole());
        createdUser.setCreatedAt(userDto.getCreatedAt());
        createdUser.setUpdatedAt(userDto.getUpdatedAt());
        createdUser.setLastLogin(userDto.getLastLogin());
        createdUser.setPhone(userDto.getPhone());
        createdUser.setPassword(userDto.getPassword());

        return createdUser;


    }
}
