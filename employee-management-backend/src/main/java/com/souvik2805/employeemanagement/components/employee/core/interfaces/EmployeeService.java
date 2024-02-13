package com.souvik2805.employeemanagement.components.employee.core.interfaces;

import com.souvik2805.employeemanagement.components.employee.core.entity.Employee;

import java.util.List;

public interface EmployeeService {
    // Create
    void addEmployee(Employee employee);

    // Read
    Employee getEmployeeById(String employeeId);


    List<Employee> getAllEmployees();

    // Update
    void updateEmployee(Employee employee);

    // Delete
    void deleteEmployee(String employeeId);
}
