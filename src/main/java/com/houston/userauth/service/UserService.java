package com.houston.userauth.service;

import com.houston.userauth.entity.UserEntity;
import com.houston.userauth.entity.UserRoleEntity;
import com.houston.userauth.model.User;
import com.houston.userauth.model.UserRole;
import com.houston.userauth.repository.UserRepository;

import com.houston.userauth.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRoleRepository userRoleRepository;
    
    public User registerUser(User user){
        UserEntity newUser = new UserEntity(user);

        return new User(userRepository.saveAndFlush(newUser));
    }

    public UserRole createRole(UserRole userRole){
        UserRoleEntity ure = new UserRoleEntity(userRole);

        return new UserRole(userRoleRepository.saveAndFlush(ure));
    }
}
