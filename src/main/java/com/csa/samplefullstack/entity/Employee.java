package com.csa.samplefullstack.entity;

import javax.persistence.*;
//import lombok.Data;


@Entity
@Table(name="tbl_employee")
//@Data - lombok; provides each data getters and setters
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeid;
    private String name;
    private String department;
    private String location;

    public Employee(Long employeeid, String name, String department, String location) {
        this.employeeid = employeeid;
        this.name = name;
        this.department = department;
        this.location = location;
    }
    
    public Employee(){
        //good practice
        //when initializing w/o parameters
    }

    public Long getEmployeeid() {
        return employeeid;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getLocation() {
        return location;
    }

    public void setEmployeeid(Long employeeid) {
        this.employeeid = employeeid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
}
