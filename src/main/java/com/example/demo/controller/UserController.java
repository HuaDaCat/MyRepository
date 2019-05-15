package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/*")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("list")
    public List<User> list(){
        return userMapper.list();
    };


}
