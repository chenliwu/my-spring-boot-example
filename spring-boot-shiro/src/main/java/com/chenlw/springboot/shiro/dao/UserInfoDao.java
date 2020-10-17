package com.chenlw.springboot.shiro.dao;

import com.chenlw.springboot.shiro.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserInfoDao extends CrudRepository<UserInfo, Long> {

    /**
     * 通过username查找用户信息;
     */
    UserInfo findByUsername(String username);

}