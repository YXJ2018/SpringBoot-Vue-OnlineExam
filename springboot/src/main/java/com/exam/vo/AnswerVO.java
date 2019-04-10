package com.exam.vo;

import lombok.Data;

@Data
public class AnswerVO {
    private String question;
    private String subject;
    private String score;
    private String section;
    private String level;
    private String type;
}
