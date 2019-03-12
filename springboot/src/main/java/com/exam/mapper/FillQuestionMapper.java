package com.exam.mapper;

import com.exam.entity.FillQuestion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//填空题
@Mapper
public interface FillQuestionMapper {

    @Select("select * from FillQuestion where questionId in (select questionId from PaperManage where questionType = 2 and paperId = #{paperId})")
    List<FillQuestion> findByIdAndType(Integer paperId);
}
