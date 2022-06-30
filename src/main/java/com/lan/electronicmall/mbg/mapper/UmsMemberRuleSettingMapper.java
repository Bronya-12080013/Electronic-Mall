package com.lan.electronicmall.mbg.mapper;

import com.lan.electronicmall.mbg.model.UmsMemberRuleSetting;
import com.lan.electronicmall.mbg.model.UmsMemberRuleSettingExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UmsMemberRuleSettingMapper {
    int countByExample(UmsMemberRuleSettingExample example);

    int deleteByExample(UmsMemberRuleSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberRuleSetting record);

    int insertSelective(UmsMemberRuleSetting record);

    List<UmsMemberRuleSetting> selectByExample(UmsMemberRuleSettingExample example);

    UmsMemberRuleSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberRuleSetting record, @Param("example") UmsMemberRuleSettingExample example);

    int updateByExample(@Param("record") UmsMemberRuleSetting record, @Param("example") UmsMemberRuleSettingExample example);

    int updateByPrimaryKeySelective(UmsMemberRuleSetting record);

    int updateByPrimaryKey(UmsMemberRuleSetting record);
}