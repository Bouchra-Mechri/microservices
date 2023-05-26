package com.example.compteservice.web;

import com.example.compteservice.entities.Compte;
import com.example.compteservice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class CompteRestController {

    //injection de dependance
   // @Autowired
    //acceder a la base de donnees je vais declarer directement le compte

    private CompteRepository compteRepository;
//constructeur
    public CompteRestController (CompteRepository compteRepository)
    {
        this.compteRepository = compteRepository;
    }
    //bch njib liste des compte

    @GetMapping(path = "/comptes")
//get liste compte badltelha port mt3ha 8082
    public List<Compte> listComptes() {
       return  compteRepository.findAll();
    }



    //consulter un compte b id mt3ou
    @GetMapping(path = "/comptes/{id}")
//je prend la parametre id et je l'affecte a code
    public Compte getCompte(@PathVariable(name = "id") Long code) {
        return  compteRepository.findById(code).get();
    }


    //methode ki retourner un compte




    //post pour creer un compte
@PostMapping(path= "/comptes")

//@RequestBody indiquer a spring quand tu recoit une requete http avec post tu va vers le corps de la requete tu va trouver les informations de compte
//eli houma donnees json
    public Compte save(@RequestBody Compte compte){
        return compteRepository.save(compte);
    }




    @PutMapping (path= "/comptes/{code}")


    public Compte update(@PathVariable Long code, @RequestBody Compte compte){
        compte.setCode(code);
        return compteRepository.save(compte);
    }

    @DeleteMapping  (path= "/comptes/{code}")
    public void delete(@PathVariable Long code){

         compteRepository.deleteById(code);
    }

}
