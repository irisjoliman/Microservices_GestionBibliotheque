import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GestionLivre extends JPanel {
	static JFrame f;

public GestionLivre() {
	JPanel Jforme = new JPanel(); 
	 
	JLabel messAcc = new JLabel("Veuillez choisir le service souhaité parmis:");
	Jforme.add(messAcc, BorderLayout.NORTH); 
	this.setLayout(new BorderLayout());
	JPanel Jbutton = new JPanel();
	Jbutton.setLayout(new GridLayout(14,1)); 
	this.add(Jforme , BorderLayout.CENTER); 
	JButton ajoutLivre= new JButton("Ajouter un livre à la bibliothèque");
	JButton modifLivre= new JButton("Modifier un livre de la bibliothèque");
	JButton suppLivre= new JButton("Supprimer un livre de la bibliothèque");
	JButton listTousLivre= new JButton("Afficher tous les livres de la bibliothèque");
	JButton listIsbnLivre= new JButton("Rechercher un livre par ISBN");
	JButton listAuteurLivre= new JButton("Rechercher des livres par auteur");
	JButton retour= new JButton("Retour à l'accueil");
	Jbutton.add(ajoutLivre, BorderLayout.CENTER);
	Jbutton.add(new Label(""), BorderLayout.CENTER);
	Jbutton.add(modifLivre, BorderLayout.CENTER);
	Jbutton.add(new Label(""), BorderLayout.CENTER);
	Jbutton.add(suppLivre, BorderLayout.CENTER);
	Jbutton.add(new Label(""), BorderLayout.CENTER);
	Jbutton.add(listTousLivre, BorderLayout.CENTER);
	Jbutton.add(new Label(""), BorderLayout.CENTER);
	Jbutton.add(listIsbnLivre, BorderLayout.CENTER);
	Jbutton.add(new Label(""), BorderLayout.CENTER);
	Jbutton.add(listAuteurLivre, BorderLayout.CENTER);
	Jbutton.add(new Label(""), BorderLayout.CENTER);
	Jbutton.add(retour, BorderLayout.CENTER);
	this.add(Jforme);
	this.add(Jbutton, BorderLayout.SOUTH);
	
	ajoutLivre.addActionListener(new ListenerFrame21());
	modifLivre.addActionListener(new ListenerFrame21());
	suppLivre.addActionListener(new ListenerFrame21());
	listTousLivre.addActionListener(new ListenerFrame21());
	listIsbnLivre.addActionListener(new ListenerFrame21());
	listAuteurLivre.addActionListener(new ListenerFrame21());
	retour.addActionListener(new ListenerFrame21());
}


}

class ListenerFrame21 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Ajouter un livre à la bibliothèque"){
			
			Gestion_Livre_Creation.f = new JFrame();
			Gestion_Livre_Creation.f.add( new Gestion_Livre_Creation());
			Gestion_Livre_Creation.f.setSize(500,500);
			Gestion_Livre_Creation.f.setVisible(true);
			GestionLivre.f.dispose();
			}
		if (e.getActionCommand()== "Modifier un livre de la bibliothèque"){
	
			
			}
		if (e.getActionCommand()== "Supprimer un livre de la bibliothèque"){
	
			
			}
		if (e.getActionCommand()== "Afficher tous les livres de la bibliothèque"){
	
			Gestion_Livre_Affichage_all.f = new JFrame();
			Gestion_Livre_Affichage_all.f.add( new Gestion_Livre_Affichage_all());
			Gestion_Livre_Affichage_all.f.setSize(500,500);
			Gestion_Livre_Affichage_all.f.setVisible(true);
			GestionLivre.f.dispose();
			}
		if (e.getActionCommand()== "Rechercher un livre par ISBN"){
	
			Gestion_Livre_Recherche_ISBN.f = new JFrame();
			Gestion_Livre_Recherche_ISBN.f.add( new Gestion_Livre_Recherche_ISBN());
			Gestion_Livre_Recherche_ISBN.f.setSize(500,500);
			Gestion_Livre_Recherche_ISBN.f.setVisible(true);
			GestionLivre.f.dispose();
			}
		if (e.getActionCommand()== "Rechercher des livres par auteur"){
	
			Gestion_Livre_Recherche_Auteur.f = new JFrame();
			Gestion_Livre_Recherche_Auteur.f.add( new Gestion_Livre_Recherche_Auteur());
			Gestion_Livre_Recherche_Auteur.f.setSize(500,500);
			Gestion_Livre_Recherche_Auteur.f.setVisible(true);
			GestionLivre.f.dispose();
			}
		
		if (e.getActionCommand()== "Retour à l'accueil"){
	
			
			ApiGateway.f = new JFrame();
			ApiGateway.f.add( new ApiGateway());
			ApiGateway.f.setSize(500,500);
			ApiGateway.f.setVisible(true);
			GestionLivre.f.dispose();
			
		}
	}
	
}

