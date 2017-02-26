package com.nfmedia.carshop.services;

import org.springframework.stereotype.Service;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/26.
 */
public interface AccountService {
    /**
     * 账户转移金额
     * @param out
     * @param in
     * @param money
     */
    public void accountTransfer(String out, String in, double money);
}
