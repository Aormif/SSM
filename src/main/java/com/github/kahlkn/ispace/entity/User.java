package com.github.kahlkn.ispace.entity;

/**
 * @Auther: lichunfeng
 * @Date: 2018/12/20 19:07
 * @Description:
 */
public class User {

    private int id;

    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}