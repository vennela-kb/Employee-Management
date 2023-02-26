package com.practice.empproject.controller;

import com.practice.empproject.model.Employee;
import com.practice.empproject.services.EmpService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // To make this controller as a webservice we need to use Rest Controller Annotation and make it as a rest webservice
//@Tag(name = "employee mangement" , description = "This project handles employee management")
@RequestMapping("/api/v1/empmanagement")
public class EmpController {
    private String message="I am message";

    @Autowired
    private EmpService empService;  //Dependency Injection: In this case your service will be available in the Controller class using AutoWired

    @Operation(summary = "add employee")
   /* @ApiResponse(content = {
            @ApiResponse(responseCode = "200" ,content = {
                    @content(schema = @Schema(implementation = Employee.class), mediaType = "application/json")
            }),
            @ApiResponse(responseCode = "500",content = {
                    @Content(schema = @Schema(implementation = ErrorResponse.class), mediaType = "application/json")
            }),
    })
*?
    /* Add Employee */
    @PostMapping("/newemp")
    private Employee addNewEmployee(@RequestBody Employee employee){
        return this.empService.addEmployee(employee);
    }


    @Operation(summary = "fetch all employee")
    //get all Employees
    @GetMapping("/emps")
    public List<Employee> getAllEmployees(){
        return this.empService.getTotalEmployees();
    }
    @Operation(summary = "delete employee")
    //delete Employee
    @DeleteMapping("/emps/{id}")
    public void deleteEmp(@PathVariable Integer id){
        this.empService.deleteEmployee(id);

    }

    @Operation(summary = "update employee")
    //Update Existing employee
    @PutMapping("/{id}")
    public Employee updateDataSet(@PathVariable Integer id, @RequestBody Employee employee) {
        return this.empService.updateEmployeeData(id,employee);

    }

    @Operation(summary = "get single employee")
    //get single employee
    @GetMapping("/{id}")
    public Employee getEmpData(@PathVariable Integer id){
        return this.empService.empData(id);
    }
    @GetMapping("/Welcome")
    public String getMessage(){return this.message;}
}
