package com.example.jpacrud.dao;

import com.example.jpacrud.dbconnection.JpaConfiguration;
import com.example.jpacrud.model.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by aman on 3/30/17.
 */
public class UserDaoImpl implements UserDao {

    EntityManager entityManager = new JpaConfiguration().getEnitityManager();

    @Override
    public void insert(User user) {

        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();

    }

    @Override
    public void update(Integer id, User editeduser) {

        entityManager.getTransaction().begin();
        User user = findOne(id);
        if (user != null) {
            user.setName(editeduser.getName());
            user.setAddress(editeduser.getName());
            entityManager.getTransaction().commit();
        }
    }

    @Override
    public void delete(Integer id) {
        entityManager.getTransaction().begin();
        User user = findOne(id);
        if (user != null)
            entityManager.remove(user);
        entityManager.getTransaction().commit();

    }

    @Override
    public List<User> findAll() {
        Query query = entityManager.createQuery("SELECT u FROM User u");
        return query.getResultList();
    }

    @Override
    public User findOne(int id) {
        return entityManager.find(User.class, id);
    }
}
