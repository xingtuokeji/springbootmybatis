package com.simtop.springbootmybatis.controller;

import com.simtop.springbootmybatis.mapper.UserDao;
import com.simtop.springbootmybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/findAll")
    public List<User> findUsers(){
        return userDao.findAll();
    }

}
