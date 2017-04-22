package com.example.relationship.onetoone.dao;

import com.example.relationship.onetoone.dbconnection.JpaConfiguration;
import com.example.relationship.onetoone.model.Department;
import com.example.relationship.onetoone.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by aman on 4/6/17.
 */
public class OrganisationDaoImpl implements OrganisationDao {
    EntityManager entityManager = new JpaConfiguration().getEnitityManager();

    @Override
    public void insert(Object o) {
        entityManager.getTransaction().begin();
        entityManager.persist(o);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(Integer id, Object o) {

        entityManager.getTransaction().begin();
        if (o instanceof Employee) {
            Employee editedemp = findEmployeOne(id);
            if (editedemp != null) {
                editedemp.setEname(((Employee) o).getEname());
                editedemp.setDeg(((Employee) o).getDeg());
                editedemp.setSalary(((Employee) o).getSalary());
                editedemp.setDepartment(((Employee) o).getDepartment());
                entityManager.getTransaction().commit();
            } else {
                System.out.println("id not found");
            }
        } else {
            System.out.println("invalid type");
        }
    }

    @Override
    public void deleteByEmployeeId(Integer id) {
        entityManager.getTransaction().begin();
        Employee e = findEmployeOne(id);
        if (e != null) {
            entityManager.remove(e);
            entityManager.getTransaction().commit();
        } else {
            System.out.println("id not found");
        }
    }

    @Override
    public void deleteByDepartmentId(Integer id) {
        entityManager.getTransaction().begin();
        Department d = findDepartmenOne(id);
        if (d != null) {
            entityManager.remove(d);
            entityManager.getTransaction().commit();
        } else {
            System.out.println("id not found");
        }
    }

    @Override
    public List<Department> findAllDeparment() {
        Query query = entityManager.createNamedQuery("Department.find");
        return query.getResultList();
    }

    @Override
    public Department findDepartmenOne(Integer id) {
        return entityManager.find(Department.class, id);
    }

    @Override
    public List<Department> findDepartmentById(Integer id) {
        Query query = entityManager.createNamedQuery("Department.findById");
        query.setParameter("id", id);
        return query.getResultList();
    }

    @Override
    public List<Department> findDepartmentByName(String name) {
        Query query = entityManager.createNamedQuery("Department.findByName");
        query.setParameter("name", name);
        return query.getResultList();
    }


    @Override
    public List<Employee> findAllEmplooyee() {
        Query query = entityManager.createNamedQuery("Employee.findAll");
        return query.getResultList();
    }

    @Override
    public Employee findEmployeOne(Integer id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public List<Employee> findEmployeeById(Integer id) {
        Query query = entityManager.createNamedQuery("Employee.findById");
        query.setParameter("eid", id);
        return query.getResultList();
    }


    @Override

    public List<Employee> findEmployeeByName(String name) {
        Query query = entityManager.createNamedQuery("Employee.findByName");
        query.setParameter("ename", name);
        return query.getResultList();
    }
}
