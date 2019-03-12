package com.exam.service;

import com.exam.entity.MultiQuestion;

import java.util.List;

public interface MultiQuestionService {

    List<MultiQuestion> findByIdAndType(Integer PaperId);
}
