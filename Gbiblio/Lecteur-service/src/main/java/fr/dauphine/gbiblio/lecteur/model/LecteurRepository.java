package fr.dauphine.gbiblio.lecteur.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LecteurRepository extends JpaRepository<Lecteur, Long> {

    List<Lecteur> findAll();

    Lecteur findById(int id);

    Lecteur findByNomAndPrenom(String nom, String prenom);

}
