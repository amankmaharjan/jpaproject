package com.example.relationship.onetoMany.dao;

import com.example.relationship.onetoMany.model.Department;

/**
 * Created by aman on 4/10/17.
 */
public interface DepartmentDao extends GenericDao<Integer, Department> {
    public Department findOne(Integer id);
}
