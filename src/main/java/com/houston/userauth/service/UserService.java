package com.houston.userauth.service;

import com.houston.userauth.entity.UserEntity;
import com.houston.userauth.model.User;
import com.houston.userauth.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;
    
    public User registerUser(User user){
        UserEntity newUser = new UserEntity(user);

        return new User(userRepository.saveAndFlush(newUser));
    }
}
