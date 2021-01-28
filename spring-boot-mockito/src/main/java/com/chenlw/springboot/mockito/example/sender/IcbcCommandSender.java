package com.chenlw.springboot.mockito.example.sender;

import org.springframework.stereotype.Component;

/**
 * 发送报文到银行接口类
 *
 * @author chenlw
 * @date 2020/03/20
 */
@Component
public class IcbcCommandSender {
    /**
     * 发送账户余额查询报文到银行接口
     *
     * @param output 账户余额查询报文
     * @return 银行接口返回报文
     */
    public Object sendQueryBalance(Object output) {
        Object bankResult = new Object();
        System.out.println("=======发送账户余额查询报文到银行接口 start=====");
        System.out.println("发送查询报文到银行成功");
        System.out.println("=======发送账户余额查询报文到银行接口 end=====");
        System.out.println();
        return bankResult;
    }
}
