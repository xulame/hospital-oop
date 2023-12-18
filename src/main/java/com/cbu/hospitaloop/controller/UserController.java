package com.cbu.hospitaloop.controller;

import com.cbu.hospitaloop.dto.UserDto;
import com.cbu.hospitaloop.model.User;
import com.cbu.hospitaloop.service.UserService;
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
