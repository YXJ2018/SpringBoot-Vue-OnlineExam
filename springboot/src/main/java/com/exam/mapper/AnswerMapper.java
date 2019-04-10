package com.exam.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.vo.AnswerVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface AnswerMapper {
    @Select("select question, subject, score, section,level, \"选择题\" as type from multiQuestion " +
            "union select  question, subject, score, section,level, \"判断题\" as type  from judgeQuestion " +
            "union select  question, subject, score, section,level, \"填空题\" as type from fillQuestion")
    IPage<AnswerVO> findAll(Page page);
}
