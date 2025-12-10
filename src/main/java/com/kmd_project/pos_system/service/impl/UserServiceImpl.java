package com.kmd_project.pos_system.service.impl;

import com.kmd_project.pos_system.configuration.JwtProvider;
import com.kmd_project.pos_system.exceptions.UserException;
import com.kmd_project.pos_system.model.User;
import com.kmd_project.pos_system.repository.UserRepository;
import com.kmd_project.pos_system.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;

    @Override
    public User getUserFromJwtToken(String token) throws UserException {

        String email = jwtProvider.getEmailFromToken(token);
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UserException("Invalid Token");
        }
        return user;
    }

    @Override
    public User getCurrentUser() throws UserException {

        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = userRepository.findByEmail(email);
        if(user == null){
            throw new UserException("User Not Found");
        }
        return user;
    }

    @Override
    public User getUserByEmail(String email) throws UserException {

        User user = userRepository.findByEmail(email);
        if(user == null){
            throw new UserException("User Not Found");
        }
        return user;
    }

    @Override
    public User getUserById(Long id) throws Exception {

        return userRepository.findById(id).orElseThrow(
                () -> new Exception("User not found")
                );
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
