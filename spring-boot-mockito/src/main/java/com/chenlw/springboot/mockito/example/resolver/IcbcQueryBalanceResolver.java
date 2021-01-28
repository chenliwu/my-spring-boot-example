package com.chenlw.springboot.mockito.example.resolver;

import org.springframework.stereotype.Component;

/**
 * 工行-查询余额-银行返回报文解析类
 *
 * @author chenlw
 * @since 2020/03/20
 */
@Component
public class IcbcQueryBalanceResolver {

    /**
     * 解析 余额查询银行返回报文
     *
     * @param input 余额查询银行返回报文
     * @return 自身业务体系的结果
     */
    public Object resolveQueryBalanceInput(Object input) {
        Object outResult = new Object();
        System.out.println("=======解析银行返回的结果报文 start=====");
        System.out.println("执行解析银行返回的结果报文操作1");
        System.out.println("执行解析银行返回的结果报文操作2");
        System.out.println("执行解析银行返回的结果报文操作3");
        System.out.println("·····");
        System.out.println("=======解析银行返回的结果报文 end=====");
        System.out.println();
        return "解析银行报文的结果";
    }

}
