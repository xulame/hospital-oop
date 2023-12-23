package com.cbu.hospital_oop.service;

import com.cbu.hospital_oop.model.Doctor;
import com.cbu.hospital_oop.repository.DoctorRepository;
import com.cbu.hospital_oop.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }


}
