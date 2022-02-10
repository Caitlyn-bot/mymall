package com.zzw.mymall.controller;

import com.zzw.mymall.entity.User;
import com.zzw.mymall.service.UserService;
import com.zzw.mymall.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 张志伟
 * @version v1.0
 */
@Controller
@ResponseBody
@RequestMapping("/user")
@Api(value = "提供用户登录、注册的相关接口",tags = "用户管理")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String", name = "username", value = "用户登录账号", required = true),
            @ApiImplicitParam(dataType = "String", name = "password", value = "用户登录密码", required = true)
    })
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResultVo login(
            @RequestParam(value = "username",defaultValue = "zzw") String username,
            @RequestParam(value = "password",defaultValue = "zzw123") String password){
        return userService.checkLogin(username, password);
    }

    @ApiOperation("用户注册接口")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResultVo register(User user){
        System.out.println("register");
        return new ResultVo(10000, "SUCESS", null);
    }

}
