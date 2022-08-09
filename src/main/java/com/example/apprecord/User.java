package com.example.apprecord;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String nameOrgan;
    @NotBlank
    private String name;
    @NotBlank
    private  String surname;
    @Email
    private String email;
    @Column(unique = true)
    @Min(6)
    private Long nrEtitliments;
}
