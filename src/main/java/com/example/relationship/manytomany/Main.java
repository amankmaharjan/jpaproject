package com.example.relationship.manytomany;

import com.example.relationship.manytomany.dbconnection.JpaConfiguration;

import javax.persistence.EntityManager;

/**
 * Created by aman on 4/5/17.
 */
public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = new JpaConfiguration().getEnitityManager();
    }
}
