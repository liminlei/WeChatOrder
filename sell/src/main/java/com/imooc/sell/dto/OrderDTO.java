package com.imooc.sell.dto;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.enums.OrderStatusEnums;
import com.imooc.sell.enums.PayStatusEnums;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 方便在各层间传输的对象，如果controller需要订单中包含详情，那么在OrderMaster中加字段不方便，因为与数据库对应的。
 */
@Data
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
    private Date createTime;

    //修改时间
    private Date updateTime;

    //订单详情
    private List<OrderDetail> orderDetailList;
}
