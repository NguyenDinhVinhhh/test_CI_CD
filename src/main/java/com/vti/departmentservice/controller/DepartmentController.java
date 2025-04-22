package com.vti.departmentservice.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.departmentservice.dto.DepartmentDTO;
import com.vti.departmentservice.entity.Department;
import com.vti.departmentservice.service.IDepartmentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/api/v1/departments")
@RequiredArgsConstructor
public class DepartmentController {
    private final IDepartmentService dpService;
    private final ModelMapper modelMapper;

    @GetMapping
    public List<DepartmentDTO> getListAccounts() {
    
        List<Department> departments = dpService.getListDepartments();
        
        List<DepartmentDTO> listDpDTO = modelMapper.map(
            departments,  
            new TypeToken <List<DepartmentDTO>> () {}.getType()
        );
        
        return listDpDTO;
    }

    @GetMapping("/account/{acId}")
    public List<DepartmentDTO> getDepartmentsByAccountId(@PathVariable int acId) {
    
        List<Department> departments = dpService.getDepartmentsByAccountId(acId);

        List<DepartmentDTO> listDpDTO = modelMapper.map(
            departments,  
            new TypeToken <List<DepartmentDTO>> () {}.getType()
        );
        
        return listDpDTO;
    }

    @GetMapping("/{id}")
    public DepartmentDTO getDepartmentById(@PathVariable int id) {
    
        Department department = dpService.getDepartmentById(id);
        
        DepartmentDTO dpDTO = modelMapper.map(
            department,  
            DepartmentDTO.class
        );
        
        return dpDTO;
    }
} 
