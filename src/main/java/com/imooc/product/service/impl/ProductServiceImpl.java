package com.imooc.product.service.impl;

import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.enums.ProductStatusEnum;
import com.imooc.product.repository.ProductInfoRepository;
import com.imooc.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author zxW
 * @ClassName: ProductServiceImpl
 * @Description:
 * @date 2021-01-26 ,18:08
 * @packageName com.imooc.product.service.impl
 */
@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoRepository productInfoRepository;


    @Override
    public List<ProductInfo> lists(Integer productStatus) {
        List<ProductInfo> byProductStatus = productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
        return byProductStatus;
    }







}
