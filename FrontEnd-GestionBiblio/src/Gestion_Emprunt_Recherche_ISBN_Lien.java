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

public class Gestion_Emprunt_Recherche_ISBN_Lien extends JPanel {
	static JFrame f;
	public Gestion_Emprunt_Recherche_ISBN_Lien(JTextField isbn)
	{
		JPanel Jforme = new JPanel(); 
		Jforme.setLayout(new GridLayout(20, 3));
		JLabel messAcc = new JLabel("Voici le lien permettant de retrouver les emprunts associes à l'ISBN: " + isbn.getText());
		Jforme.add(messAcc, BorderLayout.CENTER); 
		//this.setLayout(new BorderLayout());
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		Jforme.add(new Label(""), BorderLayout.CENTER);
		JTextField lien = new JTextField("                             http://localhost:8002/getEmprunt/isbn/"+isbn.getText());
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
		JButton retour =new JButton("Revenir au menu de recherche par ISBN");
		Jforme.add(retour, BorderLayout.SOUTH);
		this.add(Jforme);
		
		retour.addActionListener(new ListenerFrame5());
	}
	
}

class ListenerFrame5 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Revenir au menu de recherche par ISBN"){
			
			Gestion_Emprunt_Recherche_ISBN.f = new JFrame();
			Gestion_Emprunt_Recherche_ISBN.f.add( new Gestion_Emprunt_Recherche_ISBN());
			Gestion_Emprunt_Recherche_ISBN.f.setSize(500,500);
			Gestion_Emprunt_Recherche_ISBN.f.setVisible(true);
			Gestion_Emprunt_Recherche_ISBN_Lien.f.dispose();
		}
	}
	
}