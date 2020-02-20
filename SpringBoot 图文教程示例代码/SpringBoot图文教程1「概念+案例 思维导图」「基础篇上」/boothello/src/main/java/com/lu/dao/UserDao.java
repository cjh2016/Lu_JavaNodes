package com.lu.dao;

import com.lu.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
