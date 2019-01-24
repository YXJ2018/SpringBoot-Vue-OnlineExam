package com.exam.controller;

import com.exam.entity.Admin;
import com.exam.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminController {
    private AdminService adminService;
    @Autowired
    public AdminController(AdminService adminService){
        this.adminService = adminService;
    }

    @GetMapping("/admins")
    public List<Admin> findAll(){
        System.out.println("查询全部");
        return adminService.findAll();
    }

    @GetMapping("/admin/{adminId}")
    public Admin findById(@PathVariable("adminId") Integer adminId){
        System.out.println("根据ID查找");
        return adminService.findById(adminId);
    }

    @DeleteMapping("/admin/{adminId}")
    public int deleteById(@PathVariable("adminId") Integer adminId){
        return adminService.deleteById(adminId);
    }

    @PutMapping("/admin/{adminId}")
    public int update(@PathVariable("adminId") Integer adminId,Admin admin){
        return adminService.update(admin);
    }

    @PostMapping("/admin")
    public int add(Admin admin){
        return adminService.add(admin);
    }
}
