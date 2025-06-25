package com.example.cine_manager_api.modules.user.adapter.outbound.persistence;

import org.springframework.stereotype.Repository;

import com.example.cine_manager_api.modules.user.domain.user.User;
import com.example.cine_manager_api.modules.user.domain.user.UserRepositoryPort;
import com.example.cine_manager_api.modules.user.mapper.UserMapper;

@Repository
public class JpaUserRepositoryAdapter implements UserRepositoryPort {

  private final SpringDataJpaUserRepository springDataJpaUserRepository;
  private final UserMapper userMapper;

  public JpaUserRepositoryAdapter(
    SpringDataJpaUserRepository springDataJpaUserRepository,
    UserMapper userMapper
  ) {
    this.springDataJpaUserRepository = springDataJpaUserRepository;
    this.userMapper = userMapper;
  }

  @Override
  public User save(User user) {
    JpaUserEntity entity = userMapper.domainToJpaUserEntity(user);

    JpaUserEntity savedEntity = springDataJpaUserRepository.save(entity);

    return userMapper.jpaUserEntityToDomain(savedEntity);
  }

}
