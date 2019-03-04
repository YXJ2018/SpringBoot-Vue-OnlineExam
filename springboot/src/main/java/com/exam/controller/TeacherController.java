package com.exam.controller;

import com.exam.entity.ApiResult;
import com.exam.entity.Teacher;
import com.exam.serviceimpl.TeacherServiceImpl;
import com.exam.util.ApiResultHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {

    private TeacherServiceImpl teacherService;
    @Autowired
    public TeacherController(TeacherServiceImpl teacherService){
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers")
    public ApiResult findAll(){
        return ApiResultHandler.success(teacherService.findAll());
    }

    @GetMapping("/teacher/{teacherId}")
    public ApiResult findById(@PathVariable("teacherId") Integer teacherId){
        return ApiResultHandler.success(teacherService.findById(teacherId));
    }

    @DeleteMapping("/teacher/{teacherId}")
    public ApiResult deleteById(@PathVariable("teacherId") Integer teacherId){
        return ApiResultHandler.success(teacherService.deleteById(teacherId));
    }

    @PutMapping("/teacher/{teacherId}")
    public ApiResult update(@PathVariable("teacherId") Integer adminId, Teacher teacher){
        return ApiResultHandler.success(teacherService.update(teacher));
    }

    @PostMapping("/teacher")
    public ApiResult add(Teacher teacher){
        return ApiResultHandler.success(teacherService.add(teacher));
    }
}
