package com.example.relationship.onetoone.dao;

import com.example.relationship.onetoone.model.Department;
import com.example.relationship.onetoone.model.Employee;

import java.util.List;

/**
 * Created by aman on 4/6/17.
 */
public interface OrganisationDao extends GenericDao<Object, Integer> {
    public List<Department> findAllDeparment();

    public Department findDepartmenOne(Integer id);

    public List<Department> findDepartmentById(Integer id);

    public List<Department> findDepartmentByName(String name);

    public List<Employee> findAllEmplooyee();

    public void deleteByDepartmentId(Integer id);

    public Employee findEmployeOne(Integer id);

    public List<Employee> findEmployeeById(Integer id);

    public List<Employee> findEmployeeByName(String name);

    public void deleteByEmployeeId(Integer id);

}
