package com.example.cine_manager_api.modules.user.dto;

import java.time.LocalDate;

public record RequestCreateUserDto(

  String email,
  String fullName,
  String username,
  String password,
  LocalDate birth

) {}
