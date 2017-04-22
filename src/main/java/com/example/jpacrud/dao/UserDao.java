package com.example.jpacrud.dao;

import com.example.jpacrud.model.User;

/**
 * Created by aman on 3/30/17.
 */
public interface UserDao  extends GenericDao<User,Integer> {
    public User findOne(int id);
}
