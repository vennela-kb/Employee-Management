package com.practice.empproject.services;

import com.practice.empproject.model.Employee;

import java.util.List;

public interface EmpService {
    Employee addEmployee(Employee employee);

    List<Employee> getTotalEmployees();

    void deleteEmployee(Integer id);

    Employee updateEmployeeData(Integer id, Employee employee);

    Employee empData(Integer id);
}
