package com.exam.service;

import com.exam.entity.Exammanage;

import java.util.List;

public interface ExamManageService {
    public List<Exammanage> findAll();

    public Exammanage findById(Integer examCode);

    public int delete(Integer examCode);

    public int update(Exammanage exammanage);

    public int add(Exammanage exammanage);
}
