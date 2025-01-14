package com.employee.crud.rest;

import com.employee.crud.entity.Employee;
import com.employee.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    // set up constructor Injection
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        this.employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.findAll();

    }

    @GetMapping("/employees/{theId}")
    public Employee getEmployeeById(@PathVariable int theId) {

        Employee theEmployee =  employeeService.findById(theId);

        if(theEmployee==null) {
            throw new RuntimeException("Employee id - " + theId + " not found");
        }

        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee createNewEmployee(@RequestBody Employee theEmployee) {

        theEmployee.setId(0);

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee UpdateEmployee(@RequestBody Employee theEmployee) {

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    @DeleteMapping("/employees/{theId}")
    public String deleteEmployee(@PathVariable int theId) {

        Employee theEmployee = employeeService.findById(theId);

        if(theEmployee==null) {
            throw new RuntimeException("Employee id - " + theId + " not found");
        }

        employeeService.deleteById(theId);

        return "Deleted Employee Id - " + theId;
    }



}
