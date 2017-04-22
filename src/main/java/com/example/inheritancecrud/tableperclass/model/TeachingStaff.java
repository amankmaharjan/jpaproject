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
@NoArgsConstructor
@ToString(callSuper = true, includeFieldNames = true)
@PrimaryKeyJoinColumn(referencedColumnName = "sid")
@DiscriminatorValue(value = "TeachingStaff")
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
