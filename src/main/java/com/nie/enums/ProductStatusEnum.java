package com.nie.enums;

import lombok.Getter;

/**
 * Created by prue on 2018/9/10.
 * @author prue
 */
@Getter
public enum  ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private  Integer code;
    private  String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
