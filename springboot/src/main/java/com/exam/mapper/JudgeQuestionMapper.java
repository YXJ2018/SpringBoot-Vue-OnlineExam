package com.exam.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.JudgeQuestion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//判断题

@Mapper
public interface JudgeQuestionMapper {

    @Select("select * from JudgeQuestion where questionId in (select questionId from PaperManage where questionType = 3 and paperId = #{paperId})")
    List<JudgeQuestion> findByIdAndType(Integer paperId);

    @Select("select * from JudgeQuestion")
    IPage<JudgeQuestion> findAll(Page page);

    /**
     * 查询最后一条记录的questionId
     * @return JudgeQuestion
     */
    @Select("select questionId from JudgeQuestion order by questionId desc limit 1")
    JudgeQuestion findOnlyQuestionId();

    @Insert("insert into JudgeQuestion(subject,question,answer,analysis,level,section) values " +
            "(#{subject},#{question},#{answer},#{analysis},#{level},#{section})")
    int add(JudgeQuestion judgeQuestion);
}
