package com.test.framework.service.impl;


import com.test.framework.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {
    @Autowired
    public TestMapper testMapper;
}
