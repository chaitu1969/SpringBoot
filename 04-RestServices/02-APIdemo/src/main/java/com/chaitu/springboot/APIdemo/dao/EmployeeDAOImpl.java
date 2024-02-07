package com.chaitu.springboot.APIdemo.dao;


import com.chaitu.springboot.APIdemo.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

//    Define field for entityManager
    private final EntityManager entityManager;

//    Setup constructor injection
    @Autowired
    public EmployeeDAOImpl(EntityManager theentityManager){
        entityManager = theentityManager;

    }
    @Override
    public List<Employee> findeAll() {
//        create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
//        execute query
        //        return the list
        return theQuery.getResultList();
    }

    @Override
    public Employee findById(int theId) {
    //       get  Employee

        return entityManager.find(Employee.class, theId);
    }

    @Override
    public Employee save(Employee theEmployee) {
        return entityManager.merge(theEmployee);
    }

    @Override
    public void deleteById(int theId) {

    // find employee by ID
        Employee theEmployee = entityManager.find(Employee.class, theId);

        entityManager.remove(theEmployee);

    }


}
