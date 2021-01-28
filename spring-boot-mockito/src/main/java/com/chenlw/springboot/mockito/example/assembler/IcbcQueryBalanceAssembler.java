package com.chenlw.springboot.mockito.example.assembler;

import org.springframework.stereotype.Component;

/**
 * 工行-查询余额-组装指令类
 *
 * @author chenlw
 * @since 2020/03/20
 */
@Component
public class IcbcQueryBalanceAssembler {

    /**
     * 组装查询余额报文
     *
     * @param accountInfo 账户信息
     * @return 查询余额报文
     */
    public Object getQueryBalanceOutput(Object accountInfo) {
        Object output = new Object();
        System.out.println("=======组装账户余额查询报文 start=====");
        System.out.println("执行组装账户余额查询报文操作1");
        System.out.println("执行组装账户余额查询报文操作2");
        System.out.println("执行组装账户余额查询报文操作3");
        System.out.println("·····");
        System.out.println("=======组装账户余额查询报文 end=====");
        System.out.println();
        return output;
    }

}
