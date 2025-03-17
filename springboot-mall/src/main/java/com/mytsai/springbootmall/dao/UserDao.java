package com.mytsai.springbootmall.dao;

import com.mytsai.springbootmall.dto.UserRegisterRequest;
import com.mytsai.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
