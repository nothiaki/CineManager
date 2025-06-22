package com.example.cine_manager_api.modules.user.service;

import com.example.cine_manager_api.modules.user.dto.RequestCreateUserDto;
import com.example.cine_manager_api.modules.user.dto.ResponseCreateUserDto;

public interface UserService {

  public ResponseCreateUserDto create(RequestCreateUserDto requestCreateUserDto);

}
