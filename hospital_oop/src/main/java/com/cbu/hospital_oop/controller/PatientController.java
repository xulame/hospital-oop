package com.cbu.hospital_oop.controller;

import com.cbu.hospital_oop.service.DoctorService;
import com.cbu.hospital_oop.service.PatientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
}
