import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gestion_Lecteur_Creation extends JPanel{
	static JFrame f;
	
	public Gestion_Lecteur_Creation()
	{
		
		JPanel Jforme = new JPanel(); 
		
		 //Mise en forme de l'interface
this.setLayout(new BorderLayout());
Jforme.setLayout(new GridLayout(17,2)); 
this.add(Jforme , BorderLayout.CENTER); 

JLabel messAcc = new JLabel("                  Veuillez entrer ci-dessous les caractéristiques du lecteur à créer:");
Jforme.add(messAcc, BorderLayout.CENTER); 
Jforme.add(new Label(""));
Jforme.add(new Label(""));

Jforme.add(new JLabel("ID:"));
JTextField id = new JTextField("");
Jforme.add(id);
Jforme.add(new JLabel("Genre:"));
JTextField genre = new JTextField("");
Jforme.add(genre);
Jforme.add(new JLabel("Nom:"));
JTextField nom = new JTextField("");
Jforme.add(nom);
Jforme.add(new JLabel("Prenom:"));
JTextField prenom = new JTextField("");
Jforme.add(prenom);
Jforme.add(new JLabel("Date de naissance:"));
JTextField dateNaissance = new JTextField("");
Jforme.add(dateNaissance);
Jforme.add(new JLabel("Adresse:"));
JTextField adresse = new JTextField("");
Jforme.add(adresse);




JPanel Jbutton = new JPanel(); 

JButton retour = new JButton ("Retour"); 
Jbutton.add(retour); 
JButton suivant = new JButton("Suivant"); 
Jbutton.add(suivant);
this.add(Jbutton , BorderLayout.SOUTH); 

retour.addActionListener(new ListenerFrame29(id, genre, nom, prenom, dateNaissance, adresse));
suivant.addActionListener(new ListenerFrame29(id, genre, nom, prenom, dateNaissance, adresse));

		
	}
}

class ListenerFrame29 extends JFrame implements ActionListener{

	private JTextField id;
	private JTextField genre;
	private JTextField nom;
	private JTextField prenom;
	private JTextField dateNaissance;
	private JTextField adresse;
	
	public ListenerFrame29(JTextField id,JTextField genre,JTextField nom,JTextField prenom,JTextField dateNaissance, JTextField adresse)
	{
		this.id=id;
		this.genre=genre;
		this.nom=nom;
		this.prenom=prenom;		
		this.dateNaissance=dateNaissance;
		this.adresse=adresse;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Retour"){
			
			GestionLecteur.f = new JFrame();
			GestionLecteur.f.add( new GestionLecteur());
			GestionLecteur.f.setSize(500,500);
			GestionLecteur.f.setVisible(true);
			Gestion_Lecteur_Creation.f.dispose();
			}
		
		if (e.getActionCommand()== "Suivant"){
			
			Gestion_Lecteur_Creation_Lien.f = new JFrame();
			Gestion_Lecteur_Creation_Lien.f.add( new Gestion_Lecteur_Creation_Lien(this.id, this.genre,this.nom,this.prenom,this.dateNaissance, this.adresse));
			Gestion_Lecteur_Creation_Lien.f.setSize(500,500);
			Gestion_Lecteur_Creation_Lien.f.setVisible(true);
			Gestion_Lecteur_Creation.f.dispose();
		}
	}

}
