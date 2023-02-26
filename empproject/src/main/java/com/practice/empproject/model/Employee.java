package com.practice.empproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter// It provides get method for all the variables
@Setter// It provides set method for all the variables
@AllArgsConstructor //It provides constructor with all Arguments
@NoArgsConstructor //It helps in creating empty constructor
@Entity //persists the particular table/data in the DB
public class Employee {

    @Id //it makes the below empId a primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //It generates employee ID automatically you dont have to give a specific number
    private Integer empId;
    private String empName;
    private String empDesignation;
    private String empEmail;


}
