package com.example.relationship.manytomany.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by aman on 4/9/17.
 */
@Entity
public class Teacher {
    @Id
    private int tid;
    @Getter
    @Setter
    private String tname;
    @Getter
    @Setter
    private String subject;
    @ManyToMany
    @Getter
    @Setter
    private List<Cla> claList;
}
