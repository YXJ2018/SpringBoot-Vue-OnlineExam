package com.exam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.Exammanage;

import java.util.List;

public interface ExamManageService {

    /**
     * 不分页查询所有考试信息
     */
    List<Exammanage> findAll();
    IPage<Exammanage> findAll(Page<Exammanage> page);

    Exammanage findById(Integer examCode);

    int delete(Integer examCode);

    int update(Exammanage exammanage);

    int add(Exammanage exammanage);
}
