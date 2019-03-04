package com.exam.serviceimpl;

import com.exam.entity.Admin;
import com.exam.entity.Student;
import com.exam.entity.Teacher;
import com.exam.mapper.LoginMapper;
import com.exam.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Admin adminLogin(Integer username, String password) {
        return loginMapper.adminLogin(username,password);
    }

    @Override
    public Teacher teacherLogin(Integer username, String password) {
        return loginMapper.teacherLogin(username,password);
    }

    @Override
    public Student studentLogin(Integer username, String password) {
        return loginMapper.studentLogin(username,password);
    }
}
