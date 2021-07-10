package com.houston.userauth.service;

import com.houston.userauth.model.User;
import com.houston.userauth.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    UserRepository userRepository;
    
    public String registerUser(User user){
        return "Done!"; 
    }
}
