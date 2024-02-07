package com.chaitu.springboot.APIdemo.DAO;

import com.chaitu.springboot.APIdemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
