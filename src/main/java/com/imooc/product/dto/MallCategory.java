package com.imooc.product.dto;

import lombok.Data;

/**
 * @author zxW
 * @ClassName: MallCategory
 * @Description:
 * @date 2021-04-14 ,16:33
 * @packageName com.imooc.product.dto
 */
@Data
public class MallCategory {
    /**
     * 类别Id
     */
    private Integer id;
    /**
     * 父类别id当id=0时说明是根节点,一级类别
     */
    private Integer parentId;
    /**
     * 类别名称
     */
    private String name;
    /***
     * 类别状态1-正常,2-已废弃
     */
    private Integer status;
    /***
     * 排序编号,同类展示顺序,数值相等则自然排序
     */
    private Integer sortOrder;
}
