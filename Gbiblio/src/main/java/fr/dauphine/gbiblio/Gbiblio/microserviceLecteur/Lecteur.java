package fr.dauphine.gbiblio.Gbiblio.microserviceLecteur;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/* Classe persistente representant  un Livre */
@Entity
public class Lecteur {
    @Id
    private int id;
    @Column(name = "Genre")
    private char genre;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Prenom")
    private String prenom;
    @Column(name = "datenaissance")
    private String datenaissance;
    @Column(name = "Adresse")
    private String adresse;

    public Lecteur(){}

    public Lecteur(int id, char genre, String nom, String prenom, String datenaissance, String adresse){
        this.id = id;
        this.genre = genre;
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = datenaissance;
        this.adresse = adresse;
    }

    public int getIsbn() {
        return id;
    }

    public void setIsbn(int id) {
        this.id = id;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
