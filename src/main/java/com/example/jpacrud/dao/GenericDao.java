package com.example.jpacrud.dao;

import java.util.List;

/**
 * Created by aman on 3/30/17.
 */
public interface GenericDao <T,U>{
    public void insert(T t);
    public void update(U u,T t);
    public void delete(U u);
    public List<T> findAll();

}
