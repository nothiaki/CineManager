package com.example.cine_manager_api.modules.user.service.impl;

import org.springframework.stereotype.Service;

import com.example.cine_manager_api.modules.user.service.UserService;
import com.example.cine_manager_api.modules.user.dto.RequestCreateUserDto;
import com.example.cine_manager_api.modules.user.dto.ResponseCreateUserDto;

@Service
public class UserServiceImpl implements UserService {

  @Override
  public ResponseCreateUserDto create(RequestCreateUserDto requestCreateUserDto) {
    return null;
  }

}
