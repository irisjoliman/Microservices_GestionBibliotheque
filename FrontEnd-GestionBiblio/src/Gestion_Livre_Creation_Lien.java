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

public class Gestion_Livre_Creation_Lien extends JPanel {
	static JFrame f;
	public Gestion_Livre_Creation_Lien(JTextField isbn,JTextField auteur,JTextField titre,JTextField editeur,JTextField edition)
	{
		JPanel Jforme = new JPanel(); 
		Jforme.setLayout(new GridLayout(15, 3));
		JLabel messAcc = new JLabel("Voici le lien permettant de créer le livre renseigné précédemment:");
		Jforme.add(messAcc, BorderLayout.NORTH); 
		//this.setLayout(new BorderLayout());
		JTextArea lien=new JTextArea(
				"{"+'\n'+
						"	\"isbn\":\""+isbn.getText()+"\","+'\n'+
						"	\"auteur\":\""+auteur.getText()+"\","+'\n'+	
						"	\"titre\":\""+titre.getText()+"\","+'\n'+
						"	\"editeur\":\""+editeur.getText()+"\","+'\n'+
						"	\"edition\":"+edition.getText()+","+'\n'+
				"}"
				);
		
		lien.setEditable(false);
		lien.setBorder(null);
		Jforme.add(lien, BorderLayout.CENTER);
		Jforme.add(new Label(""));
		
		
		
		JButton retour =new JButton("Revenir au menu de création de livre");
		
		Jforme.add(retour, BorderLayout.SOUTH);
		this.add(Jforme);
		
		retour.addActionListener(new ListenerFrame32());
	}
	
}

class ListenerFrame32 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Revenir au menu de création de livre"){
			
			Gestion_Livre_Creation.f = new JFrame();
			Gestion_Livre_Creation.f.add( new Gestion_Livre_Creation());
			Gestion_Livre_Creation.f.setSize(500,500);
			Gestion_Livre_Creation.f.setVisible(true);
			Gestion_Livre_Creation_Lien.f.dispose();
		}
	}
	
}