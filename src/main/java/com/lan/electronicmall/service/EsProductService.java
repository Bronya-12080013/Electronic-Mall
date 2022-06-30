package com.lan.electronicmall.service;

import com.lan.electronicmall.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;   //注意这里

import java.util.List;

/**
 * 商品搜索管理Service
 * Created by macro on 2018/6/19.
 */
public interface EsProductService {
    //从数据库导入所有商品到ES
    int importAll();

    //根据id删除商品
    void delete(Long id);

    //根据id创建商品
    EsProduct create(Long id);

    //批量删除商品
    void delete(List<Long> ids);

    //根据关键词搜索名称或副标题
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);
}



