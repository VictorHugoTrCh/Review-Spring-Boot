package com.pe.victor.review01.service.impl;

import com.pe.victor.review01.model.Patient;
import com.pe.victor.review01.repo.IPatientRepo;
import com.pe.victor.review01.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements IPatientService {

    @Autowired
    private IPatientRepo repo;


    @Override
    public Patient register(Patient patient) throws Exception {
        return repo.save(patient);
    }

    @Override
    public Patient modify(Patient patient) throws Exception {
        return repo.save(patient);
    }

    @Override
    public List<Patient> list() throws Exception {
        return repo.findAll();
    }

    @Override
    public Patient listById(Integer id) throws Exception {
        Optional<Patient> op = repo.findById(id);
        return op.isPresent() ? op.get() : new Patient();
    }

    @Override
    public void eliminate(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
