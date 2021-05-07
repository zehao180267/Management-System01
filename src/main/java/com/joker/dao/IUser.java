package com.joker.dao;

import com.joker.bean.User;
import org.apache.ibatis.annotations.Param;

public interface IUser {
    User queryOne(@Param("id") String id, @Param("password") String password);
}
