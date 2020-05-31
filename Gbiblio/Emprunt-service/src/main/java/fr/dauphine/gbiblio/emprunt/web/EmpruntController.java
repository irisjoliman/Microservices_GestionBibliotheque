package fr.dauphine.gbiblio.emprunt.web;

import fr.dauphine.gbiblio.emprunt.model.Emprunt;
import fr.dauphine.gbiblio.emprunt.model.EmpruntRepository;
import fr.dauphine.gbiblio.emprunt.web.exceptions.EmpruntIntrouvableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//      http://192.168.99.100:9090/h2-console pour accéder à la base de donnée
//      http://192.168.99.100:9090/getEmprunt/id/1 pour accéder à l'emprunt par id
//      http://192.168.99.100:9090/getEmprunt/isbn/1234567892 pour accéder aux emprunts associés à un livre (isbn)
//      http://192.168.99.100:9090/getEmprunt/lecteur/1 pour accéder aux emprunts associés à un lecteur
//      http://192.168.99.100:9090/getEmprunt/Datepret/06-05-2020 pour accéder aux emprunts associés à une date d'emprunt
//      http://192.168.99.100:9090/getEmprunt/Dateretour/05-05-2020 pour accéder aux emprunts associés à une date de retour
//      http://192.168.99.100:9090/getEmprunt/All pour accéder à la liste de tous les emprunts
//      http://192.168.99.100:9090/getEmprunt/Emprunt_En_Cours pour accéder à tous les emprunts en cours

//      http://localhost:8002/getEmprunt/id/1 pour accéder à l'emprunt par id
//      http://localhost:8002/getEmprunt/isbn/1234567892 pour accéder aux emprunts associés à un livre (isbn)
//      http://localhost:8002/getEmprunt/lecteur/1 pour accéder aux emprunts associés à un lecteur
//      http://localhost:8002/getEmprunt/Datepret/06-05-2020 pour accéder aux emprunts associés à une date d'emprunt
//      http://localhost:8002/getEmprunt/Dateretour/05-05-2020 pour accéder aux emprunts associés à une date de retour
//      http://localhost:8002/getEmprunt/All pour accéder à la liste de tous les emprunts
//      http://localhost:8002/getEmprunt/Emprunt_En_Cours pour accéder à tous les emprunts en cours


@RestController
public class EmpruntController {

    @Autowired
    private EmpruntRepository repository;
	
	@GetMapping("/getEmprunt/id/{id}")
    public Emprunt recupereEmpruntParId(@PathVariable int id){
        Emprunt emprunt = repository.findById(id);
        if(emprunt == null) throw new EmpruntIntrouvableException("Pas d'emprunt d'id : " + id + ".");
        return(emprunt);
    }

    @GetMapping("/getEmprunt/isbn/{isbn}")
    public List<Emprunt> recupereEmpruntParIsbn(@PathVariable String isbn){
        List<Emprunt> emprunts = repository.findByIsbn(isbn);
        if(emprunts == null) throw new EmpruntIntrouvableException("Pas d'emprunt possédant un livre ayant pour isbn : " + isbn + ".");
	    return emprunts;
    }

    @GetMapping("/getEmprunt/lecteur/{lecteur}")
    public List<Emprunt> recupereEmpruntParLecteur(@PathVariable int lecteur){
        List<Emprunt> emprunts =  repository.findByLecteur(lecteur);
        if(emprunts == null) throw new EmpruntIntrouvableException("Pas d'emprunt possédant un lecteur ayant pour id : " + lecteur + ".");
        return(emprunts);
    }

    @GetMapping("/getEmprunt/Datepret/{datepret}")
    public List<Emprunt> recupereEmpruntParDatepret(@PathVariable String datepret){
        List<Emprunt> emprunts= repository.findByDatepret(datepret);
        if(emprunts == null) throw new EmpruntIntrouvableException("Pas d'emprunt possédant une date de pret =  " + datepret + ".");
        return emprunts;
    }
	
	@GetMapping("/getEmprunt/Dateretour/{dateretour}")
    public List<Emprunt> recupereEmpruntParDateretour(@PathVariable String dateretour){
        List<Emprunt> emprunts = repository.findByDateretour(dateretour);
        if(emprunts == null) throw new EmpruntIntrouvableException("Pas d'emprunt possédant une date de retour =  " + dateretour + ".");
        return emprunts;
    }
	
	@GetMapping("/getEmprunt/All")
    public List<Emprunt> recupereTousLesEmprunts(){
        List<Emprunt> emprunts = repository.findAll();
        if(emprunts == null) throw new EmpruntIntrouvableException("Pas d'emprunt référencé dans la bibliothèque.");
        return emprunts;
    }
	
	@GetMapping("/getEmprunt/Emprunt_En_Cours")
    public List<Emprunt> recupereTousLesEmpruntsEnCours(){
        List<Emprunt> emprunter = repository.findAll();
        List<Emprunt> emprunt_en_cours = new ArrayList<Emprunt>();
		for (Emprunt e : emprunter)
		{
			if(e.getDateretour().equals("notreturnedyet")) {
                emprunt_en_cours.add(e);
            }
		}
        if(emprunt_en_cours == null) throw new EmpruntIntrouvableException("Pas d'emprunt en cours.");
		return emprunt_en_cours;
    }


    @PostMapping("/Emprunt")
    public void ajouterEmprunt(@RequestBody Emprunt emprunter){
        repository.save(emprunter);
    }
	
	
    @DeleteMapping("/Emprunt/id:{id}")
    public void supprimerEmprunt(@PathVariable int id){
        repository.delete(repository.findById(id));
    }

}
