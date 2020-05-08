package fr.dauphine.gbiblio.Gbiblio.microserviceLivre;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmprunterRepository extends JpaRepository<Emprunter, Long> {

    List<Emprunter> findAll();
	
	List<Emprunter> findById(int id);

    List<Emprunter> findByIsbn(String isbn);

    List<Emprunter> findByLecteur(int lecteur_id);
	
	List<Emprunter> findByDatePret(String date_pret);
	
	List<Emprunter> findByDateRetour(String date_retour);
}
