package com.example.cine_manager_api.modules.user.service.impl;

import org.springframework.stereotype.Service;

import com.example.cine_manager_api.modules.user.service.UserService;
import com.example.cine_manager_api.modules.user.domain.User;
import com.example.cine_manager_api.modules.user.dto.RequestCreateUserDto;
import com.example.cine_manager_api.modules.user.dto.ResponseCreateUserDto;
import com.example.cine_manager_api.modules.user.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

  private final UserMapper userMapper;

  public UserServiceImpl(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @Override
  public ResponseCreateUserDto create(RequestCreateUserDto requestCreateUserDto) {
    User user = userMapper.requestCreateUserDtoToDomain(requestCreateUserDto);

    return userMapper.domainToResponseCreateUserDto(user);
  }

}
