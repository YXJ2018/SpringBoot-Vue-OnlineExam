package com.exam.mapper;

import com.exam.entity.JudgeQuestion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//判断题

@Mapper
public interface JudgeQuestionMapper {

    @Select("select * from JudgeQuestion where questionId in (select questionId from PaperManage where questionType = 3 and paperId = #{paperId})")
    List<JudgeQuestion> findByIdAndType(Integer paperId);
}
