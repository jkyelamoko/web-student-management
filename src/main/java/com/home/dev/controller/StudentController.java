package com.home.dev.controller;

import com.home.dev.model.Student;
import com.home.dev.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("save-student")
    public boolean saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("student-list")
    public List<Student> allStudents() {
        return studentService.getStudents();
    }

    @DeleteMapping("delete-student/{studentId}")
    public boolean deleteStudent(@PathVariable("studentId") Long studentId, Student student) {
        student.setId(studentId);
        return studentService.deleteStudent(student);
    }

    @GetMapping("student/{studentId}")
    public List<Student> allStudentById(@PathVariable("studentId") Long studentId, Student student) {
        student.setId(studentId);
        return studentService.getStudentById(student);
    }

    @PostMapping("update-student/{studentId}")
    public boolean updateStudent(@RequestBody Student student, @PathVariable("studentId") Long studentId) {
        student.setId(studentId);
        return studentService.updateStudent(student);
    }


}
