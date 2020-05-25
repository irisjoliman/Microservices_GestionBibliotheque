import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gestion_Lecteur_Recherche_ID extends JPanel{
	static JFrame f;
	
	public Gestion_Lecteur_Recherche_ID()
	{
		
		JPanel Jforme = new JPanel(); 
		
		 //Mise en forme de l'interface
this.setLayout(new BorderLayout());
Jforme.setLayout(new GridLayout(17,2)); 
this.add(Jforme , BorderLayout.CENTER); 

JLabel messAcc = new JLabel("        Veuillez entrer ci-dessous l'identifiant afin d'afficher les informations associées à ce lecteur:");
Jforme.add(messAcc, BorderLayout.CENTER); 
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new JLabel("Identifiant: "));
JTextField id = new JTextField("");
Jforme.add(id);
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));



JPanel Jbutton = new JPanel(); 

JButton retour = new JButton ("Retour"); 
Jbutton.add(retour); 
JButton suivant = new JButton("Suivant"); 
Jbutton.add(suivant);
this.add(Jbutton , BorderLayout.SOUTH); 

retour.addActionListener(new ListenerFrame20(id));
suivant.addActionListener(new ListenerFrame20(id));

		
	}
}

class ListenerFrame20 extends JFrame implements ActionListener{

	private JTextField id;
	
	public ListenerFrame20(JTextField id)
	{
		this.id=id;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Retour"){
			
			GestionEmprunt.f = new JFrame();
			GestionEmprunt.f.add( new GestionEmprunt());
			GestionEmprunt.f.setSize(650,650);
			GestionEmprunt.f.setVisible(true);
			Gestion_Lecteur_Recherche_ID.f.dispose();
		}
		
		if (e.getActionCommand()== "Suivant"){
			
			Gestion_Lecteur_Recherche_ID_Lien.f = new JFrame();
			Gestion_Lecteur_Recherche_ID_Lien.f.add( new Gestion_Lecteur_Recherche_ID_Lien(this.id));
			Gestion_Lecteur_Recherche_ID_Lien.f.setSize(600,500);
			Gestion_Lecteur_Recherche_ID_Lien.f.setVisible(true);
			Gestion_Lecteur_Recherche_ID.f.dispose();
		}
	}

}
