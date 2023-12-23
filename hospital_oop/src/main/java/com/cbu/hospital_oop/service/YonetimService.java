package com.cbu.hospital_oop.service;

import com.cbu.hospital_oop.model.Yonetim;
import com.cbu.hospital_oop.repository.DoctorRepository;
import com.cbu.hospital_oop.repository.YonetimRepository;
import org.springframework.stereotype.Service;

@Service
public class YonetimService {

    private final YonetimRepository yonetimRepository;

    public YonetimService(YonetimRepository yonetimRepository) {
        this.yonetimRepository = yonetimRepository;
    }
}
