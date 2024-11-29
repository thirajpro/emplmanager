package com.demo.emplmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.emplmanager.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
