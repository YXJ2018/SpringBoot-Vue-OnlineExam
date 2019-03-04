package com.exam.mapper;

import com.exam.entity.Exammanage;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ExamManageMapper {
    @Select("select * from ExamManage")
    public List<Exammanage> findAll();

    @Select("select * from ExamManage where examCode = #{examCode}")
    public Exammanage findById(Integer examCode);

    @Delete("delete from ExamManage where examCode = #{examCode}")
    public int delete(Integer examCode);

    @Update("update ExamManage set description = #{description},source = #{source},paperId = #{paperId}," +
            "examDate = #{examDate},totalTime = #{totalTime},grade = #{grade},term = #{term}," +
            "major = #{major},institute = #{institute},totalScore = #{totalScore} where examCode = #{examCode}")
    public int update(Exammanage exammanage);

    @Options(useGeneratedKeys = true,keyProperty = "examCode")
    @Insert("insert into ExamManage(description,source,paperId,examDate,totalTime,grade,term,major,institute,totalScore)" +
            " values(#{description},#{source},#{paperId},#{examDate},#{totalTime},#{grade},#{term},#{major},#{institute},#{totalScore})")
    public int add(Exammanage exammanage);
}
