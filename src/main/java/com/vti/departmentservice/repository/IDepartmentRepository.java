package com.vti.departmentservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vti.departmentservice.entity.Department;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Integer>{

    @Query ("SELECT dp FROM Department dp JOIN dp.accounts ac WHERE ac.id = :id")
    List<Department> getDepartmentsByAccountId(@Param("id") int id);

    Department findAllById(int id);
}
