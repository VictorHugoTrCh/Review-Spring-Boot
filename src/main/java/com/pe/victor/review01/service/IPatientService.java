package com.pe.victor.review01.service;

import com.pe.victor.review01.model.Patient;

import java.util.List;

public interface IPatientService {

    Patient register(Patient patient) throws Exception;

    Patient modify(Patient patient) throws Exception;

    List<Patient> list() throws Exception;

    Patient listById(Integer id) throws Exception;

    void eliminate(Integer id) throws Exception;

}
