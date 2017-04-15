package com.huangwd.sample.dao;

import com.huangwd.sample.entity.User;

import java.util.List;

/**
 * Created by huangweidong@live on 2017/4/15.
 */
public interface UserDao {
    List<User> findAllList();
}
