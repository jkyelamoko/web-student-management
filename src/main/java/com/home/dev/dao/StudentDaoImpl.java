package com.home.dev.dao;

import com.home.dev.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean saveStudent(Student student) {
        boolean status = false;
        try {
            sessionFactory.getCurrentSession().save(student);
            status = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Student> getStudents() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Student> query = currentSession.createQuery("from Student", Student.class);
        List<Student> list = query.getResultList();
        return list;
    }

    @Override
    public boolean deleteStudent(Student student) {
        boolean status = false;
        try {
            sessionFactory.getCurrentSession().delete(student);
            status = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public List<Student> getStudentById(Student student) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Student> query=currentSession.createQuery("from Student where studentid=:studentid", Student.class);
        query.setParameter("studentid", student.getId());
        List<Student> list = query.getResultList();
        return list;
    }

    @Override
    public boolean updateStudent(Student student) {
        boolean status = false;
        try {
            sessionFactory.getCurrentSession().update(student);
            status = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
