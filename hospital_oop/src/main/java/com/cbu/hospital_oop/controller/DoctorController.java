package com.cbu.hospital_oop.controller;


import com.cbu.hospital_oop.service.DoctorService;
import com.cbu.hospital_oop.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private final DoctorService doctorService;


    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }
}
