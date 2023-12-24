package com.cbu.hospitaloop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //ıd yi kendi artıracak
    private int id;

    private String doctorName;
    private String doctorSurname;
    private int doctorId;
    private String profession;  //uzmanlık alanı
    private String workingHours; //çalışma saatleri
    private int numberOfPatients;  //hasta sayısı

    public Doctor() {     //her sınıf için yapılandırıcı  bu boş constructor

    }

    public Doctor(int id, String doctorName, String doctorSurname, int doctorId, String profession, String workingHours, int numberOfPatients) {
        this.id = id;
        this.doctorName = doctorName;
        this.doctorSurname = doctorSurname;
        this.doctorId = doctorId;
        this.profession = profession;
        this.workingHours = workingHours;
        this.numberOfPatients = numberOfPatients;   //dolu constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSurname() {
        return doctorSurname;
    }

    public void setDoctorSurname(String doctorSurname) {
        this.doctorSurname = doctorSurname;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }
}
