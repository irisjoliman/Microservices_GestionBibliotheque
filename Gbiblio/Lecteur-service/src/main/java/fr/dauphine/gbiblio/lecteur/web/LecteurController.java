package fr.dauphine.gbiblio.lecteur.web;

import fr.dauphine.gbiblio.lecteur.model.Lecteur;
import fr.dauphine.gbiblio.lecteur.model.LecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LecteurController {
    //      http://192.168.99.100:9091/h2-console pour accéder à la base de donnée
    //      http://192.168.99.100:9091/getLecteur/id:1 pour accéder à l'emprunt
    //      http://192.168.99.100:9091/getEmprunt/isbn/1234567892 pour accéder aux emprunts associés à un livre
    //      http://192.168.99.100:9091/getEmprunt/lecteur/1 pour accédleer aux emprunts associés à un lecteur

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

    @PostMapping("/fr.dauphine.gbiblio.lecteur.model.Lecteur")
    public void ajouterLecteur(@RequestBody Lecteur lecteur){
        repository.save(lecteur);
    }

    @DeleteMapping("fr.dauphine.gbiblio.lecteur.model.Lecteur/id:{id}")
    public void supprimerLecteur(@PathVariable int id){
        repository.delete(repository.findById(id));
    }

}
