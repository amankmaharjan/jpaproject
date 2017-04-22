package com.example.relationship.manytone.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import java.io.Serializable;

/**
 * Created by aman on 4/5/17.
 */
@Entity
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(query = "select e from Employee e",
                name = "Employee.findAll"),
        @NamedQuery(query = "Select e from Employee e where e.eid =:eid",
                name = "Employee.findById"),
        @NamedQuery(query = "select  e from Employee  e where e.ename=:ename", name = "Employee.findByName")
})
@ToString
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int eid;
    @Getter
    @Setter
    private String ename;
    @Getter
    @Setter
    private double salary;
    @Getter
    @Setter
    private String deg;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "depid")//represents the primarykey of Department and Employee is the owner of this relationship
    @Getter
    @Setter
    private Department department;

}
