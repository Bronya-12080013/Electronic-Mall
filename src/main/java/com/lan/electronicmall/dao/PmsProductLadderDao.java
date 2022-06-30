package com.lan.electronicmall.dao;

import com.lan.electronicmall.mbg.model.PmsProductLadder;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 会员阶梯价格自定义Dao
 */
@Component
public interface PmsProductLadderDao {
    /**
     * 批量创建
     */
    int insertList(@Param("List")List<PmsProductLadder> pmsProductLadderList);
}
