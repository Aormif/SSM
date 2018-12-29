package com.github.kahlkn.ispace.service;

import com.github.kahlkn.ispace.entity.User;

import java.util.List;

/**
 * @Auther: lichunfeng
 * @Date: 2018/12/20 19:15
 * @Description:
 */
public interface UserService {

    /**查询**/
   List<User> userList();
}
