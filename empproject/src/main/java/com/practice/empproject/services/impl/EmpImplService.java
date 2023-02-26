package com.practice.empproject.services.impl;

import com.practice.empproject.model.Employee;
import com.practice.empproject.repository.EmpRespository;
import com.practice.empproject.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Here we write the business logic, this is the service layer
@Service
public class EmpImplService implements EmpService {

    @Autowired
    private EmpRespository empRespository;



    @Override
    public Employee addEmployee(Employee employee) {
        return this.empRespository.save(employee);
    }

    @Override
    public List<Employee> getTotalEmployees() {
        return this.empRespository.findAll();
    }

    @Override
    public void deleteEmployee(Integer id) {
        this.empRespository.deleteById(id);
    }

    @Override
    public Employee updateEmployeeData(Integer id, Employee employee) {
       Employee employee1 = this.empRespository.findById(id).get();// Checking the employee using Id

       employee1.setEmpName(employee.getEmpName());
       employee1.setEmpEmail(employee.getEmpEmail());
       employee1.setEmpDesignation(employee.getEmpDesignation());
       this.empRespository.save(employee1);
        return employee1;
    }

    @Override
    public Employee empData(Integer id) {
        return this.empRespository.findById(id).get();
    }
}
