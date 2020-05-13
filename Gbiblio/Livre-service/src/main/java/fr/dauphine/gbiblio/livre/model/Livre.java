package fr.dauphine.gbiblio.livre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/* Classe persistente representant  un fr.dauphine.gbiblio.livre.model.Livre */
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

    @Override
    public String toString(){
        return "isbn : " + this.isbn + " ;\n titre : " + this.titre + " ;\n auteur : " + this.auteur + " ;\n editeur : " + this.editeur + " ;\n edition : " + this.edition;
    }

    @Override
    public boolean equals(Object obj){
        boolean retour = false;
        if (obj!= null && (obj.getClass().equals(this.getClass()))){
            if (obj instanceof Livre){
                Livre e = (Livre)obj;
                retour = this.isbn == e.getIsbn() && this.auteur.equals(e.getAuteur()) && this.titre.equals(e.getTitre()) && this.editeur.equals(e.getEditeur()) && this.edition == e.getEdition();
            }
        }
        return(retour);
    }
}
