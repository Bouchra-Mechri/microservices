package com.example.compteservice.entities;


import com.example.compteservice.enums.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p2", types = Compte.class) //type s'applique  l classe compte
public interface CompteProj2 {
    Long getCode();
    TypeCompte getType();
}
