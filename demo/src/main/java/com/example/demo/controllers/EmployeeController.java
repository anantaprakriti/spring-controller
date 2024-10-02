package com.example.demo.controllers;

import com.example.demo.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class EmployeeController {
    @GetMapping(path = "/")
    public String getMyName(){
        return "AViral Sharma";
    }
    @GetMapping("/employees/{EmployeeId")
    public EmployeeDTO getEmployeeById(@PathVariable String EmployeeId){
        return
    }


}
