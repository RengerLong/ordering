package com.nie.service;

import com.nie.entitys.ProductCate;

import java.util.List;

/**
 * Created by prue on 2018/9/9.
 * @author prue
 */
public interface ProductCateService {
    ProductCate findById(Integer productCateId);
    List<ProductCate> findAll();
    List<ProductCate> findByCategoryTypeIn(List<Integer> productCateTypeList);
    ProductCate save(ProductCate productCate);

}
