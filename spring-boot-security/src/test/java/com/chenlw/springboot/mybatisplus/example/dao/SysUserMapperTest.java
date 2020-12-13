package com.chenlw.springboot.mybatisplus.example.dao;


import com.chenlw.springboot.mybatisplus.example.SpringBootMyBatisPlusApplication;
import com.chenlw.springboot.mybatisplus.example.entity.SysUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMyBatisPlusApplication.class)
public class SysUserMapperTest {

    @Resource
    SysUserMapper sysUserMapper;

    @Test
    public void selectAll() {
        System.out.println(("----- selectAll method test ------"));
        List<SysUser> userList = sysUserMapper.selectList(null);
        userList.stream().forEach((sysUser -> {
            System.out.println(sysUser);
        }));
    }

    @Test
    public void testInsert(){
        SysUser sysUser = new SysUser();
        sysUser.setNickName("chenlw");
        sysUser.setUserName("chenlw");
        sysUser.setPassword("1213213");
        int result = sysUserMapper.insert(sysUser);
        Assert.assertEquals(1,result);
    }


}
