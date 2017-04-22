package com.example.relationship.onetoMany.dao;

import com.example.relationship.onetoMany.dbconnection.JpaConfiguration;
import com.example.relationship.onetoMany.model.Department;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by aman on 4/10/17.
 */
public class DepartmentDaoImpl implements DepartmentDao {
    EntityManager entityManager = new JpaConfiguration().getEnitityManager();

    @Override
    public void insert(Department department) {
        entityManager.getTransaction().begin();
        entityManager.persist(department);
        entityManager.getTransaction().commit();
    }

    @Override
    public void update(Integer id, Department department) {

        entityManager.getTransaction().begin();
        Department editedDepartment = findOne(id);
        if (editedDepartment != null) {
            editedDepartment.setName(department.getName());
            entityManager.getTransaction().commit();
        }
    }

    @Override
    public void delete(Integer id) {
        entityManager.getTransaction().begin();
        Department editedDepartment = findOne(id);
        if (editedDepartment != null) {
            entityManager.remove(editedDepartment);
            entityManager.getTransaction().commit();
        }
    }

    @Override
    public List<Department> findAll() {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Department> criteriaQuery = criteriaBuilder.createQuery(Department.class);
        Root<Department> departmentRoot = criteriaQuery.from(Department.class);
        criteriaQuery.select(departmentRoot);
        TypedQuery<Department> typedQuery = entityManager.createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }

    @Override
    public Department findOne(Integer id) {

        return entityManager.find(Department.class, id);
    }
}
