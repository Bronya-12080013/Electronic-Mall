package com.lan.electronicmall.dao;

import com.lan.electronicmall.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 * 对应的xml文件在resoures的mapper  EsProductDao.xml
 */
@Component
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
