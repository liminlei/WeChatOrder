package com.imooc.sell.vo;

import lombok.Data;

/**
 *http响应对象
 */
@Data
public class ResultVO<T> {

    //返回码
    private Integer code;

    //返回信息
    private String msg;

    //返回数据
    private T data;

}
