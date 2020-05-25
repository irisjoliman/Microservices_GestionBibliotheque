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

public class Gestion_Emprunt_Recherche_DateRetour_Lien extends JPanel {
	static JFrame f;
	public Gestion_Emprunt_Recherche_DateRetour_Lien(JTextField dateRetour)
	{
		JPanel Jforme = new JPanel(); 
		Jforme.setLayout(new GridLayout(20, 3));
		JLabel messAcc = new JLabel("Voici le lien permettant de retrouver les emprunts associes à la date de retour: " + dateRetour.getText());
		Jforme.add(messAcc, BorderLayout.CENTER); 
		//this.setLayout(new BorderLayout());
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		JTextField lien = new JTextField("                             http://localhost:8002/getEmprunt/Date_Retour/"+dateRetour.getText());
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
		JButton retour =new JButton("Revenir au menu de recherche par date de retour");
		Jforme.add(retour, BorderLayout.SOUTH);
		this.add(Jforme);
		
		retour.addActionListener(new ListenerFrame10());
	}
	
}

class ListenerFrame10 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Revenir au menu de recherche par date de retour"){
			
			Gestion_Emprunt_Recherche_DateRetour.f = new JFrame();
			Gestion_Emprunt_Recherche_DateRetour.f.add( new Gestion_Emprunt_Recherche_DateRetour());
			Gestion_Emprunt_Recherche_DateRetour.f.setSize(500,500);
			Gestion_Emprunt_Recherche_DateRetour.f.setVisible(true);
			Gestion_Emprunt_Recherche_DateRetour_Lien.f.dispose();
		}
	}
	
}