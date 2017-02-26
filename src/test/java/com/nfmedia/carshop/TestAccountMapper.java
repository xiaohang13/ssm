package com.nfmedia.carshop;

import com.nfmedia.carshop.services.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/application.xml")
public class TestAccountMapper {

    @Autowired
    private AccountService accountService;

    @Test
    public void testTransferMoney() {
        accountService.accountTransfer("aaa", "bbb", 200d);
    }
}
