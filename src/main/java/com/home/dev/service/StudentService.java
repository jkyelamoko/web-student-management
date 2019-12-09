package com.home.dev.service;

import com.home.dev.model.Student;

import java.util.List;

public interface StudentService {
    public boolean saveStudent(Student student);
    public List<Student> getStudents();
    public boolean deleteStudent(Student student);
    public List<Student> getStudentById(Student student);
    public boolean updateStudent(Student student);
}
