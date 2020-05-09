package fr.dauphine.gbiblio.livre.model;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Long> {

    List<Livre> findAll();

    Livre findByIsbn(String isbn);

    List<Livre> findByAuteur(String auteur);
}
