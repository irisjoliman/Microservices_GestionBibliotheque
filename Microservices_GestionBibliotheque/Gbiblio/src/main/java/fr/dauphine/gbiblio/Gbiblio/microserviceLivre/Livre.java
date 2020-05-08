package fr.dauphine.gbiblio.Gbiblio.microserviceLivre;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/* Classe persistente representant  un Livre */
@Entity
public class Livre {
    @Id
    private String isbn;
    @Column(name = "Auteur")
    private String auteur;
    @Column(name = "Titre")
    private String titre;
    @Column(name = "Editeur")
    private String editeur;
    @Column(name = "Edition")
    private int edition;

    public Livre(){}

    public Livre(String isbn, String auteur, String titre, String editeur, int edition){
        this.isbn = isbn;
        this.auteur = auteur;
        this.titre = titre;
        this.editeur = editeur;
        this.edition = edition;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}
