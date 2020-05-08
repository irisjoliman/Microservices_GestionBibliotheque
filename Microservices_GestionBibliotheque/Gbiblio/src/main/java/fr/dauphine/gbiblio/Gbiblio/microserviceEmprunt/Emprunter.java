package fr.dauphine.gbiblio.Gbiblio.microserviceLivre;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/* Classe persistente representant  un Emprunt */
@Entity
public class Emprunter {
    @Id
	private int id;
	@Column(name = "isbn")
    private String isbn;
    @Column(name = "lecteur")
    private int lecteur_id;
    @Column(name = "date_pret")
    private String date_pret;
    @Column(name = "date_retour")
    private String date_retour;
   

    public Emprunter(){}

    public Emprunter(int id, String isbn, Lecteur lecteur, String date_pret, String date_retour){
        this.id=id;
		this.isbn = isbn;
        this.lecteur = lecteur;
        this.date_pret = date_pret;
        this.date_retour = date_retour;
    }

	public String getId() {
        return id;
    }
    
	public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getLecteur() {
        return lecteur_id;
    }

    public void setLecteur(int lecteur_id) {
        this.lecteur_id = lecteur_id;
    }

    public String getDate_Pret() {
        return date_pret;
    }

    public void setDate_Pret(String date_pret) {
        this.date_pret = date_pret;
    }

    public String getDate_Retour() {
        return date_retour;
    }

    public void setDate_Retour(String date_retour) {
        this.date_retour = date_retour;
    }

	public boolean IsLivreEmprunter(List<Emprunt> emprunts)
	{
		boolean emprunter=false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		for(Emprunter e: emprunts)
		{
			if(this.getIsbn()==e.getIsbn)
				if(this.getDate_Pret<e.date_retour)
					emprunter=true;
		}
		return emprunter;
	}
}
