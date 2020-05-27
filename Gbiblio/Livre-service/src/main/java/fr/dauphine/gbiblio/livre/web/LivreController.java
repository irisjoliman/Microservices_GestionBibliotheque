package fr.dauphine.gbiblio.livre.web;
import fr.dauphine.gbiblio.livre.model.Livre;
import fr.dauphine.gbiblio.livre.model.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//      http://192.168.99.100:9092/h2-console pour accéder à la base de donnée
//      http://192.168.99.100:9092/getLivre/isbn/1234567892 pour accéder au livre par isbn
//      http://192.168.99.100:9092/getLivre/All pour accéder à la liste de tous les livres
//      http://192.168.99.100:9092/getLivre/auteur/dzlbjs pour accéder à tous les livres d'un certain auteur


//      http://localhost:8000/h2-console pour accéder à la base de donnée
//      http://localhost:8000/getLivre/isbn/1234567892 pour accéder au livre par isbn
//      http://localhost:8000/getLivre/All pour accéder à la liste de tous les livres
//      http://localhost:8000/getLivre/auteur/dzlbjs pour accéder à tous les livres d'un certain auteur


@RestController
public class LivreController {

    @Autowired
    private LivreRepository repository;

    @GetMapping("/getLivre/isbn/{isbn}")
    public Livre recupereLivreParIsbn(@PathVariable String isbn){
        Livre livre = repository.findByIsbn(isbn);
        return livre;
    }

    @GetMapping("/getLivre/auteur/{auteur}")
    public List<Livre> recupereLivreParAuteur(@PathVariable String auteur){
        List<Livre> livres = repository.findByAuteur(auteur);
        return livres;
    }

    @GetMapping("/getLivre/All")
    public List<Livre> recupereTousLesLivres(){
        List<Livre> livres = repository.findAll();
        return livres;
    }

    @PostMapping("/Livre")
    public void ajouterLivre(@RequestBody Livre livre){
        repository.save(livre);
    }

    @DeleteMapping("Livre/isbn:{isbn}")
    public void supprimerLivre(@PathVariable String isbn){
        repository.delete(repository.findByIsbn(isbn));
    }
}
