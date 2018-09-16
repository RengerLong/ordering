package com.nie.entitys;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
/**
 * @author prue
 * */
@Entity
@DynamicUpdate  //用于动态更新
@Data           //lombok注解  生成get  set  以及toString
public class ProductInfo {
  @Id
  private String productId;

  private String productName;
  private BigDecimal productPrice;
  private Integer productStock;
  private String productDescription;
  private String productIcon;
  private Integer productStatus;
  private Integer categoryType;
  //private Date createTime;
  //private Date updateTime;
  public ProductInfo() {

}

  public ProductInfo(String productId,String productName, BigDecimal productPrice, Integer productStock, String productDescription, String productIcon, Integer productStatus, Integer categoryType) {
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;
    this.productStock = productStock;
    this.productDescription = productDescription;
    this.productIcon = productIcon;
    this.productStatus = productStatus;
    this.categoryType = categoryType;
  }
}
