package com.example.compteservice;

import com.example.compteservice.entities.Compte;
import com.example.compteservice.enums.TypeCompte;
import com.example.compteservice.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class CompteServiceApplication  {

	public static void main(String[] args) {

		SpringApplication.run(CompteServiceApplication.class, args);
	}


	@Bean
CommandLineRunner start(CompteRepository compteRepository, RepositoryRestConfiguration restConfiguration) {
//restConfiguration y3ml integration lel id
    return args -> {
    restConfiguration.exposeIdsFor(Compte.class);
	//CREER LES COMPTES
	compteRepository.save(new Compte(null,98000,new Date(), TypeCompte.COURANT));
	compteRepository.save(new Compte(null,12000,new Date(), TypeCompte.EPARGNE));
	compteRepository.save(new Compte(null,2100,new Date(), TypeCompte.COURANT));


//afficher les comptes
	compteRepository.findAll().forEach(
			cp-> {
				System.out.println(cp.getType());
				System.out.println(cp.getSolde());
			}
	);

};


}
}
