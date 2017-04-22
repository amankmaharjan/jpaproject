package com.example.relationship.manytone.dao;

import java.util.List;

/**
 * Created by aman on 4/5/17.
 */
public interface GenericDao<U, T> {
public void insert(U u);

    public void update(T t, U u);


}
