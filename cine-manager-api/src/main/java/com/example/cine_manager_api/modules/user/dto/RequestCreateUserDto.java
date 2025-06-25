package com.example.cine_manager_api.modules.user.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public record RequestCreateUserDto(

  @NotEmpty(message = "Email should not be empty")
  @Email
  String email,

  @NotEmpty(message = "Full name should not be empty")
  @Size(min = 6, max = 100)
  String fullName,

  @NotEmpty(message = "Username should not be empty")
  @Size(min = 2, max = 16)
  String username,

  @NotEmpty(message = "Password should not be empty")
  @Size(min = 6, max = 26)
  String password,

  @NotNull(message = "Birth must not be null")
  @Past(message = "Birth must be in the past")
  LocalDate birth

) {}

