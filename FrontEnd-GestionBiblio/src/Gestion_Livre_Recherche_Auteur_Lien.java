import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gestion_Livre_Recherche_Auteur_Lien extends JPanel {
	static JFrame f;
	public Gestion_Livre_Recherche_Auteur_Lien(JTextField auteur)
	{
		JPanel Jforme = new JPanel(); 
		Jforme.setLayout(new GridLayout(20, 3));
		JLabel messAcc = new JLabel("Voici le lien permettant de retrouver les livres associés au lecteur: " + auteur.getText());
		Jforme.add(messAcc, BorderLayout.CENTER); 
		//this.setLayout(new BorderLayout());
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		JTextField lien = new JTextField("                                      http://localhost:8000/getLivre/auteur/"+auteur.getText());
		lien.setEditable(false);
		lien.setBorder(null);
		Jforme.add(lien, BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		JButton retour =new JButton("Revenir au menu de recherche par auteur");
		Jforme.add(retour, BorderLayout.SOUTH);
		this.add(Jforme);
		
		retour.addActionListener(new ListenerFrame26());
	}
	
}

class ListenerFrame26 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Revenir au menu de recherche par auteur"){
			
			Gestion_Livre_Recherche_Auteur.f = new JFrame();
			Gestion_Livre_Recherche_Auteur.f.add( new Gestion_Livre_Recherche_Auteur());
			Gestion_Livre_Recherche_Auteur.f.setSize(500,500);
			Gestion_Livre_Recherche_Auteur.f.setVisible(true);
			Gestion_Livre_Recherche_Auteur_Lien.f.dispose();
		}
	}
	
}