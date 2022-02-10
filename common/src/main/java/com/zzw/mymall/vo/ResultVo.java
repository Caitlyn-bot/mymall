package com.zzw.mymall.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 张志伟
 * @version v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ResultVo对象", description = "封装接口返回给前端的数据")
public class ResultVo {
    /**
     * 响应给前端的状态码
     */
    @ApiModelProperty(value = "响应状态码",dataType = "int")
    private int code;
    /**
     * 响应给前端的提示信息
     */
    @ApiModelProperty(value = "响应提示信息",dataType = "String")
    private String message;
    /**
     * 响应给前端的数据
     */
    @ApiModelProperty(value = "响应数据",dataType = "Object")
    private Object data;
}
