package com.nfmedia.carshop.mapper;

import com.nfmedia.carshop.entries.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/28.
 */
@Repository
public interface ProductMapper {
    /**
     * 获取商品信息列表
     * @return
     */
    public List<Product> getProductList();
}
