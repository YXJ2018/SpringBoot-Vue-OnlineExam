package com.exam.service;

import com.exam.entity.JudgeQuestions;

import java.util.List;

public interface JudgeQuestionsService {

    List<JudgeQuestions> findByIdAndType(Integer paperId);
}
