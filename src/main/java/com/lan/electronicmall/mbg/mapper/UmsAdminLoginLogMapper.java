package com.lan.electronicmall.mbg.mapper;

import com.lan.electronicmall.mbg.model.UmsAdminLoginLog;
import com.lan.electronicmall.mbg.model.UmsAdminLoginLogExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UmsAdminLoginLogMapper {
    int countByExample(UmsAdminLoginLogExample example);

    int deleteByExample(UmsAdminLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminLoginLog record);

    int insertSelective(UmsAdminLoginLog record);

    List<UmsAdminLoginLog> selectByExample(UmsAdminLoginLogExample example);

    UmsAdminLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);

    int updateByExample(@Param("record") UmsAdminLoginLog record, @Param("example") UmsAdminLoginLogExample example);

    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    int updateByPrimaryKey(UmsAdminLoginLog record);
}