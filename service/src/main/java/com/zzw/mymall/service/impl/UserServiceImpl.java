package com.zzw.mymall.service.impl;

import com.zzw.mymall.dao.UsersMapper;
import com.zzw.mymall.entity.Users;
import com.zzw.mymall.service.UserService;
import com.zzw.mymall.util.MD5Utils;
import com.zzw.mymall.vo.ResStatus;
import com.zzw.mymall.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * @author 张志伟
 * @version v1.0
 */
@Service
@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    @Transactional
    public ResultVo userRegister(String username, String password){
        synchronized (this) {
            //这里锁this必须要保证所使用的是一个service对象，所以使用@Scope("singleton")注解来保证单例
            //1.根据用户名查询是否已经被注册
            Example example = new Example(Users.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("username",username);
            List<Users> users = usersMapper.selectByExample(example);
            if (users.size() == 0) {
                //2.如果没有被注册则进行注册操作
                String md5Password = MD5Utils.md5(password);
                Users user = new Users();
                user.setUsername(username);
                user.setPassword(md5Password);
                user.setUserImg("/img/default.png");
                user.setUserRegtime(new Date());
                user.setUserModtime(new Date());
                int res = usersMapper.insert(user);
                if (res > 0) {
                    return new ResultVo(100, "注册成功", null);
                } else {
                    return new ResultVo(102, "注册失败", null);
                }
            } else {
                return new ResultVo(101, "用户已经被注册", null);
            }
        }
    }

    @Override
    public ResultVo checkLogin(String username, String password) {
        //根据账号查询用户信息
        Example example = new Example(Users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username",username);
        List<Users> users = usersMapper.selectByExample(example);
        //判断是否成功
        if (users.size() == 0){
            //用户名不存在
            return new ResultVo(ResStatus.NO,"用户名不存在",null);
        }else {
            Users user = users.get(0);
            String md5Password = MD5Utils.md5(password);
            //使用加密后的密码和得到的密码进行匹配
            if(user.getPassword().equals(md5Password)) {
                //验证成功
                return new ResultVo(ResStatus.OK,"登录成功",user);
            }else {
                //密码错误
                return new ResultVo(ResStatus.NO,"密码错误",null);
            }
        }
    }

}
