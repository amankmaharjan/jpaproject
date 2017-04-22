package com.example.inheritancecrud.joinedtable.model;

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
@NoArgsConstructor
@DiscriminatorValue("TeachingStaff")
@PrimaryKeyJoinColumn(referencedColumnName = "sid")
@ToString(callSuper = true, includeFieldNames = true)
public class TeachingStaff extends Staff {
    @Getter
    @Setter
    private String Qualification;
    @Getter
    @Setter
    private String SubjectExpertise;

    public TeachingStaff(String sname, String qualification, String subjectExpertise) {
        super(sname);
        Qualification = qualification;
        SubjectExpertise = subjectExpertise;
    }
}
