package com.santosh.ems.Employee_Service.repository;

import com.santosh.ems.Employee_Service.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//    Employee findByName(String name);
//    Employee findByDepartment(String department);
//    Employee findByDesignation(String designation);
//    Employee findByEmail(String email);
//    Employee findByPhone(String phone);
//    Employee findByAddress(String address);
}
