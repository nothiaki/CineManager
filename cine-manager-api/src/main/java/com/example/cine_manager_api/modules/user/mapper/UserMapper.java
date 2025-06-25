package com.example.cine_manager_api.modules.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.cine_manager_api.modules.user.adapter.outbound.persistence.JpaUserEntity;
import com.example.cine_manager_api.modules.user.domain.user.User;
import com.example.cine_manager_api.modules.user.dto.RequestCreateUserDto;
import com.example.cine_manager_api.modules.user.dto.ResponseCreateUserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

  @Mapping(source = "password", target = "passwordHash")
  public User requestCreateUserDtoToDomain(RequestCreateUserDto requestCreateUserDto);

  public ResponseCreateUserDto domainToResponseCreateUserDto(User user);

  public User jpaUserEntityToDomain(JpaUserEntity jpaUserEntity);

  public JpaUserEntity domainToJpaUserEntity(User user);

}

