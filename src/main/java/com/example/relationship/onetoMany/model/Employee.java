package com.example.relationship.onetoMany.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.*;

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
//    @GeneratedValue(generator = "gen")
//    @GenericGenerator(name = "gen", strategy = "foreign", parameters = @org.hibernate.annotations.Parameter(name = "property", value = "department"))
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

    public Employee(String ename, double salary, String deg) {
        this.ename = ename;
        this.salary = salary;
        this.deg = deg;
    }
}
