package com.exam.entity;

import lombok.Data;

// 选择题实体
@Data
public class MultiQuestion {
    private Integer questionId;

    private String subject;

    private String section;

    private String answerA;

    private String answerB;

    private String answerC;

    private String answerD;

    private String question;

    private String level;

    private String rightAnswer;

    private String analysis; //题目解析

    private Integer score;

}