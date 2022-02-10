package com.zzw.mymall.entity;


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
@ApiModel(value = "User对象",description = "用户/买家信息")
public class User {
    @ApiModelProperty(dataType = "int", required = false)
    private int userId;
    @ApiModelProperty(dataType = "String", required = true, value = "用户账号")
    private String userName;
    @ApiModelProperty(dataType = "String", required = true, value = "用户密码")
    private String userPwd;

    private String nickName;
    @ApiModelProperty(dataType = "String", required = true, value = "真实姓名")
    private String realName;
    @ApiModelProperty(dataType = "String", required = true, value = "用户头像url")
    private String userImg;
    private String userMobile;
    private String userEmail;
    @ApiModelProperty(dataType = "String", required = true, value = "用户性别")
    private String userSex;
    private String userBirth;
    private String userRegTime;
    private String userModTime;
}
