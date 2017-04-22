package com.example.relationship.onetoMany.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * Created by aman on 4/5/17.
 */
@Entity
@ToString(exclude = "employee")
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(query = "Select e from Department e ", name = "Department.find"),
        @NamedQuery(query = "SELECT  e from Department e where e.id=:id", name = "Department.findById"),
        @NamedQuery(query = "SELECT e from Department  e where e.name=:name", name = "Department.findByName")
})
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String name;
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.PERSIST})
    @Getter
    @Setter
    List<Employee> employeeList;
}
