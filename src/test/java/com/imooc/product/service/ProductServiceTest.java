package com.imooc.product.service;

import com.google.gson.Gson;
import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.enums.ProductStatusEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zxW
 * @ClassName: ProductServiceTest
 * @Description:
 * @date 2021-01-26 ,18:15
 * @packageName com.imooc.product.service
 */
@Component
public class ProductServiceTest extends ProductApplicationTests {
    @Autowired
    private ProductService productService;


    @Test
    public void findProductByStatus() {
        List<ProductInfo> lists = productService.lists(ProductStatusEnum.UP.getCode());
        System.out.println(new Gson().toJson(lists));

    }

}