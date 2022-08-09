package com.example.apprecord;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "prisoner")
public class Prisoner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private String surname;
    private String fatherName;
    private String birthDate;
    private String enterDate;
    private String exitDate;
    private String notes; // uwagi np ze odbywal przerwe w odbywaniu kary bedzie to odejmowane od wyrku (wyrok roznica miedzy wejsciem a wyjsciem)



    @ManyToOne
    private Prison prison;
    @OneToMany
    private List<Crime> crime;

}
