package com.microserviceB.serviceB.controller;

import com.microserviceB.serviceB.model.Employee;
import com.microserviceB.serviceB.service.EmpService;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/office")
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping("/off")
    public Employee InsertDetails(@RequestBody Employee employee) {
        return  empService.save(employee);
    }

    @GetMapping("/get")
    public List<Employee> getDetails () {
        return empService.findall();
    }
    @GetMapping("/get/{id}")
    public Optional<Employee> getByID (@PathVariable long id) {
        return empService.findById(id);
    }
}
