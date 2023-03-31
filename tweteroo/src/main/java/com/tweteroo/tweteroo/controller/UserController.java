package com.tweteroo.tweteroo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweteroo.DTO.UserDTO;
import com.tweteroo.tweteroo.model.Users;
import com.tweteroo.tweteroo.repository.UserRepository;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserRepository repositoryUser;

    @PostMapping("sign-up")
    public void userCreat(@RequestBody UserDTO request, HttpServletResponse response ){
        try {
            repositoryUser.save(new Users(request));
            response.setStatus(HttpStatus.CREATED.value());
        } catch (Exception e) {
            response.setStatus(HttpStatus.CONFLICT.value());
        }
    }
}
