package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author zxW
 * @ClassName: ProductService
 * @Description:
 * @date 2021-01-26 ,18:08
 * @packageName com.imooc.product.service
 */
public interface ProductService {
    List<ProductInfo> lists(Integer productStatus);


}
