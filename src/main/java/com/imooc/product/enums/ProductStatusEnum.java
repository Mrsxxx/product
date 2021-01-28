package com.imooc.product.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zxW
 * @ClassName: ProductStatusEnum
 * @Description:
 * @date 2021-01-26 ,18:04
 * @packageName com.imooc.product.enums
 */
@Getter
@AllArgsConstructor
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWM(1, "下架"),
    ;

    private Integer code;
    private String message;


}
