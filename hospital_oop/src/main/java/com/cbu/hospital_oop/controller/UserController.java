package com.cbu.hospital_oop.controller;

import com.cbu.hospital_oop.dto.UserDto;
import com.cbu.hospital_oop.model.User;

import com.cbu.hospital_oop.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public User create(@RequestBody UserDto userDto){
        return userService.create(userDto);
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }


}
