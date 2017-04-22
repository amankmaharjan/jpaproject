package com.example.relationship.onetoMany.controller;

import com.example.relationship.onetoMany.dao.DepartmentDao;
import com.example.relationship.onetoMany.dao.DepartmentDaoImpl;
import com.example.relationship.onetoMany.model.Department;

import java.util.List;

/**
 * Created by aman on 4/10/17.
 */
public class DepartmentController {
    DepartmentDao departmentDao = new DepartmentDaoImpl();

    public void insert(Department department) {

        departmentDao.insert(department);
    }

    public void update(Integer id, Department department) {
        departmentDao.update(id, department);
    }

    public void delete(Integer id) {
        departmentDao.delete(id);
    }

    public List<Department> findAll() {
        return departmentDao.findAll();
    }

    public Department findOne(Integer id) {
        return departmentDao.findOne(id);
    }
}
