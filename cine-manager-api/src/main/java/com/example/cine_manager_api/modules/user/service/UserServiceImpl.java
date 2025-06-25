package com.example.cine_manager_api.modules.user.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.example.cine_manager_api.shared.logger.LoggerService;
import com.example.cine_manager_api.modules.user.domain.user.User;
import com.example.cine_manager_api.modules.user.domain.user.UserRepositoryPort;
import com.example.cine_manager_api.modules.user.dto.RequestCreateUserDto;
import com.example.cine_manager_api.modules.user.dto.ResponseCreateUserDto;
import com.example.cine_manager_api.modules.user.enums.Role;
import com.example.cine_manager_api.modules.user.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

  private final UserMapper userMapper;
  private final LoggerService loggerService;
  private final UserRepositoryPort userRepositoryPort;

  public UserServiceImpl(
    UserMapper userMapper,
    LoggerService loggerService,
    UserRepositoryPort userRepositoryPort
  ) {
    this.userMapper = userMapper;
    this.loggerService = loggerService;
    this.userRepositoryPort = userRepositoryPort;
  }

  @Override
  public ResponseCreateUserDto create(RequestCreateUserDto requestCreateUserDto) {
    User newUser = userMapper.requestCreateUserDtoToDomain(requestCreateUserDto);

    newUser.setPasswordHash(newUser.getPasswordHash() + "#!&jkd");
    newUser.setCreatedAt(LocalDate.now());
    newUser.setUpdatedAt(LocalDate.now());
    newUser.setRole(Role.COSTUMER);
    newUser.isActive(true);

    User savedUser = userRepositoryPort.save(newUser);

    loggerService.info(
      new StringBuilder()
        .append("User with id: ")
        .append(savedUser.getId())
        .append(" was created")
      .toString()
    );

    return userMapper.domainToResponseCreateUserDto(savedUser);
  }

}
