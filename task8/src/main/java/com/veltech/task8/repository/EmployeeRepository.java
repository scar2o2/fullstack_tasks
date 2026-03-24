package com.veltech.task8.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.veltech.task8.model.Employee;

@Component
public class EmployeeRepository {

    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }
}