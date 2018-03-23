package com.digital.dao;

import com.digital.entity.UserEntity;



import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created by mj on 2017/7/17.
 */

@Mapper
public interface UserDao {
    @Select("select user from userTest where user=#{user}")
    @Cacheable(value ="result")
    List<UserEntity> query(@Param("user")String user);
    
   
}
