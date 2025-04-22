package com.vti.departmentservice.service;

import java.util.List;

import com.vti.departmentservice.entity.Department;

public interface IDepartmentService {
    List<Department> getListDepartments();
    List<Department> getDepartmentsByAccountId(int acId);
    Department getDepartmentById(int id);
}
