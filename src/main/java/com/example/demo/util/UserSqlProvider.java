package com.example.demo.util;

import org.apache.ibatis.annotations.Param;

/**
 * @author: hyh
 */
public class UserSqlProvider {
    /**
     * 自己手工编写SQL
     */
    public String listByUsername(String username) {
        return "select * from user where username =#{username}";
    }




}
