package com.example.relationship.onetoone;

import com.example.relationship.onetoone.dbconnection.JpaConfiguration;
import com.example.relationship.onetoone.model.Author;
import com.example.relationship.onetoone.model.Biography;
import com.example.relationship.onetoone.model.Department;
import com.example.relationship.onetoone.model.Employee;
import com.example.relationship.onetoone.view.OrganisationView;

import javax.management.Attribute;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.util.List;

import static sun.misc.Version.print;

/**
 * Created by aman on 4/5/17.
 */
public class Main {
    public static void main(String[] args) {
        new OrganisationView().displayMenu();

        //        EntityManager entityManager = new JpaConfiguration().getEnitityManager();
//        entityManager.getTransaction().begin();
//        Department department = new Department();
//
//        Employee employee = new Employee();
//        employee.setEname("name");
//        employee.setDeg("raj");
//        employee.setSalary(50000);
//        employee.setDepartment(department);
//
//        department.setName("adminstration");
//        department.setEmployee(employee);
//
//        entityManager.persist(department);
//        entityManager.getTransaction().commit();
////        Query query = entityManager.createNamedQuery("Department.find");
////
////        List<Department> departmentList = query.getResultList();
////
////        departmentList.forEach(department1 -> System.out.println(department1.getEmployee()));
////
////        entityManager.close();
//        entityManager.getTransaction().begin();
//        Author author = new Author();
//        author.setName(" O. Henry");
//
//        Biography biography = new Biography();
//        biography.setInformation("William Sydney Porter  better known as O. Henry..");
//
//        author.setBiography(biography);
//        biography.setAuthor(author);
//        entityManager.persist(author);
//        entityManager.getTransaction().commit();

    }
}
