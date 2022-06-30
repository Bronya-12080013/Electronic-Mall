package com.lan.electronicmall.mbg.mapper;

import com.lan.electronicmall.mbg.model.SmsCoupon;
import com.lan.electronicmall.mbg.model.SmsCouponExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SmsCouponMapper {
    int countByExample(SmsCouponExample example);

    int deleteByExample(SmsCouponExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsCoupon record);

    int insertSelective(SmsCoupon record);

    List<SmsCoupon> selectByExample(SmsCouponExample example);

    SmsCoupon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);

    int updateByExample(@Param("record") SmsCoupon record, @Param("example") SmsCouponExample example);

    int updateByPrimaryKeySelective(SmsCoupon record);

    int updateByPrimaryKey(SmsCoupon record);
}