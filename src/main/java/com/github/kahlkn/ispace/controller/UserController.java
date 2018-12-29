package com.github.kahlkn.ispace.controller;

import com.github.kahlkn.ispace.entity.User;
import com.github.kahlkn.ispace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: lichunfeng
 * @Date: 2018/12/28 15:17
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    /** 查询 **/
    @RequestMapping("/list")
    public List<User> userList(){
        List<User> userList = userService.userList();
        return userList;
    }


}
