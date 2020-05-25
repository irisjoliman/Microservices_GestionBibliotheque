import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gestion_Lecteur_Creation_Lien extends JPanel {
	static JFrame f;
	public Gestion_Lecteur_Creation_Lien(JTextField id,JTextField genre,JTextField nom,JTextField prenom,JTextField dateNaissance, JTextField adresse)
	{
		JPanel Jforme = new JPanel(); 
		Jforme.setLayout(new GridLayout(20, 3));
		JLabel messAcc = new JLabel("Voici le lien permettant de créer le lecteur renseigné précédemment:");
		Jforme.add(messAcc, BorderLayout.NORTH); 
		//this.setLayout(new BorderLayout());
		JTextArea lien=new JTextArea(
				"{"+'\n'+
						"	\"id\":"+id.getText()+","+'\n'+
						"	\"genre\":\""+genre.getText()+"\","+'\n'+	
						"	\"nom\":\""+nom.getText()+"\","+'\n'+
						"	\"prenom\":\""+prenom.getText()+"\","+'\n'+
						"	\"datenaissance\":\""+dateNaissance.getText()+"\","+'\n'+
						"	\"adresse\":\""+adresse.getText()+"\","+'\n'+
				"}"
				);
		
		lien.setEditable(false);
		lien.setBorder(null);
		Jforme.add(lien, BorderLayout.CENTER);
		Jforme.add(new Label(""));
		
		
		JButton retour =new JButton("Revenir au menu de création de lecteur");
		Jforme.add(retour, BorderLayout.SOUTH);
		this.add(Jforme);
		
		retour.addActionListener(new ListenerFrame30());
	}
	
}

class ListenerFrame30 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Revenir au menu de création de lecteur"){
			
			Gestion_Lecteur_Creation.f = new JFrame();
			Gestion_Lecteur_Creation.f.add( new Gestion_Lecteur_Creation());
			Gestion_Lecteur_Creation.f.setSize(500,500);
			Gestion_Lecteur_Creation.f.setVisible(true);
			Gestion_Lecteur_Creation_Lien.f.dispose();
		}
	}
	
}