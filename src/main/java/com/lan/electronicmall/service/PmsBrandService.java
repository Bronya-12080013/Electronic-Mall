package com.lan.electronicmall.service;

import com.lan.electronicmall.mbg.model.PmsBrand;

import java.util.List;


public interface PmsBrandService {
    List<PmsBrand> listAllBrand();//列出所有Brand，以list类返回  //PmsBrand是mbg自动生成的实体类

    int createBrand(PmsBrand brand);   //增

    int updateBrand(Long id,PmsBrand brand);  //改

    int deleteBrand(Long id); //删

    List<PmsBrand> listBrand(int pageNum,int pageSize);   //分页查询  //即只查询部分的Brand

    PmsBrand getBrand(Long id); //通过id找Brand

    /**
     * 批量删除品牌
     */
    int deleteBrand(List<Long> ids);

    /**
     * 批量更新显示状态
     */
    int updateShowStatus(List<Long> ids,Integer showStatus);

    /**
     * 批量更新厂家制造商状态
     */
    int updateFactoryStatus(List<Long> ids,Integer factoryStatus);
}
