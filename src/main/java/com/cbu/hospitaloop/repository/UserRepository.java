package com.cbu.hospitaloop.repository;

import com.cbu.hospitaloop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
