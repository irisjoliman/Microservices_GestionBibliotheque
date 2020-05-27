package fr.dauphine.gbiblio.livre.web;
import fr.dauphine.gbiblio.livre.model.Livre;
import fr.dauphine.gbiblio.livre.model.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//      http://192.168.99.100:9092/h2-console pour accéder à la base de donnée
//      http://192.168.99.100:9092/getLivre/isbn/1234567892 pour accéder au livre
//      http://192.168.99.100:9092/getLivre/All pour accéder à la liste de tous les livres
//      http://192.168.99.100:9092/getLivre/auteur/dzlbjs pour accéder à tous les livres d'un certain auteur
//      http://192.168.99.100:9092/Livre/isbn:

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
/*
    @PostMapping("/creerLivre/isbn:{isbn}/auteur:{auteur}/titre:{titre}/edieur:{editeur}/edition:{edition}")
    public ResponseEntity<Object> creerLivre(@PathVariable String isbn, String auteur, String titre, String editeur, int edition){
        fr.dauphine.gbiblio.livre.model.Livre livre = new fr.dauphine.gbiblio.livre.model.Livre(isbn, auteur, titre, editeur, edition);
        fr.dauphine.gbiblio.livre.model.Livre livre2 = repository.save(livre);
        if (livre2 == null){
            return ResponseEntity.noContent().build();
        }
        else{
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{isbn}").buildAndExpand(livre2.getIsbn()).toUri();
            return ResponseEntity.created(uri).build();
        }
    }*/

    @PostMapping("/fr.dauphine.gbiblio.livre.model.Livre")
    public void ajouterLivre(@RequestBody Livre livre){
        repository.save(livre);
    }

    @DeleteMapping("fr.dauphine.gbiblio.livre.model.Livre/isbn:{isbn}")
    public void supprimerLivre(@PathVariable String isbn){
        repository.delete(repository.findByIsbn(isbn));
    }

}
