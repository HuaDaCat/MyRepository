package com.example.demo;

import com.example.demo.mapper.RoleMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * SpringBoot整合Mybatis 单元测试
 */
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DemoApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Test
    @Rollback(false)
    public void contextLoads() {
//        Role role = new Role();
        BigInteger bigInteger = new BigInteger("122");
//        role.setId(bigInteger);
//        role.setName("pig");
//        role.setRemark("hahha");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp now = new Timestamp(System.currentTimeMillis());//获取系统当前时间
//        role.setCreate_time(now);
        int rel = roleMapper.add(bigInteger, now, "pig", "no");
    }

}
