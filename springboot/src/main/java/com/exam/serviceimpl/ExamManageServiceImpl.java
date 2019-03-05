package com.exam.serviceimpl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.Exammanage;
import com.exam.mapper.ExamManageMapper;
import com.exam.service.ExamManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamManageServiceImpl implements ExamManageService {
    @Autowired
    private ExamManageMapper examManageMapper;


    @Override
    public List<Exammanage> findAll() {
        return examManageMapper.findAll();
    }

    @Override
    public IPage<Exammanage> findAll(Page<Exammanage> page) {
        return examManageMapper.findAll(page);
    }

    @Override
    public Exammanage findById(Integer examCode) {
        return examManageMapper.findById(examCode);
    }

    @Override
    public int delete(Integer examCode) {
        return examManageMapper.delete(examCode);
    }

    @Override
    public int update(Exammanage exammanage) {
        return examManageMapper.update(exammanage);
    }

    @Override
    public int add(Exammanage exammanage) {
        return examManageMapper.add(exammanage);
    }
}
