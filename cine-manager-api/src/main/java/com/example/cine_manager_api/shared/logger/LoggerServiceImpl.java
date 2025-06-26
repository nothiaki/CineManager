package com.example.cine_manager_api.shared.logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService {

  @Override
  public void info(Class<?> clazz, String message, Object... args) {
    LoggerFactory.getLogger(clazz).info(message, args);
  }

}
