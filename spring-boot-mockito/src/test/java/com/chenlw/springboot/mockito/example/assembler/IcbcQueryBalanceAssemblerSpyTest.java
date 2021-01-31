package com.chenlw.springboot.mockito.example.assembler;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class IcbcQueryBalanceAssemblerSpyTest {

    @Spy
    private IcbcQueryBalanceAssembler icbcQueryBalanceAssemblerSpy;

    @Before
    public void init() throws Exception {
        // 初始化Mock类
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Spy注解生成的实例对象不受Spring控制，实例对象默认会调用真实的方法，有返回值的返回真实的返回值。
     */
    @Test
    public void testSpy() {
        System.out.println("====测试@Spy注解=====");
        // 实例对象默认会调用真实的方法，有返回值的返回真实的返回值。
        System.out.println(icbcQueryBalanceAssemblerSpy.getQueryBalanceOutput("test"));
        System.out.println();
    }

}
