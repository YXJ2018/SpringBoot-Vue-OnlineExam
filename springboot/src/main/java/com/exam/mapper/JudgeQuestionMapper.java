package com.exam.mapper;

import com.exam.entity.JudgeQuestions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//判断题

@Mapper
public interface JudgeQuestionsMapper {

    @Select("select * from JudgeQuestions where questionId in (select questionId from PaperManage where questionType = 3 and paperId = #{paperId})")
    List<JudgeQuestions> findByIdAndType(Integer paperId);
}
