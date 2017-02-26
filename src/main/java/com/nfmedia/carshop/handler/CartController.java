package com.nfmedia.carshop.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/22.
 */

@Controller
@RequestMapping("/cart")
public class CartController {

    @RequestMapping("/list")
    public String view() {
        return "view";
    }

    @RequestMapping(value = "/seller",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String seller(String callback) {
        System.out.println(callback);
        String str = "{\"error\":0,\"data\":{\"name\":\"回龙观\",\"description\":\"json数据测试\"}}";
        return callback + "(" + str + ")";
    }
}
