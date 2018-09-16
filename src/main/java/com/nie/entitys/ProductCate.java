package com.nie.entitys;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * 类目表
 * Created by prue on 2018/9/9.
 * @author prue
 */
@Entity
@DynamicUpdate  //用于动态更新
@Data           //lombok注解  生成get  set  以及toString
@Table(name = "product_cate")
public class ProductCate {
    /** 类目编号 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    /** 类目名称 */
    private String categoryName;
    /** 类目编号 */
    private Integer categoryType;
    /** 创建时间 */
    private Date createTime;
    /** 修改时间 */
    private Date updateTime;

}
