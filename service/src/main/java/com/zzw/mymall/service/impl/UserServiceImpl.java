package com.zzw.mymall.service.impl;

import com.zzw.mymall.dao.UserDao;
import com.zzw.mymall.entity.User;
import com.zzw.mymall.service.UserService;
import com.zzw.mymall.vo.ResultVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 张志伟
 * @version v1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public ResultVo checkLogin(String username, String password) {
        //根据账号查询用户信息
        User user = userDao.queryUserByName(username);
        //判断是否成功
        if (user == null){
            //用户名不存在
            return new ResultVo(101,"用户名不存在",null);
        }else {
            //使用加密后的密码和得到的密码进行匹配
            if(user.getUserPwd().equals(password)) {
                //验证成功
                return new ResultVo(200,"登录成功",user);
            }else {
                //密码错误
                return new ResultVo(102,"密码错误",null);
            }
        }
    }

}
