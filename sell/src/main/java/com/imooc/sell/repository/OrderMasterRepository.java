package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018-10-4.
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    /**
     * 按照买家openid查询订单，分页
     * @param buyerOpenid
     * @param pageable
     * @return
     */
    Page<OrderMaster>  findByBuyerOpenid(String buyerOpenid, Pageable pageable);

}
