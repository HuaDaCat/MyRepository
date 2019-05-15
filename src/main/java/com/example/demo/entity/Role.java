package com.example.demo.entity;


import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author: hyh
 */
@Data
public class Role {
    private BigInteger id;

    private Date create_time;

    private String name;

    private String remark;

}
