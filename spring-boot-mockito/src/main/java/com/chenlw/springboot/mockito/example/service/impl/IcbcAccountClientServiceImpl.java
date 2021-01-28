package com.chenlw.springboot.mockito.example.service.impl;

import com.chenlw.springboot.mockito.example.assembler.IcbcQueryBalanceAssembler;
import com.chenlw.springboot.mockito.example.resolver.IcbcQueryBalanceResolver;
import com.chenlw.springboot.mockito.example.sender.CommandResultSender;
import com.chenlw.springboot.mockito.example.sender.IcbcCommandSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 工行：账号查询信息服务
 *
 * @author chenlw
 * @since 2020/03/20
 */
@Service
public class IcbcAccountClientServiceImpl {

    @Autowired
    private IcbcQueryBalanceAssembler icbcQueryBalanceAssembler;

    @Autowired
    private IcbcCommandSender icbcCommandSender;

    @Autowired
    private IcbcQueryBalanceResolver icbcQueryBalanceResolver;

    @Autowired
    private CommandResultSender commandResultSender;

    /**
     * 查询账户余额
     */
    public Object queryBalance(Object accountInfo) {
        // 1、组装账户余额查询报文
        Object output = icbcQueryBalanceAssembler.getQueryBalanceOutput(accountInfo);
        // 2、发送账户余额查询报文到银行接口，得到银行返回的结果报文
        Object input = icbcCommandSender.sendQueryBalance(output);
        // 3、解析银行返回的结果报文，封装成我们自身业务体系的结果类
        Object outResult = icbcQueryBalanceResolver.resolveQueryBalanceInput(input);
        // 4、将自身业务体系的结果类返回服务端
        commandResultSender.sendResultToServer(outResult);
        return outResult;
    }
}
