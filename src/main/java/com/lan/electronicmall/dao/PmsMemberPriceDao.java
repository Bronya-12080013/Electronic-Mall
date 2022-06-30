package com.lan.electronicmall.dao;

import com.lan.electronicmall.mbg.model.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 会员价格管理自定义Dao
 */
@Component
public interface PmsMemberPriceDao {
    /**
     * 批量创造
     */
    int insertList(@Param("list") List<PmsMemberPrice> memberPriceList);
}
