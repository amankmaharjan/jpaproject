//package com.example.relationship.manytone.model;
//
///**
// * Created by aman on 4/7/17.
// */
//
//import javax.persistence.*;
//
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.annotations.Parameter;
//
//@Entity
//@Table(name = "biographies")
//public class Biography {
//
//    //    @Id
////    @Column(name = "author_id")
////    @GeneratedValue(generator = "gen")
////    @GenericGenerator(name = "gen", strategy = "foreign",
////            parameters = @Parameter(name = "property", value = "author"))
////    private Integer authorId;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Getter
//    @Setter
//    private int id;
//    @Getter
//    @Setter
//    private String information;
//
//    @OneToOne(cascade = CascadeType.ALL)
////    @PrimaryKeyJoinColumn
//    @JoinColumn(name="authid")
//    @Getter
//    @Setter
//    private Author author;
//
//
//
////    public Integer getAuthorId() {
////        return authorId;
////    }
////
////    public void setAuthorId(Integer authorId) {
////        this.authorId = authorId;
////    }
//
//}
