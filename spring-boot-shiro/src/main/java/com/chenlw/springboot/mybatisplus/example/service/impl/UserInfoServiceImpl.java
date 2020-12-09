package com.chenlw.springboot.mybatisplus.example.service.impl;


import com.chenlw.springboot.mybatisplus.example.dao.UserInfoDao;
import com.chenlw.springboot.mybatisplus.example.entity.UserInfo;
import com.chenlw.springboot.mybatisplus.example.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}
