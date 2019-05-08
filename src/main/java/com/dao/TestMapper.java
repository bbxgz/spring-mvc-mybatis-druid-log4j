package com.dao;


import com.pojo.MTest;

public interface TestMapper {
    MTest selectByPrimaryKey(Integer id);
}
