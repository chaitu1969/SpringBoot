package com.chaitu.CRUDdemo.DAO;

import com.chaitu.CRUDdemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    // implement save method

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student find(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
//        create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student ",Student.class);
//        return query results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String LastName) {
       TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:thedata",Student.class);
//       set Query Parameters
        theQuery.setParameter("thedata",LastName);

        return theQuery.getResultList();

    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student studentById = entityManager.find(Student.class,id);
        entityManager.remove(studentById);
    }

    @Override
    @Transactional
    public int deleteAll() {

        int numOfRowsDeleted = entityManager.createQuery("DELETE FROM Student WHERE lastName='updatedName' ").executeUpdate();
        return numOfRowsDeleted;


    }
}
