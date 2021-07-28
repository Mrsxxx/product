package com.imooc.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxW
 * @ClassName: productController
 * @Description:
 * @date 2021-01-07 ,16:48
 * @packageName com.imooc.product.controller
 */
@Slf4j
@RestController
public class productController {


    @GetMapping("/msg")
    public String msg() {
        return "this is product service  msg";
    }
}
