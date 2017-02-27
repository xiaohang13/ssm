package com.nfmedia.carshop.services;

import com.nfmedia.carshop.entries.Product;

import java.util.List;

/**
 * Description
 * <p>  商品类service层
 * Author rabbit.
 * Datetime 2017/2/28.
 */
public interface ProductService {

    /**
     * 获取所有商品列表信息
     * @return
     */
    public List<Product> getProductList();
}
