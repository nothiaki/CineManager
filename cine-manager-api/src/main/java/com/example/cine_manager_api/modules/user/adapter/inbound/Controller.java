package com.example.cine_manager_api.modules.user.adapter.inbound;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cine_manager_api.modules.user.dto.RequestCreateUserDto;

@RestController
@RequestMapping("/users")
public class Controller {

  @PostMapping
  public ResponseEntity<Void> create(@RequestBody RequestCreateUserDto userDto) {
    return ResponseEntity.ok().build();
  }

}
