package com.demo.emplmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.emplmanager.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
