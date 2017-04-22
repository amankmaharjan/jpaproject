/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpacrud.controller;


import com.example.jpacrud.dao.UserDao;
import com.example.jpacrud.dao.UserDaoImpl;
import com.example.jpacrud.model.User;

import java.util.List;

public class UserController {

    private UserDao userDao = new UserDaoImpl();

    public void insert(User user) {
        userDao.insert(user);
    }

    public void update(int id, User user) {
        userDao.update(id, user);
    }

    public void delete(int id) {
        userDao.delete(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findOne(Integer id) {
        return userDao.findOne(id);
    }


}

