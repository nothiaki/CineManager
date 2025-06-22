package com.example.cine_manager_api.modules.user.adapter.inbound;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cine_manager_api.modules.user.service.UserService;
import com.example.cine_manager_api.modules.user.dto.RequestCreateUserDto;
import com.example.cine_manager_api.modules.user.dto.ResponseCreateUserDto;

@RestController
@RequestMapping("/users")
public class Controller {

  private final UserService userService;

  public Controller(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public ResponseEntity<ResponseCreateUserDto> create(@RequestBody RequestCreateUserDto requestCreateUserDto) {
    ResponseCreateUserDto responseCreateUserDto = userService.create(requestCreateUserDto);
    return new ResponseEntity<ResponseCreateUserDto>(responseCreateUserDto, HttpStatus.CREATED);
  }

}
