package com.exam.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.exam.entity.Message;

public interface MessageService {
    IPage<Message> findAll(Page page);

    Message findById(Integer id);

    int delete(Integer id);

    int update(Message message);

    int add(Message message);
}
