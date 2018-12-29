package com.github.kahlkn.ispace.mapper;

import com.github.kahlkn.ispace.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: lichunfeng
 * @Date: 2018/12/20 15:57
 * @Description:
 */

@Mapper
@Repository
public interface UserMapper {

    /** 查询**/
    @Select("SELECT * FROM user")
    List<User> userList();




}
