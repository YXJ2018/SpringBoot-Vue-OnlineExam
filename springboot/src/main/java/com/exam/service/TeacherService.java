package com.exam.service;

import com.exam.entity.Teacher;

import java.util.List;

public interface TeacherService {

    public List<Teacher> findAll();

    public Teacher findById(Integer teacherId);

    public int deleteById(Integer teacherId);

    public int update(Teacher teacher);

    public int add(Teacher teacher);
}
