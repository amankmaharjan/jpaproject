package com.example.inheritancecrud.tableperclass.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by aman on 3/31/17.
 */
@Entity
@ToString(callSuper = true)
@NoArgsConstructor()
@PrimaryKeyJoinColumn(referencedColumnName ="sid" )
@DiscriminatorValue(value = "NonTeachingStaff")
public class NonTeachingStaff extends Staff {
    @Getter
    @Setter
    private String areaExpertise;

    public NonTeachingStaff(String sname, String areaExpertise) {
        super(sname);
        this.areaExpertise = areaExpertise;
    }
}
