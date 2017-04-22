package com.example.relationship.manytomany.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by aman on 4/9/17.
 */
@Entity
public class Cla {
    @Id
    @GeneratedValue()
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String cname;
    @ManyToMany
    List<Teacher> teachers;
}
