package fr.dauphine.gbiblio.Gbiblio.microserviceLecteur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LecteurController {

    @Autowired
    private LecteurRepository repository;

    @GetMapping("/getLecteur/id:{id}")
    public Lecteur recupereLecteurParId(@PathVariable int id){
        return repository.findById(id);
    }

    @GetMapping("/getLecteur/nom:{nom}/prenom:{prenom}")
    public Lecteur recupereLecteurParNomPrenom(@PathVariable String nom, String prenom){
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
