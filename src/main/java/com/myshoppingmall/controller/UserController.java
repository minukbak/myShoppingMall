package com.myshoppingmall.controller;

import com.myshoppingmall.dto.UserDto;
import com.myshoppingmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/app/")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    public ResponseEntity<?> findAll() {
        UserDto userDto = new UserDto();
        userDto.setResultCode("200");
        userDto.setRes(userService.findAll());
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}