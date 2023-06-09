package com.example.compteservice.entities;

import com.example.compteservice.enums.TypeCompte;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Compte {
//on incremente la valeur -> GenerationType.IDENTITY
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private double solde;
    private Date dateCreation;
    @Enumerated(EnumType.STRING) //pour specifier dans la baseD
    private TypeCompte Type;
}
