package com.chaitu.CRUDdemo.DAO;

import com.chaitu.CRUDdemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);
    Student find(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String LastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
