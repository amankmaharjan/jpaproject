package com.example.relationship.onetoone.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

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
    @OneToOne(mappedBy = "department", cascade = CascadeType.ALL)
//represents this relationship is inverse side i.eTo declare a side as not responsible for the relationship,
   @JoinColumn(name="eid")
    @Getter
    @Setter
    Employee employee;
}
