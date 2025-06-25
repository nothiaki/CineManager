package com.example.cine_manager_api.modules.user.domain.user;

import java.time.LocalDate;
import java.util.UUID;
import com.example.cine_manager_api.modules.user.enums.Role;

public class User {

  private UUID id;

  private String email;
  private String fullName;
  private String username;
  private String passwordHash;

  private LocalDate birth;
  private LocalDate createdAt;
  private LocalDate updatedAt;

  private Role role;
  private boolean isActive;

  public User() {}

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPasswordHash() {
    return passwordHash;
  }

  public void setPasswordHash(String passwordHash) {
    this.passwordHash = passwordHash;
  }

  public LocalDate getBirth() {
    return birth;
  }

  public void setBirth(LocalDate birth) {
    this.birth = birth;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDate getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDate updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public boolean isActive() {
    return isActive;
  }

  public void isActive(boolean isActive) {
    this.isActive = isActive;
  }

}

