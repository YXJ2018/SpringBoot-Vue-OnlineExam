package com.exam.serviceimpl;

import com.exam.entity.MultiQuestions;
import com.exam.mapper.MultiQuestionsMapper;
import com.exam.service.MultiQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultiQuestionsServiceImpl implements MultiQuestionsService {

    @Autowired
    private MultiQuestionsMapper multiQuestionsMapper;
    @Override
    public List<MultiQuestions> findByIdAndType(Integer PaperId) {
        return multiQuestionsMapper.findByIdAndType(PaperId);
    }
}
