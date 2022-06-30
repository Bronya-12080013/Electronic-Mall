package com.lan.electronicmall.dao;

import com.lan.electronicmall.mbg.model.PmsProductFullReduction;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 商品满减自定义Dao
 */
@Component
public interface PmsProductFullReductionDao {
    /**
    批量操作
     */
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
