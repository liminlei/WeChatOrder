package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.enums.OrderStatusEnums;
import com.imooc.sell.enums.PayStatusEnums;
import com.imooc.sell.util.EnumUtil;
import com.imooc.sell.util.serializer.Date2LongSerializer;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 方便在各层间传输的对象，如果controller需要订单中包含详情，那么在OrderMaster中加字段不方便，因为与数据库对应的。
 */
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    //订单id
    private String orderId;

    //买家名字
    private String buyerName;

    //买家电话
    private String buyerPhone;

    //买家地址
    private String buyerAddress;

    //买家opendid
    private String buyerOpenid;

    //订单金额
    private BigDecimal orderAmount;

    //订单状态,默认0新下单
    private Integer orderStatus;

    //支付状态，默认0未支付
    private Integer payStatus;

    //创建时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    //修改时间
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    //订单详情
    private List<OrderDetail> orderDetailList = new ArrayList<>();
    //返回到前端时，如果不想要null，那就赋初始值，list就会是[]，String就是""

    @JsonIgnore
    public OrderStatusEnums getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus, OrderStatusEnums.class);
    }
    @JsonIgnore
    public PayStatusEnums getPayStatusEnum(){
        return EnumUtil.getByCode(payStatus, PayStatusEnums.class);
    }
}
