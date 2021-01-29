package com.chenlw.springboot.mockito.example.assembler;

import com.chenlw.springboot.mockito.example.SpringBootMockitoApplicationTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMockitoApplicationTest.class)
public class IcbcQueryBalanceAssemblerTest {

    @Spy
    private IcbcQueryBalanceAssembler icbcQueryBalanceAssemblerSpy;

    @SpyBean
    private IcbcQueryBalanceAssembler icbcQueryBalanceAssemblerSpyBean;

    @MockBean
    private IcbcQueryBalanceAssembler icbcQueryBalanceAssembler1;

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
        System.out.println(icbcQueryBalanceAssemblerSpy.getQueryBalanceOutput("test"));
        System.out.println();
    }

    @Test
    public void testSpyBean() {
        System.out.println("====测试@SpyBean注解=====");
        // Mockito.when(icbcQueryBalanceAssembler.getQueryBalanceOutput(Mockito.any())).thenReturn("===当调用该方法时，返回此模拟数据===");
        System.out.println(icbcQueryBalanceAssemblerSpyBean.getQueryBalanceOutput("test"));
        System.out.println();
    }

    @Test
    public void testMockBean() {
        System.out.println("=====测试@MockBean注解=====");
        Mockito.when(icbcQueryBalanceAssembler1.getQueryBalanceOutput(Mockito.any())).thenReturn("===当调用该方法时，返回此模拟数据===");
        // 执行mock预先设定的返回信息，不会执行它原本真实的代码，所以没有打印该方法内部的任何信息
        System.out.println(icbcQueryBalanceAssembler1.getQueryBalanceOutput("test"));
        System.out.println();
    }

}
