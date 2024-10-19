package com.santosh.ems.Employee_Service.controller;


import com.santosh.ems.Employee_Service.model.Employee;
import com.santosh.ems.Employee_Service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/v1")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee) {
        {
            employeeService.addEmployee(employee);
        }
        return "Employee added";
    }

    @PostMapping("/addBulk")
    public String addEmployees(@RequestBody List<Employee> employees) {
        employeeService.addEmployees(employees);
        return "Employees added";
    }

    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        {
            employeeService.updateEmployee(id, employee);
        }
        return "Employee updated";
    }

    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
        return "Employee deleted";
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }


}
