package com.exam.mapper;

import com.exam.entity.Admin;
import com.exam.entity.Student;
import com.exam.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LoginMapper {

    @Select("select * from admin where adminId = #{username} and pwd = #{password}")
    public Admin adminLogin(Integer username, String password);

    @Select("select * from teacher where teacherId = #{username} and pwd = #{password}")
    public Teacher teacherLogin(Integer username, String password);

    @Select("select * from student where studentId = #{username} and pwd = #{password}")
    public Student studentLogin(Integer username,String password);
}
