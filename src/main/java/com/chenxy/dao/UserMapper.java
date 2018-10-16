package com.chenxy.dao;

import com.chenxy.entity.User;

/**
 * @Classname: UserMapper
 * @description: 用户数据访问层
 * @author: chenxy
 * @create: 2018-10-15 20:26
 * @version: 1.0
 **/
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}