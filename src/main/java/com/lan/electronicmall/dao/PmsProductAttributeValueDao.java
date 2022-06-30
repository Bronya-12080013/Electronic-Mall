package com.lan.electronicmall.dao;

import com.lan.electronicmall.mbg.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *商品参数/规格属性自定义Dao
 */
@Component
public interface PmsProductAttributeValueDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
