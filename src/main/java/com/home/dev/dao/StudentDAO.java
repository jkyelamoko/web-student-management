package com.home.dev.dao;

import com.home.dev.model.Student;

import java.util.List;

public interface StudentDAO {

    public boolean saveStudent(Student student);
    public List<Student> getStudents();
    public boolean deleteStudent(Student student);
    public List<Student> getStudentById(Student student);
    public boolean updateStudent(Student student);
}
