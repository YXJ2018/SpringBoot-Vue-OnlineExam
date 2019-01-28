package com.exam.service;

import com.exam.entity.Admin;
import com.exam.mapper.AdminMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AdminService{

    public List<Admin> findAll();

    public Admin findById(Integer adminId);

    public int deleteById(int adminId);

    public int update(Admin admin);

    public int add(Admin admin);
}
