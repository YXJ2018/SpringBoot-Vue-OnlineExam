package com.exam.controller;

import com.exam.entity.Teacher;
import com.exam.serviceimpl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    private TeacherServiceImpl teacherService;
    @Autowired
    public TeacherController(TeacherServiceImpl teacherService){
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers")
    public List<Teacher> findAll(){
        return teacherService.findAll();
    }

    @GetMapping("/teacher/{teacherId}")
    public Teacher findById(@PathVariable("teacherId") Integer teacherId){
        return teacherService.findById(teacherId);
    }

    @DeleteMapping("/teacher/{teacherId}")
    public int deleteById(@PathVariable("teacherId") Integer teacherId){
        return teacherService.deleteById(teacherId);
    }

    @PutMapping("/teacher/{teacherId}")
    public int update(@PathVariable("teacherId") Integer adminId,Teacher teacher){
        return teacherService.update(teacher);
    }

    @PostMapping("/teacher")
    public int add(Teacher teacher){
        return teacherService.add(teacher);
    }
}
