package com.nfmedia.carshop.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nfmedia.carshop.entries.User;
import com.nfmedia.carshop.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/27.
 */
@Controller
@RequestMapping("/transfer")
public class AccountController {

    @Resource
    private UserService userService;

    @CrossOrigin(origins = "http://localhost", maxAge = 3600)
    @RequestMapping(value = "/payMoney", produces = "application/json;charset=utf8")
    @ResponseBody
    public String payMoney(String callback) throws JsonProcessingException {
        Map<String, Object> map = new LinkedHashMap<>();
        Map<String, Object> list = new LinkedHashMap<>();

        list.put("productId", "600100002115");
        list.put("productName", "黄鹤楼香烟");

        map.put("status", 200);
        map.put("result", list);

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(map);
    }

    @RequestMapping(value = "/user/{uid}", produces = "application/json;charset=utf8")
    @ResponseBody
    public User getUserById(@PathVariable("uid") int id) throws Exception {
        User user = userService.getUserById(id);
        return user;
    }
}
