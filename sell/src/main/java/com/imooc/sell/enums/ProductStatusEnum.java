package com.imooc.sell.enums;

import lombok.Getter;

/**
 * 商品状态的枚举
 */
@Getter
public enum ProductStatusEnum implements CodeEnum<Integer>{
    UP(0,"在架"),
    DOWN(1,"下架");

    private Integer code;

    private String msg;

    ProductStatusEnum(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }

}
