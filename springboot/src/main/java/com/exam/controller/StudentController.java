package com.exam.controller;

import com.exam.entity.Student;
import com.exam.serviceimpl.StudentServiceImpl;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/student/{studentId}")
    public Student findById(@PathVariable("studentId") Integer studentId) {
        return studentService.findById(studentId);
    }
    @DeleteMapping("/student/{studentId}")
    public int deleteById(@PathVariable("studentId") Integer studentId) {
        return studentService.deleteById(studentId);
    }

    @PutMapping("/student/{studentId}")
    public int update(@PathVariable("studentId") Integer studentId, Student student) {
        return studentService.update(student);
    }
    @PostMapping("/student")
    public int add(Student student) {
        return studentService.add(student);
    }
}
