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

public class Gestion_Emprunt_Recherche_Lecteur extends JPanel{
	static JFrame f;
	
	public Gestion_Emprunt_Recherche_Lecteur()
	{
		
		JPanel Jforme = new JPanel(); 
		
		 //Mise en forme de l'interface
this.setLayout(new BorderLayout());
Jforme.setLayout(new GridLayout(17,2)); 
this.add(Jforme , BorderLayout.CENTER); 

JLabel messAcc = new JLabel("               Veuillez entrer ci-dessous le code du lecteur afin d'afficher tous les emprunts associes:");
Jforme.add(messAcc, BorderLayout.CENTER); 
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new JLabel("Lecteur: "));
JTextField Lecteur = new JTextField("");
Jforme.add(Lecteur);
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

retour.addActionListener(new ListenerFrame6(Lecteur));
suivant.addActionListener(new ListenerFrame6(Lecteur));

		
	}
}

class ListenerFrame6 extends JFrame implements ActionListener{

	private JTextField lecteur;
	
	public ListenerFrame6(JTextField lecteur)
	{
		this.lecteur=lecteur;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Retour"){
			
			GestionEmprunt.f = new JFrame();
			GestionEmprunt.f.add( new GestionEmprunt());
			GestionEmprunt.f.setSize(650,650);
			GestionEmprunt.f.setVisible(true);
			Gestion_Emprunt_Recherche_Lecteur.f.dispose();
		}
		
		if (e.getActionCommand()== "Suivant"){
			
			Gestion_Emprunt_Recherche_Lecteur_Lien.f = new JFrame();
			Gestion_Emprunt_Recherche_Lecteur_Lien.f.add( new Gestion_Emprunt_Recherche_Lecteur_Lien(this.lecteur));
			Gestion_Emprunt_Recherche_Lecteur_Lien.f.setSize(500,500);
			Gestion_Emprunt_Recherche_Lecteur_Lien.f.setVisible(true);
			Gestion_Emprunt_Recherche_Lecteur.f.dispose();
		}
	}

}
