package com.nie.service.impl;

import com.nie.dao.ProductCateDao;
import com.nie.entitys.ProductCate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by prue on 2018/9/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCateServiceImplTest {
    @Autowired
    private ProductCateServiceImpl productCateService;

    @Test
    public void findById() throws Exception {
        ProductCate productCate = productCateService.findById(1);
        System.out.println(productCate.toString());
    }

    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {

    }

    @Test
    public void save() throws Exception {
    }


}
