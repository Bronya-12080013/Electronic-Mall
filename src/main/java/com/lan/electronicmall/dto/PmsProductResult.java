package com.lan.electronicmall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 查询单个商品修改后返回的结果
 * Created by macro on 2018/4/26.
 */
public class PmsProductResult {
    @Getter
    @Setter
    @ApiModelProperty("商品所选分类的父id") //使用在被 @ApiModel 注解的模型类的属性上 //添加和操作模型属性的数据
    private  Long cateParentId;
}
