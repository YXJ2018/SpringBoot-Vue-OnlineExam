package com.exam.serviceimpl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.Message;
import com.exam.mapper.MessageMapper;
import com.exam.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public IPage<Message> findAll(Page page) {
        return messageMapper.findAll(page);
    }

    @Override
    public Message findById(Integer id) {
        return messageMapper.findById(id);
    }

    @Override
    public int delete(Integer id) {
        return messageMapper.delete(id);
    }

    @Override
    public int update(Message message) {
        return messageMapper.update(message);
    }

    @Override
    public int add(Message message) {
        return messageMapper.add(message);
    }
}
