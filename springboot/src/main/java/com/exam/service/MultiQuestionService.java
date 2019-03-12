package com.exam.service;

import com.exam.entity.MultiQuestions;

import java.util.List;

public interface MultiQuestionsService {

    List<MultiQuestions> findByIdAndType(Integer PaperId);
}
