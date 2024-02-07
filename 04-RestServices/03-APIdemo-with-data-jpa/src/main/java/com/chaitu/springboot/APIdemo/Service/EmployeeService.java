package com.chaitu.springboot.APIdemo.Service;

import com.chaitu.springboot.APIdemo.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
