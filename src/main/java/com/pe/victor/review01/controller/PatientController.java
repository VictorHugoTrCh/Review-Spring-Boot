package com.pe.victor.review01.controller;

import com.pe.victor.review01.model.Patient;
import com.pe.victor.review01.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private IPatientService service;


    @PostMapping
    public Patient register(@RequestBody Patient patient) throws Exception{
        return service.register(patient);
    }

    @PutMapping
    public Patient modify(@RequestBody Patient patient) throws Exception{
        return service.modify(patient);
    }

    @GetMapping
    public List<Patient> list() throws Exception{
        return service.list();
    }

    @GetMapping("/{id}")
    public Patient listById(@PathVariable("id") Integer id) throws Exception{
        return service.listById(id);
    }

    @DeleteMapping("/{id}")
    public void eliminate(@PathVariable("id") Integer id) throws Exception{
        service.eliminate(id);
    }

}
