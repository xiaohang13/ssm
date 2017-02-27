package com.nfmedia.carshop.services.impl;

import com.nfmedia.carshop.entries.Product;
import com.nfmedia.carshop.mapper.ProductMapper;
import com.nfmedia.carshop.services.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description
 * <p> 商品类service实现类
 * Author rabbit.
 * Datetime 2017/2/28.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    /**
     * 获取所有商品列表信息
     *
     * @return
     */
    @Override
    public List<Product> getProductList() {
        return productMapper.getProductList();
    }
}
