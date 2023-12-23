package com.cbu.hospital_oop.repository;

import com.cbu.hospital_oop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YonetimRepository extends JpaRepository<User, Integer> {
}
