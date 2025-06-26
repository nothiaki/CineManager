package com.example.cine_manager_api.modules.user.adapter.outbound.persistence;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaUserRepository extends JpaRepository<JpaUserEntity, UUID> {

  public boolean existsByEmail(String email);
  public boolean existsByUsername(String username);

}
