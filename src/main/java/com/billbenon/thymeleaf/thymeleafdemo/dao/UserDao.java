package com.billbenon.thymeleaf.thymeleafdemo.dao;

import com.billbenon.thymeleaf.thymeleafdemo.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
