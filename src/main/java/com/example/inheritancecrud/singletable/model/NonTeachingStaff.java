package com.example.inheritancecrud.singletable.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by aman on 3/31/17.
 */
@Entity
@NoArgsConstructor()
@ToString(callSuper = true)
@DiscriminatorValue(value = "NTS")
public class NonTeachingStaff extends Staff {
    @Getter
    @Setter
    private String areaExpertise;

    public NonTeachingStaff(String sname, String areaExpertise) {
        super(sname);
        this.areaExpertise = areaExpertise;
    }
}
