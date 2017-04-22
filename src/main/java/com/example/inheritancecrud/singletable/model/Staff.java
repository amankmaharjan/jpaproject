package com.example.inheritancecrud.singletable.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by aman on 3/31/17.
 */
@Entity
@ToString
@NoArgsConstructor
@DiscriminatorColumn(name = "type")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private int sid;
    @Getter
    @Setter
    private String sname;

    public Staff(String sname) {
        super();
        this.sname = sname;
    }
}
