package com.example.demo.services;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entities.EmployeeEntity;
import com.example.demo.repositories.EmployeeRepository;

public class EmployeeService {
    //repo in service layer and service in presentation layer
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeById(Long id){
        EmployeeEntity employeeEntity= employeeRepository.findById(id).orElse(null);
//        ModelMapper mapper=new ModelMapper();
        //not a right way in spring we creatre a bean
        return modelMapper.map(employeeEntity,EmployeeDTO.class);



    }
    //use model mapper to map it
}
