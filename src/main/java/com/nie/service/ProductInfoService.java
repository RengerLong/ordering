package com.nie.service;

import com.nie.entitys.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by prue on 2018/9/10.
 * @author prue
 */
public interface ProductInfoService {
    ProductInfo findById(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> finddUpAll();

    /**
     * 分页查询商品
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存

}
