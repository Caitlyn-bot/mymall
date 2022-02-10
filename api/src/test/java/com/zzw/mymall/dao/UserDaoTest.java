package com.zzw.mymall.dao;

import com.zzw.mymall.ApiApplication;
import com.zzw.mymall.entity.User;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author 张志伟
 * @version v1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @org.junit.Test
    public void queryUserByName() {
        User user = userDao.queryUserByName("张三");
        System.out.println(user);
    }
}
