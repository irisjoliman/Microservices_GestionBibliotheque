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

public class Gestion_Lecteur_Recherche_ID_Lien extends JPanel {
	static JFrame f;
	public Gestion_Lecteur_Recherche_ID_Lien(JTextField id)
	{
		JPanel Jforme = new JPanel(); 
		Jforme.setLayout(new GridLayout(20, 3));
		JLabel messAcc = new JLabel("Voici le lien permettant de retrouver les informations associées au lecteur: " + id.getText());
		Jforme.add(messAcc, BorderLayout.CENTER); 
		//this.setLayout(new BorderLayout());
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		JTextField lien = new JTextField("                             http://localhost:8001/getEmprunt/id/"+id.getText());
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
		JButton retour =new JButton("Revenir au menu de recherche par identifiant");
		Jforme.add(retour, BorderLayout.SOUTH);
		this.add(Jforme);
		
		retour.addActionListener(new ListenerFrame19());
	}
	
}

class ListenerFrame19 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Revenir au menu de recherche par identifiant"){
			
			Gestion_Lecteur_Recherche_ID.f = new JFrame();
			Gestion_Lecteur_Recherche_ID.f.add( new Gestion_Lecteur_Recherche_ID());
			Gestion_Lecteur_Recherche_ID.f.setSize(600,500);
			Gestion_Lecteur_Recherche_ID.f.setVisible(true);
			Gestion_Lecteur_Recherche_ID_Lien.f.dispose();
		}
	}
	
}