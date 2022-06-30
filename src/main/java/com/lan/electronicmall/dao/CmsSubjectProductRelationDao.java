package com.lan.electronicmall.dao;

import com.lan.electronicmall.mbg.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 商品和专题关系自定义Dao
 */
@Component
public interface CmsSubjectProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
