package com.exam.service;

import com.exam.entity.JudgeQuestion;

import java.util.List;

public interface JudgeQuestionService {

    List<JudgeQuestion> findByIdAndType(Integer paperId);
}
