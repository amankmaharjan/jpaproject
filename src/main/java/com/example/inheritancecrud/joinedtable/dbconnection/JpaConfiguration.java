package com.example.inheritancecrud.joinedtable.dbconnection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by aman on 3/30/17.
 */
public class JpaConfiguration {
    private static EntityManagerFactory emfactory = Persistence.
            createEntityManagerFactory("jpa-example");


    public EntityManager getEnitityManager() {
        return emfactory.createEntityManager();
    }

}
