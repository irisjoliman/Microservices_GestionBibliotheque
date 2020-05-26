package fr.dauphine.gbiblio.emprunt.web;

import fr.dauphine.gbiblio.emprunt.model.Emprunt;
import fr.dauphine.gbiblio.emprunt.model.EmpruntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.SSLEngineResult;
import java.util.ArrayList;
import java.util.List;

//      http://localhost:8002/h2-console pour accéder à la base de donnée
//      http://localhost:8002/getEmprunt/id/1 pour accéder à l'emprunt
//      http://localhost:8002/getEmprunt/isbn/1234567892 pour accéder aux emprunts associés à un livre
//      http://localhost:8002/getEmprunt/lecteur/1 pour accéder aux emprunts associés à un lecteur
//      http://localhost:8002/getEmprunt/Date_Pret/06-05-2020 pour accéder aux emprunts associés à une date d'emprunt
//      http://localhost:8002/getEmprunt/Date_Retour/05-05-2020 pour accéder aux emprunts associés à une date de retour
//      http://localhost:8002/getEmprunt/All pour accéder à la liste de tous les emprunts
//      http://localhost:8002/getEmprunt/Emprunt_En_Cours pour accéder à tous les emprunts en cours


@RestController
public class EmpruntController {

    @Autowired
    private EmpruntRepository repository;
	
	@GetMapping("/getEmprunt/id/{id}")
    public Emprunt recupereEmpruntParId(@PathVariable int id){
        return repository.findById(id);
    }

    @GetMapping("/getEmprunt/isbn/{isbn}")
    public Emprunt recupereEmpruntParIsbn(@PathVariable String isbn){
        return (Emprunt) repository.findByIsbn(isbn);
    }

    @GetMapping("/getEmprunt/lecteur/{lecteur}")
    public List<Emprunt> recupereLivreParLecteur(@PathVariable int lecteur){
        return repository.findByLecteur(lecteur);
    }

    @GetMapping("/getEmprunt/Datepret/{datepret}")
    public List<Emprunt> recupereLivreParDatePret(@PathVariable String datepret){
        List<Emprunt> emprunt= repository.findByDatepret(datepret);
        return emprunt;
    }
	
	@GetMapping("/getEmprunt/Dateretour/{dateretour}")
    public List<Emprunt> recupereLivreParDateretour(@PathVariable String dateretour){
        List<Emprunt> emprunt = repository.findByDateretour(dateretour);
        return emprunt;
    }
	
	@GetMapping("/getEmprunt/All")
    public List<Emprunt> recupereTousLesEmprunts(){
        List<Emprunt> emprunt = repository.findAll();
        return emprunt;
    }
	
	@GetMapping("/getEmprunt/Emprunt_En_Cours")
    public List<Emprunt> recupereTousLesEmpruntsEnCours(){
        List<Emprunt> emprunter = repository.findAll();
        List<Emprunt> emprunt_en_cours = new ArrayList<Emprunt>();
		for (Emprunt e : emprunter)
		{
			if(e.getDateretour().compareTo("31-12-3000")<0) {
                emprunt_en_cours.add(e);
            }
		}
		return emprunt_en_cours;
    }

    // http://localhost:8002/Emprunt
    @PostMapping("/Emprunt")
    public void ajouterEmprunt(@RequestBody Emprunt emprunter){
        repository.save(emprunter);
    }
	
	// http://localhost:8002/DelEmprunt/id:2
    @DeleteMapping("DelEmprunt/id:{id}")
    public void supprimerEmprunt(@PathVariable int id){
        repository.delete(repository.findById(id));
    }

}
