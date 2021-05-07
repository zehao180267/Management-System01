package com.joker.service.Impl;

import com.joker.bean.User;
import com.joker.dao.IUser;
import com.joker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    IUser IUser;

    @Override
    public User getUser(String id, String password) {
        return IUser.queryOne(id,password);
    }
}
