package com.microserviceB.serviceB.service;

import com.microserviceB.serviceB.model.Employee;
import com.microserviceB.serviceB.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    public Employee save(Employee employee) {
        return empRepo.save(employee);
    }

    public List<Employee> findall() {
        return empRepo.findAll();
    }


    public Optional<Employee> findById(long id) {
        return empRepo.findById(id);
    }
}
