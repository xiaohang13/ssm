package com.nfmedia.carshop.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/27.
 */
@Controller
@RequestMapping("/transfer")
public class AccountController {

    @RequestMapping("/payMoney")
    @ResponseBody
    public String payMoney(String callback) {
        String res = "";
        return res;
    }
}
