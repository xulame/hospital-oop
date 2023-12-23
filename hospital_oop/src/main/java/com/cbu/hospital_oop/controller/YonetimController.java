package com.cbu.hospital_oop.controller;

import com.cbu.hospital_oop.service.UserService;
import com.cbu.hospital_oop.service.YonetimService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yonetim")
public class YonetimController {
    private final YonetimService yonetimService;

    public YonetimController(YonetimService yonetimService) {
        this.yonetimService = yonetimService;
    }
}
