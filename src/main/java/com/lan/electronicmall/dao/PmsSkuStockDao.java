package com.lan.electronicmall.dao;

import com.lan.electronicmall.mbg.model.PmsSkuStock;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 商品SKU管理自定义Dao
 */
@Component
public interface PmsSkuStockDao {
    /**
     * 批量插入操作
     */
    int insertList(@Param("List") List<PmsSkuStock> skuStockList);


    /**
     * 批量插入或替换操作
     * (就是比上面的insertList多要了一个参数id,可以去xml看看)
     */
    int replaceList(@Param("list")List<PmsSkuStock> skuStockList);
}
