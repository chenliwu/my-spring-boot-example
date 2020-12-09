package com.chenlw.springboot.mybatisplus.example.dao;

import com.chenlw.springboot.mybatisplus.example.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo, Long> {

    /**
     * 通过username查找用户信息;
     */
    UserInfo findByUsername(String username);

}
