package com.joker.service;

import com.joker.bean.User;

public interface UserService {
    User getUser(String id, String password);
}
