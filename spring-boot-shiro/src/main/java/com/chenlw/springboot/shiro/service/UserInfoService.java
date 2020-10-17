package com.chenlw.springboot.shiro.service;

import com.chenlw.springboot.shiro.entity.UserInfo;

public interface UserInfoService {
    /**
     * 通过username查找用户信息;
     */
    UserInfo findByUsername(String username);
}