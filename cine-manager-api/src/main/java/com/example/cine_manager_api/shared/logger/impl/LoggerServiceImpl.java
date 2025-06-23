package com.example.cine_manager_api.shared.logger.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.cine_manager_api.shared.logger.LoggerService;

@Service
public class LoggerServiceImpl implements LoggerService {

  private final Logger logger;

  public LoggerServiceImpl() {
    this.logger = LoggerFactory.getLogger(LoggerServiceImpl.class);
  }

  @Override
  public void info(String message) {
    logger.info(message);
  }

}
