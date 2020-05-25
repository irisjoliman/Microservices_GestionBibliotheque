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

public class Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom_Lien extends JPanel {
	static JFrame f;
	public Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom_Lien(JTextField nom, JTextField prenom)
	{
		JPanel Jforme = new JPanel(); 
		Jforme.setLayout(new GridLayout(20, 3));
		JLabel messAcc = new JLabel("Voici le lien permettant de retrouver les inforamtions associes au lecteur: " + nom.getText() + " " + prenom.getText());
		Jforme.add(messAcc, BorderLayout.CENTER); 
		//this.setLayout(new BorderLayout());
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		JTextField lien = new JTextField("                             http://localhost:8001/getLecteur/nom:"+nom.getText()+"/prenom:"+prenom.getText());
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
		JButton retour =new JButton("Revenir au menu de recherche des informations d'un lecteur");
		Jforme.add(retour, BorderLayout.SOUTH);
		this.add(Jforme);
		
		retour.addActionListener(new ListenerFrame18());
	}
	
}

class ListenerFrame18 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Revenir au menu de recherche des informations d'un lecteur"){
			
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom.f = new JFrame();
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom.f.add( new Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom());
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom.f.setSize(600,500);
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom.f.setVisible(true);
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom_Lien.f.dispose();
		}
	}
	
}