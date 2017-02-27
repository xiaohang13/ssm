package com.nfmedia.carshop.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nfmedia.carshop.entries.Product;
import com.nfmedia.carshop.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/28.
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @CrossOrigin(origins = "http://localhost", maxAge = 3600)
    @RequestMapping(value = "/all", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getProductList() {
        List<Product> productList = productService.getProductList();
        // 自定义返回json格式
        LinkedHashMap<String, Object> result = new LinkedHashMap<>();
        LinkedHashMap<String, Object> list = new LinkedHashMap<>();
        list.put("list", productList);
        result.put("status", 1);
        result.put("result", list);
        result.put("message", "");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "{\"status\":\"内部错误\"}";
    }
}
