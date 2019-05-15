package com.example.demo.entity;

import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author: hyh
 */
@Data
public class User {
    private BigInteger id;

    private String avatar;

    private Date create_time;

    private String email;

    private BigInteger enabled;

    private String password;

    private String username;

    private Date last_password_reset_time;

}
