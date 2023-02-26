package com.practice.empproject.repository;

import com.practice.empproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Repository helps you get data from DB and performs necessary actions
//This repository inherits all the methods from JPA repository
public interface EmpRespository extends JpaRepository<Employee,Integer> {

}
