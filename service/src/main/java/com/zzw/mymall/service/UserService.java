package com.zzw.mymall.service;

import com.zzw.mymall.vo.ResultVo;

/**
 * @author 张志伟
 * @version v1.0
 */
public interface UserService {
    /**
     * 用户注册
     * @param username
     * @param password
     * @return
     */
    public ResultVo userRegister(String username, String password);
    /**
     * 检查登录
     * @param username
     * @param password
     * @return
     */
    public ResultVo checkLogin(String username, String password);
}
