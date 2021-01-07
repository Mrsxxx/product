package com.imooc.product.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zxW
 * @ClassName: ProductInfo
 * @Description:
 * @date 2021-01-07 ,18:01
 * @packageName com.imooc.product.dataobject
 */
@Data
@Entity
public class ProductInfo {
    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Integer productStatus;

    private String categoryType;

    private Date createTime;
    private Date updateTime;


}
