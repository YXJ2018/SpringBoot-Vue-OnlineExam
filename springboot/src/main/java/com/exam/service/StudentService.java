package com.exam.service;

import com.exam.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findById(Integer studentId);

    int deleteById(Integer studentId);

    int update(Student student);

    int updatePwd(Student student);
    int add(Student student);
}
