package com.example.relationship.manytone.dao;

import com.example.relationship.onetoone.dao.GenericDao;
import com.example.relationship.onetoone.model.Department;
import com.example.relationship.onetoone.model.Employee;

import java.util.List;

/**
 * Created by aman on 4/6/17.
 */
public interface OrganisationDao extends com.example.relationship.manytone.dao.GenericDao<Object, Integer> {
    public List<com.example.relationship.manytone.model.Department> findAllDeparment();

    public com.example.relationship.manytone.model.Department findDepartmenOne(Integer id);

    public List<com.example.relationship.manytone.model.Department> findDepartmentById(Integer id);

    public List<com.example.relationship.manytone.model.Department> findDepartmentByName(String name);

    public List<com.example.relationship.manytone.model.Employee> findAllEmplooyee();

    public void deleteByDepartmentId(Integer id);

    public com.example.relationship.manytone.model.Employee findEmployeOne(Integer id);

    public List<com.example.relationship.manytone.model.Employee> findEmployeeById(Integer id);

    public List<com.example.relationship.manytone.model.Employee> findEmployeeByName(String name);

    public void deleteByEmployeeId(Integer id);

}
