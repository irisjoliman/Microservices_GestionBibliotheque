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

public class Gestion_Emprunt_Creation_Lien extends JPanel {
	static JFrame f;
	public Gestion_Emprunt_Creation_Lien(JTextField id,JTextField isbn,JTextField lecteur,JTextField datePret,JTextField dateRetour)
	{
		JPanel Jforme = new JPanel(); 
		Jforme.setLayout(new GridLayout(20, 3));
		JLabel messAcc = new JLabel("Voici le lien permettant de créer l'emprunt renseigné précédemment:");
		Jforme.add(messAcc, BorderLayout.NORTH); 
		//this.setLayout(new BorderLayout());
		JTextArea lien=new JTextArea(
				"{"+'\n'+
						"	\"id\":"+id.getText()+","+'\n'+
						"	\"isbn\":\""+isbn.getText()+"\","+'\n'+	
						"	\"lecteur\":"+lecteur.getText()+","+'\n'+
						"	\"datepret\":\""+datePret.getText()+"\","+'\n'+
						"	\"dateretour\":\""+dateRetour.getText()+"\","+'\n'+
				"}"
				);
		
		lien.setEditable(false);
		lien.setBorder(null);
		Jforme.add(lien, BorderLayout.CENTER);
		Jforme.add(new Label(""));

		
		JButton retour =new JButton("Revenir au menu de création d'emprunt");
		Jforme.add(retour, BorderLayout.SOUTH);
		this.add(Jforme);
		
		retour.addActionListener(new ListenerFrame28());
	}
	
}

class ListenerFrame28 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Revenir au menu de création d'emprunt"){
			
			Gestion_Emprunt_Creation.f = new JFrame();
			Gestion_Emprunt_Creation.f.add( new Gestion_Emprunt_Creation());
			Gestion_Emprunt_Creation.f.setSize(500,500);
			Gestion_Emprunt_Creation.f.setVisible(true);
			Gestion_Emprunt_Creation_Lien.f.dispose();
		}
	}
	
}