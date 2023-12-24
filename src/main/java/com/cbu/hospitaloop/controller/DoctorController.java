package com.cbu.hospitaloop.controller;

import com.cbu.hospitaloop.dto.DoctorDto;
import com.cbu.hospitaloop.model.Doctor;
import com.cbu.hospitaloop.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //kullanıcının servise ulaşması için
@RequestMapping("/doctor")

public class DoctorController {

    private final DoctorService doktorService;    //servise ihtiyacı var servisi çağırdım.

    public DoctorController(DoctorService doktorService) {
        this.doktorService = doktorService;
    }

    @PostMapping("/create")     //creatın karşılığıdır
    public Doctor create(@RequestBody DoctorDto doctorDto){

        return doktorService.create(doctorDto);

    }

    @GetMapping
    public List<Doctor> getAll(){
        return doktorService.getAll();
    }


}
