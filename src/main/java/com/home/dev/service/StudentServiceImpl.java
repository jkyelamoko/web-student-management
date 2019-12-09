package com.home.dev.service;

import com.home.dev.dao.StudentDAO;
import com.home.dev.model.Student;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentdao;
    @Override
    public boolean saveStudent(Student student) {
        return studentdao.saveStudent(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentdao.getStudents();
    }

    @Override
    public boolean deleteStudent(Student student) {
        return studentdao.deleteStudent(student);
    }

    @Override
    public List<Student> getStudentById(Student student) {
        return studentdao.getStudentById(student);
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentdao.updateStudent(student);
    }
}
