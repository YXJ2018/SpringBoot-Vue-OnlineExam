package com.exam.mapper;

import com.exam.entity.PaperManage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PaperMapper {
    @Select("select paperId, questionType,questionId from PaperManage")
    List<PaperManage> findAll();

    @Select("select paperId, questionType,questionId from PaperManage where paperId = #{paperId}")
    List<PaperManage> findById(Integer paperId);
}
