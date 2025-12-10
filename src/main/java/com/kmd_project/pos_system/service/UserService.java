package com.kmd_project.pos_system.service;

import com.kmd_project.pos_system.exceptions.UserException;
import com.kmd_project.pos_system.model.User;

import java.util.List;

public interface UserService {

    User getUserFromJwtToken(String token) throws UserException;
    User getCurrentUser() throws UserException;
    User getUserByEmail(String email) throws UserException;
    User getUserById(Long id) throws Exception;
    List<User> getAllUsers();


}
