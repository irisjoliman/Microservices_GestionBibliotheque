package fr.dauphine.gbiblio.Gbiblio.microserviceEmprunt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/* Classe persistente representant  un Emprunt */
@Entity
public class Emprunt {
    @Id
	private int id;
	@Column(name = "isbn")
    private String isbn;
    @Column(name = "lecteur")
    private int lecteur;
    @Column(name = "datepret")
    private String datepret;
    @Column(name = "dateretour")
    private String dateretour;
   

    public Emprunt(){}

    public Emprunt(int id, String isbn, int lecteur, String datepret, String dateretour){
        this.id=id;
		this.isbn = isbn;
        this.lecteur = lecteur;
        this.datepret = datepret;
        this.dateretour = dateretour;
    }

    public void setId(int id) {
        this.id = id;
    }

	public int getId() {
        return id;
    }
    
	public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getLecteur() {
        return lecteur;
    }

    public void setLecteur(int lecteur) {
        this.lecteur = lecteur;
    }

    public String getDatepret() {
        return datepret;
    }

    public void setDatepret(String datepret) {
        this.datepret = datepret;
    }

    public String getDateretour() {
        return dateretour;
    }

    public void setDateretour(String dateretour) {
        this.dateretour = dateretour;
    }

	public boolean IsEmpruntExistant(List<Emprunt> emprunts)
	{
		boolean emprunter=false;
		for(Emprunt e: emprunts)
		{
			if(this.equals(e))
				emprunter=true;
		}
		return emprunter;
	}
	
	@Override
    public boolean equals(Object obj){
        boolean retour = false;
        if (obj!= null && (obj.getClass().equals(this.getClass()))){
            if (obj instanceof Emprunt){
                Emprunt emprunt = (Emprunt)obj;
                retour = this.getIsbn()==e.getIsbn() && this.getId()==e.getId() && this.getLecteur()==e.getLecteur() && this.getDatepret()==e.getDatepret() && this.getDateretour()==e.getDateretour();
                }
            }

        return(retour);
    }

}
