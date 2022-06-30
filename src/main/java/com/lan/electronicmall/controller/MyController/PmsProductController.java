package com.lan.electronicmall.controller.MyController;


import com.lan.electronicmall.common.api.CommonResult;
import com.lan.electronicmall.dto.PmsProductResult;
import com.lan.electronicmall.mbg.mapper.PmsProductMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 商品管理Controller     //区别品牌管理和商品管理
 */
@Controller
@Api(tags = "PmsProductController", description = "商品管理")
@RequestMapping("/product")
public class PmsProductController {
    @Autowired


    @ApiOperation("根据商品id获取商品编辑信息")
    @RequestMapping(value = "/updateInfo/{id}",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<PmsProductResult> updateInfo(@PathVariable("id") Long id){
        PmsProductResult pmsProductResult =
    }


}
