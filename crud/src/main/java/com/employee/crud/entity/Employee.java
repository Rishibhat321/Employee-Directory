package com.employee.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int id;

    @Column(name= "First_Name")
    private String firstName;

    @Column(name= "Last_Name")
    private String lastName;

    @Column(name= "Email")
    private String email;

    @Column(name= "Department")
    private String department;

    @Column(name= "Designation")
    private String designation;

    @Column(name= "Mobile_Number")
    private String phoneNumber;

    @Column(name= "salary")
    private double salary;

    @Column(name= "Location")
    private String location;

    @Column(name= "Joining_Date")
    private String joiningDate;

    @Column(name= "Reporting_Manager")
    private String reportingManager;

    // define constructors
    public Employee() {

    }

    public Employee(String department, String designation, String email, String firstName, String joiningDate, String lastName, String location, String phoneNumber, String reportingManager, double salary) {
        this.department = department;
        this.designation = designation;
        this.email = email;
        this.firstName = firstName;
        this.joiningDate = joiningDate;
        this.lastName = lastName;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.reportingManager = reportingManager;
        this.salary = salary;
    }

    // define getters/setters


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // define toString method


    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", joiningDate='" + joiningDate + '\'' +
                ", reportingManager='" + reportingManager + '\'' +
                '}';
    }

}
