package com.cbu.hospitaloop.service;

import com.cbu.hospitaloop.dto.UserDto;
import com.cbu.hospitaloop.model.User;
import com.cbu.hospitaloop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(UserDto userDto){
        User user = new User();
        user.setFirstName(userDto.firstName);
        user.setLastName(userDto.lastName);
        user.setIdentityNumber(userDto.identityNumber);
        userRepository.save(user);
        System.out.println(user.getFirstName() + user.getLastName());
        System.out.println(userDto.firstName + userDto.lastName);
        return user;
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

}
