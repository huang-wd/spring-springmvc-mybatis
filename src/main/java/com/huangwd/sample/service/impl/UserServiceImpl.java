package com.huangwd.sample.service.impl;

import com.huangwd.sample.dao.UserDao;
import com.huangwd.sample.entity.User;
import com.huangwd.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by huangweidong@live on 2017/4/15.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAllList() {
        return userDao.findAllList();
    }
}
