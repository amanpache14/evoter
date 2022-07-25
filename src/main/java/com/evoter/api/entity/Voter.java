package com.evoter.api.entity;


import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "eroll60")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data


//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "booth_no")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Voter {
    @Id
    @Column(name = "ID")
    long id;
    @Column(name = "ward_no", insertable = false, updatable = false)
    int wardNo;
    @Column(name = "booth_no", insertable = false, updatable = false)
    int boothNo;
    @Column(name = "section_no")
    int sectionNo;
    @Column(name = "sr_no")
    int serialNo;
    @Column(name = "house_no")
    String houseNo;
    @Column(name = "full_name_m")
    String fullNameM;
    @Column(name = "first_name_m")
    String firstNameM;
    @Column(name = "middle_name_m")
    String middleNameM;
    @Column(name = "last_name_m")
    String lastNameM;
    @Column(name = "full_name_e")
    String fullNameE;
    @Column(name = "first_name_e")
    String firstNameE;
    @Column(name = "middle_name_e")
    String middleNameE;
    @Column(name = "last_name_e")
    String lastNameE;
    @Column(name = "sex_m")
    String sexM;
    @Column(name = "sex_e")
    String sexE;
    @Column(name = "card_no")
    String cardNo;
    @Column(name = "age")
    int age;
    @Column(name = "mobile_no")
    long mobileNo;
    @Column(name = "booth_id")
    long boothId;
    //@JsonIgnore
    //@JsonBackReference

    @ManyToOne(cascade = CascadeType.ALL)
    //@Formula("ward_no * 1000 + booth_no")
    @JoinColumn(name = "booth_id",insertable = false,updatable = false)
    private Booth booth;
}
