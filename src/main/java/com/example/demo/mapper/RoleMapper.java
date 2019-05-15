package com.example.demo.mapper;

import com.example.demo.entity.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Mapper
public interface RoleMapper {
    @Select("select * from role")
    List<Role> list();

    @Insert("insert into role(id,create_time,name,remark)values(#{id},#{create_time},#{name},#{remark})")
    int add(@Param("id") BigInteger id, @Param("create_time") Date create_time, @Param("name") String name, @Param("remark") String remark);
}
