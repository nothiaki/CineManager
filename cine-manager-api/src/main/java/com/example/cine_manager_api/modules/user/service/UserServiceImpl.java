package com.example.cine_manager_api.modules.user.service;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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


    if(emailAlreadyExists(newUser.getEmail())) {
      throw new ResponseStatusException(HttpStatus.CONFLICT, "Email already in use");
    }

    if(usernameAlreadyExists(newUser.getUsername())) {
      throw new ResponseStatusException(HttpStatus.CONFLICT, "Username already in use");
    }

    newUser.setPasswordHash(newUser.getPasswordHash() + "#!&jkd");
    newUser.setCreatedAt(LocalDate.now());
    newUser.setUpdatedAt(LocalDate.now());
    newUser.setRole(Role.COSTUMER);
    newUser.setActive(true);

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

  public boolean emailAlreadyExists(String email) {
    return userRepositoryPort.existsByEmail(email);
  }

  public boolean usernameAlreadyExists(String username) {
    return userRepositoryPort.existsByUsername(username);
  }

}
