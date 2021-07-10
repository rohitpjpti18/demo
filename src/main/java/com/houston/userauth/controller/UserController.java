package com.houston.userauth.controller;

import com.houston.userauth.entity.UserEntity;
import com.houston.userauth.model.User;
import com.houston.userauth.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user-auth/api/v1/user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    
    @PostMapping("/register")
    public ResponseEntity<User> registerApi( @RequestBody User newUser){
        UserEntity newestUser = new UserEntity(newUser);
        
        User user = new User();
        userRepository.saveAndFlush(newestUser);

        return new ResponseEntity<User>(user, HttpStatus.ACCEPTED);
    }
}
