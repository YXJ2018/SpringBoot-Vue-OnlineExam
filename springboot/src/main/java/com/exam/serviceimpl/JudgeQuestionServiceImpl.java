package com.exam.serviceimpl;

import com.exam.entity.JudgeQuestions;
import com.exam.mapper.JudgeQuestionsMapper;
import com.exam.service.JudgeQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JudgeQuestionsServiceImpl implements JudgeQuestionsService {

    @Autowired
    private JudgeQuestionsMapper judgeQuestionsMapper;

    @Override
    public List<JudgeQuestions> findByIdAndType(Integer paperId) {
        return judgeQuestionsMapper.findByIdAndType(paperId);
    }
}
