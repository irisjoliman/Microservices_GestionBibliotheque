package fr.dauphine.gbiblio.Gbiblio.microserviceLivre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Date;

//      http://localhost:8000/h2-console pour accéder à la base de donnée
//      http://localhost:8000/getEmprunt/id/1 pour accéder à l'emprunt
//      http://localhost:8000/getEmprunt/isbn/1234567892 pour accéder aux emprunts associés à un livre
//      http://localhost:8000/getEmprunt/lecteur/1 pour accéder aux emprunts associés à un lecteur
//      http://localhost:8000/getEmprunt/Date_Pret/06-05-2020 pour accéder aux emprunts associés à une date d'emprunt
//      http://localhost:8000/getEmprunt/Date_Retour/05-05-2020 pour accéder aux emprunts associés à une date de retour
//      http://localhost:8000/getEmprunt/All pour accéder à la liste de tous les emprunts
//      http://localhost:8000/getEmprunt/Emprunt_En_Cours pour accéder à tous les emprunts en cours


@RestController
public class EmprunterController {

    @Autowired
    private EmprunterRepository repository;
	
	@GetMapping("/getEmprunt/id/{id}")
    public Emprunter recupereEmpruntParId(@PathVariable int id){
        Emprunter emprunter = repository.findById(id);
        return emprunter;
    }

    @GetMapping("/getEmprunt/isbn/{isbn}")
    public Emprunter recupereEmpruntParIsbn(@PathVariable String isbn){
        Emprunter emprunter = repository.findByIsbn(isbn);
        return emprunter;
    }

    @GetMapping("/getEmprunt/lecteur/{lecteur}")
    public List<Emprunter> recupereLivreParLecteur(@PathVariable int lecteur){
        List<Emprunter> emprunter = repository.findByLecteur(lecteur);
        return emprunter;
    }

    @GetMapping("/getEmprunt/Date_Pret/{date_pret}")
    public List<Emprunter> recupereLivreParDatePret(@PathVariable String date_pret){
        List<Emprunter> emprunter = repository.findByDatePret(date_pret);
        return emprunter;
    }
	
	@GetMapping("/getEmprunt/Date_Retour/{date_retour}")
    public List<Emprunter> recupereLivreParDateRetour(@PathVariable String date_retour){
        List<Emprunter> emprunter = repository.findByDateRetour(date_retour);
        return emprunter;
    }
	
	@GetMapping("/getEmprunt/All")
    public List<Emprunter> recupereTousLesEmprunts(){
        List<Emprunter> emprunter = repository.findAll();
        return emprunter;
    }
	
	@GetMapping("/getEmprunt/Emprunt_En_Cours")
    public List<Emprunter> recupereTousLesEmprunts(){
        List<Emprunter> emprunter = repository.findAll();
        List<Emprunter> emprunt_en_cours = new List<Emprunter>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		for (Emprunter e : emprunter)
		{
			if(e.getDateRetour<formatter)
				emprunt_en_cours.add(e);
		}
		return emprunt_en_cours;
    }


    @PostMapping("/Emprunt")
    public void ajouterEmprunt(@RequestBody Emprunter emprunter){
        repository.save(emprunter);
    }
	
	
    @DeleteMapping("Emprunt/id:{id}")
    public void supprimerEmprunt(@PathVariable int id){
        repository.delete(repository.findById(id));
    }

}
