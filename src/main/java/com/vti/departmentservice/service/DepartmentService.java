package com.vti.departmentservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vti.departmentservice.entity.Department;
import com.vti.departmentservice.repository.IDepartmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentService implements IDepartmentService{
    private final IDepartmentRepository dpRepository;

    @Override
    public List<Department> getListDepartments() {
        return dpRepository.findAll();
    }

    @Override
    public List<Department> getDepartmentsByAccountId(int acId) {
        return dpRepository.getDepartmentsByAccountId(acId);
    }
    
    @Override
    public Department getDepartmentById(int id) {
        return dpRepository.findAllById(id);
    }
}
