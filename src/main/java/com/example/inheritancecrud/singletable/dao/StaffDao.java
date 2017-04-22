package com.example.inheritancecrud.singletable.dao;

import com.example.inheritancecrud.singletable.model.Staff;

/**
 * Created by aman on 3/31/17.
 */
public interface StaffDao extends GenericDao<Staff,Integer>{
    public Staff findOne(Integer id);
}
