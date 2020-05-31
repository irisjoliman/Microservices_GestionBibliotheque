package fr.dauphine.gbiblio.lecteur.web;

import fr.dauphine.gbiblio.lecteur.model.Lecteur;
import fr.dauphine.gbiblio.lecteur.model.LecteurRepository;
import fr.dauphine.gbiblio.lecteur.web.exceptions.LecteurIntrouvableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LecteurController {

    //      http://192.168.99.100:9091/h2-console pour accéder à la base de donnée
    //      http://192.168.99.100:9091/getLecteur/id:1 pour accéder au lecteur par id
    //      http://192.168.99.100:9091/getLecteur/nom:ARIZANOVA/prenom:Simona pour accéder au lecteur par nom & prenom
    //      http://192.168.99.100:9091/getLecteur/All pour accéder à tous les lecteurs


    //      http://localhost:8001/h2-console pour accéder à la base de donnée
    //      http://localhost:8001/getLecteur/id:1 pour accéder au lecteur par id
    //      http://localhost:8001/getLecteur/nom:ARIZANOVA/prenom:Simona pour accéder au lecteur par nom & prenom
    //      http://localhost:8001/getLecteur/All pour accéder à tous les lecteurs



    @Autowired
    private LecteurRepository repository;

    @GetMapping("/getLecteur/id:{id}")
    public Lecteur recupereLecteurParId(@PathVariable int id){

        Lecteur lecteur =  repository.findById(id);
        if(lecteur == null) throw new LecteurIntrouvableException("Pas de lecteur d'id : " + id + ".");
        return(lecteur);
    }

    @GetMapping("/getLecteur/nom:{nom}/prenom:{prenom}")
    public Lecteur recupereLecteurParNomPrenom(@PathVariable String nom, @PathVariable String prenom){
        Lecteur lecteur = repository.findByNomAndPrenom(nom, prenom);
        if(lecteur == null) throw new LecteurIntrouvableException("Pas de lecteur nommé : " + nom + " " + prenom + ".");
        return(lecteur);
    }

    @GetMapping("/getLecteur/All")
    public List<Lecteur> recupereTousLesLecteurs(){
        List<Lecteur> lecteurs = repository.findAll();
        if(lecteurs == null) throw new LecteurIntrouvableException("Pas de lecteur référencé en base.");
        return(lecteurs);
    }

    @PostMapping("/Lecteur")
    public void ajouterLecteur(@RequestBody Lecteur lecteur){
        repository.save(lecteur);
    }

    @DeleteMapping("Lecteur/id:{id}")
    public void supprimerLecteur(@PathVariable int id){
        repository.delete(repository.findById(id));
    }

}
