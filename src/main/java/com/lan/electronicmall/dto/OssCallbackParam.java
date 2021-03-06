package com.lan.electronicmall.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * oss上传成功后的回调参数
 *
 * 添加OSS上传成功后的回调参数对象OssCallbackParam
 * 当OSS上传成功后，会根据该配置参数来回调对应接口。
 */
@Setter
@Getter
public class OssCallbackParam {
    @ApiModelProperty("请求的回调地址")
    private String callbackUrl;
    @ApiModelProperty("回调是传入request中的参数")
    private String callbackBody;
    @ApiModelProperty("回调时传入参数的格式，比如表单提交形式")
    private String callbackBodyType;

    //省略了所有getter,setter方法
}
