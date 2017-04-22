package com.example.relationship.onetoone.controller;

import com.example.relationship.onetoone.dao.OrganisationDao;
import com.example.relationship.onetoone.dao.OrganisationDaoImpl;
import com.example.relationship.onetoone.model.Department;
import com.example.relationship.onetoone.model.Employee;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by aman on 4/6/17.
 */
public class OrganisationController {
    OrganisationDao organisationDao = new OrganisationDaoImpl();

    public void insert(Object o) {
        organisationDao.insert(o);
    }

    public void update(Integer id, Object o) {
        organisationDao.update(id, o);
    }

    public void deleteByEmployeeId(Integer id) {
        organisationDao.deleteByEmployeeId(id);
    }

    public void deleteByDepartmentId(Integer id) {
        organisationDao.deleteByDepartmentId(id);
    }


    public List<Employee> findAllEmployee() {
        return organisationDao.findAllEmplooyee();
    }

    public List<Department> findAllDepartment() {
        return organisationDao.findAllDeparment();
    }

    public Department findDepartmenOne(Integer id) {
        return organisationDao.findDepartmenOne(id);
    }

    public List<Department> findDepartmentById(Integer id) {
        return organisationDao.findDepartmentById(id);
    }

    public List<Department> findDepartmentByName(String name) {
        return organisationDao.findDepartmentByName(name);
    }

    public Employee findEmployeOne(Integer id) {
        return organisationDao.findEmployeOne(id);
    }

    public List<Employee> findEmployeeById(Integer id) {
        return organisationDao.findEmployeeById(id);
    }

    public List<Employee> findEmployeeByName(String name) {
        return organisationDao.findEmployeeByName(name);
    }
}
