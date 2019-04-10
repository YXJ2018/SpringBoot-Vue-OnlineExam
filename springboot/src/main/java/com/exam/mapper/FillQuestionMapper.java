package com.exam.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.FillQuestion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//填空题
@Mapper
public interface FillQuestionMapper {

    @Select("select * from FillQuestion where questionId in (select questionId from PaperManage where questionType = 2 and paperId = #{paperId})")
    List<FillQuestion> findByIdAndType(Integer paperId);

    @Select("select * from FillQuestion")
    IPage<FillQuestion> findAll(Page page);
}
