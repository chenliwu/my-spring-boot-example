package com.chenlw.springboot.mockito.example.assembler;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class IcbcQueryBalanceAssemblerMockTest {

    @Mock
    private IcbcQueryBalanceAssembler icbcQueryBalanceAssemblerMock;

    @Before
    public void init() throws Exception {
        // 初始化Mock类
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Mock注解主要用于预先设定对象实例的行为逻辑，即模拟方法的返回值等等。
     */
    @Test
    public void testMock() {
        System.out.println("=====测试@Mock注解=====");
        Mockito.when(icbcQueryBalanceAssemblerMock.getQueryBalanceOutput(Mockito.any())).thenReturn("===当调用该方法时，返回此模拟数据===");
        // 执行mock预先设定的返回信息，不会执行它原本真实的代码，所以没有打印该方法内部的任何信息
        System.out.println(icbcQueryBalanceAssemblerMock.getQueryBalanceOutput("test"));
        System.out.println();
    }

}
