package com.exam.entity;

import lombok.Data;

@Data
public class Answer {
    private Integer examCode;

    private Integer studentId;

    private String subject;

    private Integer questionId;

    private Integer questionType;

    private String answer;
}