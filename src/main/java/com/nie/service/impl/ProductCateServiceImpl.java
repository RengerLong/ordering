package com.nie.service.impl;

import com.nie.dao.ProductCateDao;
import com.nie.entitys.ProductCate;
import com.nie.service.ProductCateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类目
 * Created by prue on 2018/9/9.
 * @author prue
 */
@Service
public class ProductCateServiceImpl implements ProductCateService {
    @Autowired
    private ProductCateDao productCateDao;

    @Override
    public ProductCate findById(Integer productCateId) {
        return productCateDao.findById(productCateId).get();
    }

    @Override
    public List<ProductCate> findAll() {
        return productCateDao.findAll();
    }

    @Override
    public List<ProductCate> findByCategoryTypeIn(List<Integer> productCateTypeList) {
        return productCateDao.findByCategoryTypeIn(productCateTypeList);
    }

    @Override
    public ProductCate save(ProductCate productCate) {
        return productCateDao.save(productCate);
    }
}
