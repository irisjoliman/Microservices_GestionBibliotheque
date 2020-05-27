package fr.dauphine.gbiblio.lecteur.web;

import fr.dauphine.gbiblio.lecteur.model.Lecteur;
import fr.dauphine.gbiblio.lecteur.model.LecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return repository.findById(id);
    }

    @GetMapping("/getLecteur/nom:{nom}/prenom:{prenom}")
    public Lecteur recupereLecteurParNomPrenom(@PathVariable String nom, @PathVariable String prenom){
        return repository.findByNomAndPrenom(nom, prenom);
    }

    @GetMapping("/getLecteur/All")
    public List<Lecteur> recupereTousLesLecteurs(){
        return repository.findAll();
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
