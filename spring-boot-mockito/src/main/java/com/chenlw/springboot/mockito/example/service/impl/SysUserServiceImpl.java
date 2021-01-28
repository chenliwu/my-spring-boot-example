package com.chenlw.springboot.mockito.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenlw.springboot.mockito.example.dao.SysUserMapper;
import com.chenlw.springboot.mockito.example.entity.SysUser;
import com.chenlw.springboot.mockito.example.service.ISysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 用户 业务层处理
 *
 * @author chenlw
 */
@Service("sysUserServiceImpl")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    private static final Logger log = LoggerFactory.getLogger(SysUserServiceImpl.class);
}
