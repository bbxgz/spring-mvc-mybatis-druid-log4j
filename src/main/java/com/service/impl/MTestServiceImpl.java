package com.service.impl;

import com.dao.TestMapper;
import com.pojo.MTest;
import com.service.MTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("testService")
@Transactional
public class MTestServiceImpl implements MTestService {
    @Autowired(required = false)
    private TestMapper testMapper = null;

    public MTest getById(int id) {
        return testMapper.selectByPrimaryKey(id);
    }
}
