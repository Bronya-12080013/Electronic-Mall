package com.lan.electronicmall.mbg.mapper;

import com.lan.electronicmall.mbg.model.CmsSubject;
import com.lan.electronicmall.mbg.model.CmsSubjectExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CmsSubjectMapper {
    int countByExample(CmsSubjectExample example);

    int deleteByExample(CmsSubjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsSubject record);

    int insertSelective(CmsSubject record);

    List<CmsSubject> selectByExampleWithBLOBs(CmsSubjectExample example);

    List<CmsSubject> selectByExample(CmsSubjectExample example);

    CmsSubject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsSubject record, @Param("example") CmsSubjectExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsSubject record, @Param("example") CmsSubjectExample example);

    int updateByExample(@Param("record") CmsSubject record, @Param("example") CmsSubjectExample example);

    int updateByPrimaryKeySelective(CmsSubject record);

    int updateByPrimaryKeyWithBLOBs(CmsSubject record);

    int updateByPrimaryKey(CmsSubject record);
}