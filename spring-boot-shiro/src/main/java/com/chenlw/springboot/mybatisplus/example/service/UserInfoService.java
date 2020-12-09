package com.chenlw.springboot.mybatisplus.example.service;

import com.chenlw.springboot.mybatisplus.example.entity.UserInfo;

public interface UserInfoService {
    /**
     * 通过username查找用户信息;
     */
    UserInfo findByUsername(String username);
}
