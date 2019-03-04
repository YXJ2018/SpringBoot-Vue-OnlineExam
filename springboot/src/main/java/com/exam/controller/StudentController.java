package com.exam.controller;

import com.exam.entity.ApiResult;
import com.exam.entity.Student;
import com.exam.serviceimpl.StudentServiceImpl;
import com.exam.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/students")
    public ApiResult findAll() {
        return ApiResultHandler.success(studentService.findAll());
    }

    @GetMapping("/student/{studentId}")
    public ApiResult findById(@PathVariable("studentId") Integer studentId) {
        return ApiResultHandler.success(studentService.findById(studentId));
    }

    @DeleteMapping("/student/{studentId}")
    public ApiResult deleteById(@PathVariable("studentId") Integer studentId) {
        return ApiResultHandler.success(studentService.deleteById(studentId));
    }

    @PutMapping("/student/{studentId}")
    public ApiResult update(@PathVariable("studentId") Integer studentId, Student student) {
        return ApiResultHandler.success(studentService.update(student));
    }

    @PostMapping("/student")
    public ApiResult add(Student student) {
        return ApiResultHandler.success(studentService.add(student));
    }
}
