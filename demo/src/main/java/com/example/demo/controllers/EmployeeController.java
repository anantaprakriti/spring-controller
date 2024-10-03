package com.example.demo.controllers;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path= "/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
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
        return EmployeeService.getEmployeeById(id).orElse(null);
    }


}
