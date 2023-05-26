package com.example.compteservice.repositories;

import com.example.compteservice.entities.Compte;
import com.example.compteservice.enums.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
//une autre facon de creer un web service nst3ml module spring data rest
//spring datarest test3ml pagination



@RepositoryRestResource //webservice entraine de demander un spring quand tu demare w y3tini restcontrolleur qui permet
//daccerder a tout les operations qui'l existe dans cette interface

//JpaRepository pour travailler avec spring data
//Compte specifier le type qu'est ce que vous gerer
//partie dao base de d
public interface CompteRepository extends JpaRepository<Compte,Long> {
 //@RestResource(path = "/byType")
 //List<Compte> findByType(TypeCompte typeCompte);
}
