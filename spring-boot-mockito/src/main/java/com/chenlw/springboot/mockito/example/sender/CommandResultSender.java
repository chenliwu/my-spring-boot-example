package com.chenlw.springboot.mockito.example.sender;

import org.springframework.stereotype.Component;

/**
 * 指令结果发送器
 *
 * @author chenlw
 * @date 2020/03/20
 */
@Component
public class CommandResultSender {

    /**
     * 将自身业务体系的结果类返回服务端
     *
     * @param outResult 自身业务体系的结果
     */
    public void sendResultToServer(Object outResult) {
        System.out.println("=======将自身业务体系的结果类返回服务端 start=====");
        System.out.println("·····");
        System.out.println("=======将自身业务体系的结果类返回服务端 end=====");
        System.out.println();
    }

}
