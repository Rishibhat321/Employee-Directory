package com.employee.crud.dao;

import com.employee.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee,Integer> {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

    List<Employee> findByDepartment(String department);

    List<Employee> findByLocation(String location);

    List<Employee> findByEmail(String email);


}
