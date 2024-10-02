package com.example.demo.controllers;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path= "/employee")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(path = "/")
    public String getMyName(){
        return "AViral Sharma";
    }

    @PostMapping
    public String createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return "hello";
    }

    @PutMapping
    public String updateEmployeeById(){
        return "a";
    }

    @GetMapping(path="/{employeeId")
    public EmployeeEntity getEmployeeById(@RequestParam Long id){
        return EmployeeRepository.getById(id).orElse(null);
    }


}
