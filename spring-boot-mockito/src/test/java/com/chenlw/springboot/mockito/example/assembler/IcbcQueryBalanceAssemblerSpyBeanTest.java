package com.chenlw.springboot.mockito.example.assembler;

import com.chenlw.springboot.mockito.example.SpringBootMockitoApplicationTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMockitoApplicationTest.class)
public class IcbcQueryBalanceAssemblerSpyBeanTest {


    @SpyBean
    private IcbcQueryBalanceAssembler icbcQueryBalanceAssemblerSpyBean;


    @Before
    public void init() throws Exception {
        // 初始化Mock类
        MockitoAnnotations.initMocks(this);
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

    @Test
    public void testSpyBean1() {
        System.out.println("====测试@SpyBean注解=====");
        Mockito.when(icbcQueryBalanceAssemblerSpyBean.getQueryBalanceOutput(Mockito.any())).thenReturn("===当调用该方法时，返回此模拟数据===");
        // 对特定的行为作出反应。
        System.out.println(icbcQueryBalanceAssemblerSpyBean.getQueryBalanceOutput("test"));
        System.out.println();
    }

}
