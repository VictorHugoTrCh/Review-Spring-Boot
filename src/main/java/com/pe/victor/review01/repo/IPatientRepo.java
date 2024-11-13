package com.pe.victor.review01.repo;

import com.pe.victor.review01.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends JpaRepository<Patient, Integer> {

}
