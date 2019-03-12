package com.exam.mapper;

import com.exam.entity.MultiQuestions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//选择题
@Mapper
public interface MultiQuestionsMapper {
    /**
     * select * from multiquestions where questionId in (
     * 	select questionId from papermanage where questionType = 1 and paperId = 1001
     * )
     */
    @Select("select * from MultiQuestions where questionId in (select questionId from PaperManage where questionType = 1 and paperId = #{paperId})")
    List<MultiQuestions> findByIdAndType(Integer PaperId);
}
