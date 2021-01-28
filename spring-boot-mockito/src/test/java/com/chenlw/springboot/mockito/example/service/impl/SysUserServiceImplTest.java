package com.chenlw.springboot.mockito.example.service.impl;

import com.chenlw.springboot.mockito.example.dao.SysUserMapper;
import com.chenlw.springboot.mockito.example.entity.SysUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.List;

public class SysUserServiceImplTest {

    @Spy
    private SysUserMapper sysUserMapper;

    @Spy
    @InjectMocks
    private SysUserServiceImpl sysUserService;

    @Before
    public void init() throws Exception {
        MockitoAnnotations.initMocks(this);
        // 注入baseMapper
        ReflectionTestUtils.setField(sysUserService, "baseMapper", sysUserMapper);
    }

    @Test
    public void getAllList() {
        try {
            List<SysUser> sysUserList = sysUserService.list();
            sysUserList.stream().forEach((sysUser -> {
                System.out.println(sysUser.toString());
            }));
        } catch (Exception e) {
            System.out.println("异常：" + e.getMessage());
            Assert.fail();
        }
    }

    @Test
    public void insertOne() {
        try {
            SysUser sysUser = new SysUser();
            sysUser.setNickName("chenlw");
            sysUser.setUserName("chenlw");
            sysUser.setPassword("1213213");
            boolean result = sysUserService.save(sysUser);
            Assert.assertEquals(true, result);
        } catch (Exception e) {
            System.out.println("异常：" + e.getMessage());
            Assert.fail();
        }
    }

}