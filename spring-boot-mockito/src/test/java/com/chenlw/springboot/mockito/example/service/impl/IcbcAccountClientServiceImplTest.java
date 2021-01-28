package com.chenlw.springboot.mockito.example.service.impl;

import com.chenlw.springboot.mockito.example.assembler.IcbcQueryBalanceAssembler;
import com.chenlw.springboot.mockito.example.resolver.IcbcQueryBalanceResolver;
import com.chenlw.springboot.mockito.example.sender.CommandResultSender;
import com.chenlw.springboot.mockito.example.sender.IcbcCommandSender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

/**
 * 工行-客户端-业务Service测试
 */
public class IcbcAccountClientServiceImplTest {

    @Spy
    private IcbcQueryBalanceAssembler icbcQueryBalanceAssembler;

    @Spy
    private IcbcCommandSender icbcCommandSender;

    @Spy
    private IcbcQueryBalanceResolver icbcQueryBalanceResolver;

    @Spy
    private CommandResultSender commandResultSender;

    /**
     * InjectMocks 注解会把@Spy/@Mock注解生成的类实例注入到对象当中
     * - IcbcAccountClientServiceImpl类中依赖其他bean，因此使用InjectMocks注解将依赖的bean注入进来。
     */
    @Spy
    @InjectMocks
    private IcbcAccountClientServiceImpl icbcAccountClientService;

    @Before
    public void init() throws Exception {
        // 初始化Mock类
        MockitoAnnotations.initMocks(this);
        // 注入baseMapper
        // ReflectionTestUtils.setField(sysUserService, "baseMapper", sysUserMapper);
    }

    /**
     * 这里对 queryBalance()查询余额方法的测试，相当于【集成测试】。
     * 把各个【软件单元】逐步集成到完整的软件系统，并不断发现和排除错误，以保证连接、集成的正确性。
     * -
     */
    @Test
    public void testQueryBalance() {
        Object result = icbcAccountClientService.queryBalance("查询账号");
        Assert.assertNotNull(result);
    }


}
