package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * Created by Administrator on 2018-10-5.
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
