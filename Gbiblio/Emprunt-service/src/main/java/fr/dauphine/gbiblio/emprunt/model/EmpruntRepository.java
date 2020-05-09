package fr.dauphine.gbiblio.emprunt.model;

import fr.dauphine.gbiblio.emprunt.model.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {

    List<Emprunt> findAll();
	
	Emprunt findById(int id);

    List<Emprunt> findByIsbn(String isbn);

    List<Emprunt> findByLecteur(int lecteur);
	
	List<Emprunt> findByDatepret(String datepret);
	
	List<Emprunt> findByDateretour(String dateretour);
}
