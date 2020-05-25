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

public class Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom extends JPanel{
	static JFrame f;
	
	public Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom()
	{
		
		JPanel Jforme = new JPanel(); 
		
		 //Mise en forme de l'interface
this.setLayout(new BorderLayout());
Jforme.setLayout(new GridLayout(17,2)); 
this.add(Jforme , BorderLayout.CENTER); 

JLabel messAcc = new JLabel("               Veuillez entrer ci-dessous les nom et prenom du lecteur afin d'afficher ses informations:");
Jforme.add(messAcc, BorderLayout.CENTER); 
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new JLabel("Nom: "));
JTextField Nom = new JTextField("");
Jforme.add(Nom);
Jforme.add(new JLabel("Prenom: "));
JTextField Prenom = new JTextField("");
Jforme.add(Prenom);
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));



JPanel Jbutton = new JPanel(); 

JButton retour = new JButton ("Retour"); 
Jbutton.add(retour); 
JButton suivant = new JButton("Suivant"); 
Jbutton.add(suivant);
this.add(Jbutton , BorderLayout.SOUTH); 

retour.addActionListener(new ListenerFrame17(Nom, Prenom));
suivant.addActionListener(new ListenerFrame17(Nom, Prenom));

		
	}
}

class ListenerFrame17 extends JFrame implements ActionListener{

	private JTextField nom;
	private JTextField prenom;
	
	public ListenerFrame17(JTextField nom, JTextField prenom )
	{
		this.nom=nom;
		this.prenom=prenom;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Retour"){
			
			GestionEmprunt.f = new JFrame();
			GestionEmprunt.f.add( new GestionEmprunt());
			GestionEmprunt.f.setSize(650,650);
			GestionEmprunt.f.setVisible(true);
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom.f.dispose();
		}
		
		if (e.getActionCommand()== "Suivant"){
			
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom_Lien.f = new JFrame();
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom_Lien.f.add( new Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom_Lien(this.nom, this.prenom));
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom_Lien.f.setSize(600,500);
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom_Lien.f.setVisible(true);
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom.f.dispose();
		}
	}

}
