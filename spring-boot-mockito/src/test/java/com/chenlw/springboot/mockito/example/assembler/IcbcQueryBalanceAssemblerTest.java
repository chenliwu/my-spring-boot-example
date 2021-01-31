package com.chenlw.springboot.mockito.example.assembler;

import com.chenlw.springboot.mockito.example.SpringBootMockitoApplicationTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
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

    @Mock
    private IcbcQueryBalanceAssembler icbcQueryBalanceAssemblerMock;

    @MockBean
    private IcbcQueryBalanceAssembler icbcQueryBalanceAssemblerMockBean;

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

    /**
     * SpyBean注解生成的对象实例受Spring管理，相当于自动替换对应类型bean的注入，比如@Autowired等注入。
     */
    @Test
    public void testSpyBean() {
        System.out.println("====测试@SpyBean注解=====");
        // 实例对象默认会调用真实的方法，有返回值的返回真实的返回值。
        System.out.println(icbcQueryBalanceAssemblerSpyBean.getQueryBalanceOutput("test"));
        System.out.println();
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

    /**
     * MockBean注解生成的对象实例受Spring管理，相当于自动替换对应类型bean的注入，比如@Autowired等注入。
     */
    @Test
    public void testMockBean() {
        System.out.println("=====测试@MockBean注解=====");
        Mockito.when(icbcQueryBalanceAssemblerMockBean.getQueryBalanceOutput(Mockito.any())).thenReturn("===当调用该方法时，返回此模拟数据===");
        // 执行mock预先设定的返回信息，不会执行它原本真实的代码，所以没有打印该方法内部的任何信息
        System.out.println(icbcQueryBalanceAssemblerMockBean.getQueryBalanceOutput("test"));
        System.out.println();
    }

}
