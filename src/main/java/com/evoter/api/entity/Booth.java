package com.evoter.api.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "boothlist")
//@EqualsAndHashCode(exclude = {"attributeOfTypeList"})
public class Booth {
    @Id
    @Column(name = "id")
    long id;
    @Column(name = "ward_no")
    int wardNo;
    @Column(name = "booth_no",  insertable = false, updatable = false)
    int boothNo;
    @Column(name = "booth_name_m")
    String boothNameM;
    @Column(name = "booth_name_e")
    String boothNameE;

    @OneToMany(mappedBy = "booth")
    @JsonBackReference
    List<Voter> voters;
}
