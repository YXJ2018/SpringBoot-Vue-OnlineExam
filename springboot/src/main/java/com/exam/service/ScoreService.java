package com.exam.service;

import com.exam.entity.Score;

import java.util.List;

public interface ScoreService {
    int add(Score score);

    List<Score> findAll();

    List<Score> findById(Integer studentId);

    List<Score> findByExamCode(Integer examCode);
}
