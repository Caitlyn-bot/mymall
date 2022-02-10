package com.zzw.mymall.service;

import com.zzw.mymall.entity.User;
import com.zzw.mymall.vo.ResultVo;

/**
 * @author 张志伟
 * @version v1.0
 */
public interface UserService {
    /**
     * 检查登录
     * @param username
     * @param password
     * @return
     */
    public ResultVo checkLogin(String username, String password);
}
