package com.veltech.task8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.veltech.task8.model.Employee;
import com.veltech.task8.repository.EmployeeRepository;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void createEmployee(int id, String name, double salary) {
        Employee emp = new Employee(id, name, salary);
        repository.addEmployee(emp);
    }

    public void displayEmployees() {
        repository.getAllEmployees().forEach(System.out::println);
    }
}