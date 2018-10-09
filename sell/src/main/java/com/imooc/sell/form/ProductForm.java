package com.imooc.sell.form;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 前端-->后端 表单对象，卖家页面，商品新增、修改
 */
@Data
public class ProductForm {

    private String productId;

    //名字
    private String productName;

    //单价
    private BigDecimal productPrice;

    //库存
    private Integer productStock;

    //描述
    private String productDescription;

    //小图
    private String productIcon;

    //类目编号
    private Integer categoryType;
}
