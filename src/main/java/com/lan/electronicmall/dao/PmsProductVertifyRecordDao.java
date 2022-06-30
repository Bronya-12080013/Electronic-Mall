package com.lan.electronicmall.dao;

import com.lan.electronicmall.mbg.model.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 商品审核日志管理自定义Dao
 */
@Component
public interface PmsProductVertifyRecordDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}