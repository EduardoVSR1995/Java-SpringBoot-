package com.apipost.post.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apipost.post.DTO.UserDTO;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/user")
public class postController {

    @PostMapping("")
    public void creat(@RequestBody UserDTO req, HttpServletResponse response ){
        response.setStatus(HttpStatus.CREATED.value());
        System.out.println(req);
    }    

}
