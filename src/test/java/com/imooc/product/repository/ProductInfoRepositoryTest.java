package com.imooc.product.repository;


import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.imooc.product.ProductApplicationTests;

import java.util.List;


/**
 * @author zxW
 * @ClassName: ProductInfoRepositoryTest
 * @Description:
 * @date 2021-01-07 ,18:20
 * @packageName com.imooc.product.repository
 */
@Component
public class ProductInfoRepositoryTest extends ProductApplicationTests {
    @Autowired
    private ProductInfoRepository productInfoRepository;


    @Test
    public void test() {
        List<ProductInfo> byProductStatus = productInfoRepository.findByProductStatus(0);
        Assert.assertTrue(0 < byProductStatus.size());
    }

}