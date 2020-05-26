import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Gestion_Livre_Creation_Lien extends JPanel {
	static JFrame f;
	public Gestion_Livre_Creation_Lien(JTextField isbn,JTextField auteur,JTextField titre,JTextField editeur,JTextField edition) throws IOException {
		JPanel Jforme = new JPanel(); 
		Jforme.setLayout(new GridLayout(15, 3));
		JLabel messAcc = new JLabel("Voici le lien permettant de cr�er le livre renseign� pr�c�demment:");
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

		URL url = new URL("http://localhost:8002/Emprunt");
		String postData = "foo1=bar1&foo2=bar2";

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		conn.setRequestProperty("Content-Length", Integer.toString(postData.length()));
		conn.setUseCaches(false);



		JButton retour =new JButton("Revenir au menu de cr�ation de livre");
		
		Jforme.add(retour, BorderLayout.SOUTH);
		this.add(Jforme);
		
		retour.addActionListener(new ListenerFrame32());
	}
	
}

class ListenerFrame32 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Revenir au menu de cr�ation de livre"){
			
			Gestion_Livre_Creation.f = new JFrame();
			Gestion_Livre_Creation.f.add( new Gestion_Livre_Creation());
			Gestion_Livre_Creation.f.setSize(500,500);
			Gestion_Livre_Creation.f.setVisible(true);
			Gestion_Livre_Creation_Lien.f.dispose();
		}
	}
	
}