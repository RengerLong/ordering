package com.nie.service.impl;

import com.nie.dao.ProductInfoDao;
import com.nie.entitys.ProductInfo;
import com.nie.enums.ProductStatusEnum;
import com.nie.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by prue on 2018/9/10.
 * @author prue
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoDao productInfoDao;
    @Override
    public ProductInfo findById(String productId) {
        return productInfoDao.findById(productId).get();
    }

    @Override
    public List<ProductInfo> finddUpAll() {
        return productInfoDao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoDao.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoDao.save(productInfo);
    }
}
