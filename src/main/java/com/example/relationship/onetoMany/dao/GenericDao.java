package com.example.relationship.onetoMany.dao;

import java.util.List;

/**
 * Created by aman on 4/10/17.
 */
public interface GenericDao<U, T> {

    public void insert(T t);

    public void update(U u, T t);

    public void delete(U u);

    public List<T> findAll();
}
