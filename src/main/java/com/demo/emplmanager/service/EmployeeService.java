package com.demo.emplmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.comparator.Comparators;

import com.demo.emplmanager.models.Employee;
import com.demo.emplmanager.repository.EmployeeRepository;

import java.util.Comparator;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(Long pageIndex, Long pageSize) {
        Pageable pageable = Pageable.ofSize(pageSize.intValue()).withPage(pageIndex.intValue());
        employeeRepository.findAll(pageable);
        List<Employee> employees = employeeRepository.findAll();
        employees.sort(Comparators.comparable());
        return employees;
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}