package com.nie.dao;

import com.nie.entitys.ProductCate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by prue on 2018/9/9.
 * @author prue
 */
public interface ProductCateDao extends JpaRepository<ProductCate,Integer> {
    //findBy 列名 In  方法名固定格式
    List<ProductCate> findByCategoryTypeIn(List<Integer> cateTypeList);
}
