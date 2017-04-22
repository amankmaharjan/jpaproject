package com.example.inheritancecrud.joinedtable.dao;

import com.example.inheritancecrud.joinedtable.dbconnection.JpaConfiguration;
import com.example.inheritancecrud.joinedtable.model.NonTeachingStaff;
import com.example.inheritancecrud.joinedtable.model.Staff;
import com.example.inheritancecrud.joinedtable.model.TeachingStaff;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by aman on 3/31/17.
 */
public class StaffDaoImpl implements StaffDao {

    public EntityManager entityManager = new JpaConfiguration().getEnitityManager();

    @Override
    public void insert(Staff staff) {
        entityManager.getTransaction().begin();
        entityManager.persist(staff);
        entityManager.getTransaction().commit();


    }

    @Override
    public void update(Integer id, Staff editedStaff) {

        entityManager.getTransaction().begin();
        if (editedStaff instanceof TeachingStaff) {

            TeachingStaff teachingStaff = (TeachingStaff) findOne(id);
            teachingStaff.setSname(editedStaff.getSname());
            teachingStaff.setQualification(((TeachingStaff) editedStaff).getQualification());
            teachingStaff.setSubjectExpertise(((TeachingStaff) editedStaff).getQualification());
            entityManager.getTransaction().commit();
        } else {

            NonTeachingStaff nonTeachingStaff = (NonTeachingStaff) findOne(id);
            nonTeachingStaff.setSname(editedStaff.getSname());
            nonTeachingStaff.setAreaExpertise(((NonTeachingStaff) editedStaff).getAreaExpertise());
            entityManager.getTransaction().commit();
        }

    }

    @Override
    public void delete(Integer id) {

        entityManager.getTransaction().begin();
        Staff staff = findOne(id);
        if (staff != null) {
            entityManager.remove(staff);
            entityManager.getTransaction().commit();
        }

    }

    @Override
    public List<Staff> findAll() {
        Query query = entityManager.createQuery("select s from Staff s");
        return query.getResultList();

    }

    @Override
    public Staff findOne(Integer id) {
        return entityManager.find(Staff.class, id);
    }
}
