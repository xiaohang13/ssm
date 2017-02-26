package com.nfmedia.carshop.services.impl;

import com.nfmedia.carshop.mapper.AccountMapper;
import com.nfmedia.carshop.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description
 * <p>  账户转账操作实现类
 * Author rabbit.
 * Datetime 2017/2/26.
 */

@Service
public class AccountServiceImpl implements AccountService {

    public AccountServiceImpl() {
        System.out.println("AccountServiceImpl.....");
    }

    @Autowired
    private AccountMapper accountMapper;

    /**
     * 账户转移金额
     *
     * @param out
     * @param in
     * @param money
     */
    @Override
    public void accountTransfer(String out, String in, double money) {
        accountMapper.transferOutMoney(out, money);
        int d = 1 / 0;
        accountMapper.transferInMoney(in, money);
    }
}
