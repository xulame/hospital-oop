package com.cbu.hospitaloop.repository;

import com.cbu.hospitaloop.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
    //bunu elimle SQL kodu yazmak için oluşturdum

}
