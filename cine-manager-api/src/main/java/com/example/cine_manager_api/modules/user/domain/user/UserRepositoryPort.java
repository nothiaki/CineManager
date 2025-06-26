package com.example.cine_manager_api.modules.user.domain.user;

import com.example.cine_manager_api.modules.user.domain.user.User;

public interface UserRepositoryPort {

  public User save(User user);
  public boolean existsByEmail(String email);
  public boolean existsByUsername(String username);
}
