package com.example.relationship.manytone;


import com.example.relationship.manytone.dbconnection.JpaConfiguration;

import javax.persistence.EntityManager;

/**
 * Created by aman on 4/5/17.
 */
public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = new JpaConfiguration().getEnitityManager();
    }
}
