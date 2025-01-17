package com.employee.crud.service;

import com.employee.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

    List<Employee> findByDepartment(String department);

    List<Employee> findByLocation(String location);

    List<Employee> findByEmail(String email);


}
