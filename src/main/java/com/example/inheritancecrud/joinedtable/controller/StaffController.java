package com.example.inheritancecrud.joinedtable.controller;

import com.example.inheritancecrud.joinedtable.dao.StaffDao;
import com.example.inheritancecrud.joinedtable.dao.StaffDaoImpl;
import com.example.inheritancecrud.joinedtable.model.Staff;

import java.util.List;

/**
 * Created by aman on 3/31/17.
 */
public class StaffController {
    private StaffDao staffDao = new StaffDaoImpl();

    public void insert(Staff staff) {
        staffDao.insert(staff);
    }

    public void update(int id, Staff staff) {
        staffDao.update(id, staff);
    }

    public List<Staff> findAll() {
        return staffDao.findAll();
    }

    public Staff findOne(int id) {
        return staffDao.findOne(id);
    }

    public void delete(int id) {
        staffDao.delete(id);
    }
}
