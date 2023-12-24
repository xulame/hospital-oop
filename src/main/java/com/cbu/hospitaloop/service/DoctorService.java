package com.cbu.hospitaloop.service;

import com.cbu.hospitaloop.dto.DoctorDto;
import com.cbu.hospitaloop.model.Doctor;
import com.cbu.hospitaloop.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {


    private final DoctorRepository doktorRepozitory;

    public DoctorService(DoctorRepository doktorRepozitory) {
        this.doktorRepozitory = doktorRepozitory;
    }

    public Doctor create(DoctorDto doctorDto) {

        Doctor doctor = new Doctor();
        doctor.setDoctorName(doctorDto.doctorName);
        doctor.setDoctorSurname(doctorDto.doctorSurname);
        doctor.setProfession(doctorDto.profession);
        doctor.setWorkingHours(doctorDto.workingHours);
        doctor.setNumberOfPatients(doctorDto.numberOfPatients);
        doctor.setDoctorId(doctorDto.doctorId);
        doktorRepozitory.save(doctor);

        return doctor;
    }

    public List<Doctor> getAll(){
        return doktorRepozitory.findAll();
    }

}
