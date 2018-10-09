package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Administrator on 2018-10-4.
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架的商品列表，C端
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有商品，管理端
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);
    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
    ProductInfo onSale(String productId);

    //下架
    ProductInfo offSale(String productId);
}
