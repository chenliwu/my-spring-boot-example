package com.chenlw.springboot.mockito.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenlw.springboot.mockito.example.entity.SysUser;
import org.springframework.stereotype.Repository;

/**
 * 用户表 数据层
 *
 * @author chenlw
 */

@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {

}
