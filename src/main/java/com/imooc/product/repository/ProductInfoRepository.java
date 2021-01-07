package com.imooc.product.repository;

import com.imooc.product.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zxW
 * @ClassName: ProductInfoRepository
 * @Description:
 * @date 2021-01-07 ,18:15
 * @packageName com.imooc.product.repository
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

}
