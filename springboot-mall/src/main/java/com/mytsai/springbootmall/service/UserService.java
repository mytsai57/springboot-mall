package com.mytsai.springbootmall.service;

import com.mytsai.springbootmall.dto.UserLoginRequest;
import com.mytsai.springbootmall.dto.UserRegisterRequest;
import com.mytsai.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
