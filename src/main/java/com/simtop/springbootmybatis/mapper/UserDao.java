package com.simtop.springbootmybatis.mapper;

import com.simtop.springbootmybatis.entity.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
}
