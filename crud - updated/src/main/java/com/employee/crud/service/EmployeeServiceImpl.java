package com.employee.crud.service;

import com.employee.crud.dao.EmployeeDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.crud.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    // set up constructor Injection
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        this.employeeDAO = theEmployeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }

    @Override
    @Transactional
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }

    @Override
    public List<Employee> findByDepartment(String department) {
        List<Employee> theEmployees = employeeDAO.findByDepartment(department);
        return theEmployees;
    }

    @Override
    public List<Employee> findByLocation(String location) {
        List<Employee> theEmployees = employeeDAO.findByLocation(location);
        return theEmployees;
    }

    @Override
    public List<Employee> findByEmail(String email) {
        List<Employee> theEmployees = employeeDAO.findByEmail(email);
        return theEmployees;
    }


}
