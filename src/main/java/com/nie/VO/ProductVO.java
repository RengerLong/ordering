package com.nie.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by prue on 2018/9/10.
 * @author prue
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String cateName;
    @JsonProperty("type")
    private Integer cateType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
