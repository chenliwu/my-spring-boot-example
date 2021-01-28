package com.chenlw.springboot.mockito.example.dao;


import com.chenlw.springboot.mockito.example.SpringBootMyBatisPlusApplicationTest;
import com.chenlw.springboot.mockito.example.entity.SysUser;
import com.chenlw.springboot.mockito.example.SpringBootMyBatisPlusApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMyBatisPlusApplicationTest.class)
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
