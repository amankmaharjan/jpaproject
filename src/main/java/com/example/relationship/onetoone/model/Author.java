package com.example.relationship.onetoone.model;

/**
 * Created by aman on 4/7/17.
 */

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String name;

    @OneToOne(mappedBy = "author", cascade = CascadeType.ALL)
    @Getter
    @Setter
    private Biography biography;
}
