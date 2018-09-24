package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by Administrator on 2018-9-24.
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
