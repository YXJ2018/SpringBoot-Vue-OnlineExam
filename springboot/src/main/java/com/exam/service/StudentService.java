package com.exam.service;

import com.exam.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();

    public Student findById(Integer studentId);

    public int deleteById(Integer studentId);

    public int update(Student student);

    public int add(Student student);
}
