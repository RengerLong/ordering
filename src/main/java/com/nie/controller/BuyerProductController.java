package com.nie.controller;

import com.nie.VO.ProductInfoVO;
import com.nie.VO.ProductVO;
import com.nie.VO.ResultVO;
import com.nie.entitys.ProductCate;
import com.nie.entitys.ProductInfo;
import com.nie.service.ProductCateService;
import com.nie.service.ProductInfoService;
import com.nie.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by prue on 2018/9/10.
 * @author prue
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductCateService productCateService;

    @RequestMapping("/list")
    public ResultVO list(){
        //查询所有上架商品
        List<ProductInfo> productInfoList = productInfoService.finddUpAll();
        //查询类目  lambda
        List<Integer> cateTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());
        List<ProductCate> productCateList = productCateService.findByCategoryTypeIn(cateTypeList);
        /**
         * 数据封装
         * ProductInfoVO(商品信息详情)  -->  ProductVO(类目信息)  --> ResultVO(返回数据格式）
         * */
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCate productCate:productCateList) {
            ProductVO productVO = new ProductVO();
            productVO.setCateName(productCate.getCategoryName());
            productVO.setCateType(productCate.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCate.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }

}
