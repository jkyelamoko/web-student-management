package com.home.dev.dao;

import com.home.dev.model.Student;

import java.util.List;

public interface StudentDAO {

    boolean saveStudent(Student student);
    List<Student> getStudents();
    boolean deleteStudent(Student student);
    List<Student> getStudentById(Student student);
    boolean updateStudent(Student student);
}
