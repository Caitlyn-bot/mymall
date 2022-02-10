package com.zzw.mymall.dao;

import com.zzw.mymall.entity.User;

/**
 * @author 张志伟
 * @version v1.0
 */
public interface UserDao {
    /**
     * 根据名称查找用户信息
     * @param username
     * @return
     */
    public User queryUserByName(String username);
}
