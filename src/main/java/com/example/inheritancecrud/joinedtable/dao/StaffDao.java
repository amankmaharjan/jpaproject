package com.example.inheritancecrud.joinedtable.dao;

import com.example.inheritancecrud.joinedtable.model.Staff;

/**
 * Created by aman on 3/31/17.
 */
public interface StaffDao extends GenericDao<Staff,Integer> {
    public Staff findOne(Integer id);
}
