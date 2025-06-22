package com.example.cine_manager_api.modules.user.dto;

import java.time.LocalDate;
import java.util.UUID;

import com.example.cine_manager_api.modules.user.enums.Role;

public record ResponseCreateUserDto(

  UUID id,
  String email,
  String fullName,
  String username,
  LocalDate birth,
  LocalDate createdAt,
  LocalDate updatedAt,
  Role role,
  boolean isActive

) {}
