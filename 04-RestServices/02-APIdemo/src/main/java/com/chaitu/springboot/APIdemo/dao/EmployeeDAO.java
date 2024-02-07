package com.chaitu.springboot.APIdemo.dao;

import com.chaitu.springboot.APIdemo.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findeAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
