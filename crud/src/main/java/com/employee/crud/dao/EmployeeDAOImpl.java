package com.employee.crud.dao;

import com.employee.crud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private EntityManager entityManager;

    // set up constructor Injection
    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);

        List<Employee> theEmployees = theQuery.getResultList();

        return theEmployees;
    }

    @Override
    public Employee findById(int theId) {
        // retrieve employee by id
        Employee theEmployee = entityManager.find(Employee.class, theId);

        if(theEmployee==null) {
            throw new RuntimeException("Employee id - " + theId + " not found");
        }

        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        return entityManager.merge(theEmployee);
    }

    @Override
    public void deleteById(int theId) {

        Employee theEmployee = entityManager.find(Employee.class, theId);

        if(theEmployee!=null) {
            entityManager.remove(theEmployee);
        }

    }


}
