package com.exam.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.ExamManage;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ExamManageMapper {
    @Select("select * from ExamManage")
    List<ExamManage> findAll();

    @Select("select * from ExamManage")
    IPage<ExamManage> findAll(Page page);

    @Select("select * from ExamManage where examCode = #{examCode}")
    ExamManage findById(Integer examCode);

    @Delete("delete from ExamManage where examCode = #{examCode}")
    int delete(Integer examCode);

    @Update("update ExamManage set description = #{description},source = #{source},paperId = #{paperId}," +
            "examDate = #{examDate},totalTime = #{totalTime},grade = #{grade},term = #{term}," +
            "major = #{major},institute = #{institute},totalScore = #{totalScore}," +
            "type = #{type},tips = #{tips} where examCode = #{examCode}")
    int update(ExamManage exammanage);

    @Options(useGeneratedKeys = true,keyProperty = "examCode")
    @Insert("insert into ExamManage(description,source,paperId,examDate,totalTime,grade,term,major,institute,totalScore,type,tips)" +
            " values(#{description},#{source},#{paperId},#{examDate},#{totalTime},#{grade},#{term},#{major},#{institute},#{totalScore},#{type},#{tips})")
    int add(ExamManage exammanage);

    /**
     * 查询最后一条记录的paperId,返回给前端达到自增效果
     * @return paperId
     */
    @Select("select paperId from ExamManage order by paperId desc limit 1")
    ExamManage findOnlyPaperId();
}
