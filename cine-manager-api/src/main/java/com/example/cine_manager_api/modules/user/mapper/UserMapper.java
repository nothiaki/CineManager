package com.example.cine_manager_api.modules.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.cine_manager_api.modules.user.domain.User;
import com.example.cine_manager_api.modules.user.dto.RequestCreateUserDto;
import com.example.cine_manager_api.modules.user.dto.ResponseCreateUserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

  @Mapping(source = "email", target = "email")
  @Mapping(source = "fullName", target = "fullName")
  @Mapping(source = "username", target = "username")
  @Mapping(source = "password", target = "passwordHash")
  @Mapping(source = "birth", target = "birth")
  public User requestCreateUserDtoToDomain(RequestCreateUserDto requestCreateUserDto);

  @Mapping(source = "id", target = "id")
  @Mapping(source = "email", target = "email")
  @Mapping(source = "fullName", target = "fullName")
  @Mapping(source = "username", target = "username")
  @Mapping(source = "birth", target = "birth")
  @Mapping(source = "createdAt", target = "createdAt")
  @Mapping(source = "updatedAt", target = "updatedAt")
  @Mapping(source = "role", target = "role")
  public ResponseCreateUserDto domainToResponseCreateUserDto(User user);

}

