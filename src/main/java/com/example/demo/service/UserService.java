package com.example.demo.service;

import java.math.BigInteger;

import com.example.demo.entity.User;

public interface UserService {

    User getById(BigInteger id);
}
