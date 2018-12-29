package com.github.kahlkn.ispace.service;

import com.github.kahlkn.ispace.entity.User;
import com.github.kahlkn.ispace.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: lichunfeng
 * @Date: 2018/12/28 15:10
 * @Description:
 */
@Transactional
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userList() {
        return userMapper.userList();
    }
}
