package com.exam.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Exammanage {
    private Integer examCode;

    private String description;

    private String source;

    private Integer paperId;

    private Date examDate;

    private Integer totalTime;

    private String grade;

    private String term;

    private String major;

    private String institute;

    private Integer totalScore;

    private String type;

    private String tips;
}