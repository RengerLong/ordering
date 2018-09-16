package com.nie.service.impl;

import com.nie.entitys.ProductInfo;
import com.nie.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by prue on 2018/9/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {
    @Autowired
    private ProductInfoServiceImpl productInfoService;

    @Test
    public void findById() throws Exception {
        ProductInfo productInfo = productInfoService.findById("101");
        Assert.assertEquals("101",productInfo.getProductId());
    }

    @Test
    public void finddUpAll() throws Exception {
        List<ProductInfo> productInfoList = productInfoService.finddUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = productInfoService.findAll(request);
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());

    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo("102","炒河粉",new BigDecimal(10.5),100,"网吧特色美食","http://***.jpg", ProductStatusEnum.UP.getCode(),2);
        productInfoService.save(productInfo);
    }


}
