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

public class Gestion_Livre_Recherche_Auteur extends JPanel{
	static JFrame f;
	
	public Gestion_Livre_Recherche_Auteur()
	{
		
		JPanel Jforme = new JPanel(); 
		
		 //Mise en forme de l'interface
this.setLayout(new BorderLayout());
Jforme.setLayout(new GridLayout(17,2)); 
this.add(Jforme , BorderLayout.CENTER); 

JLabel messAcc = new JLabel("     Veuillez entrer ci-dessous le nom de l'auteur afin d'afficher les livres associés:");
Jforme.add(messAcc, BorderLayout.CENTER); 
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new JLabel("Auteur: "));
JTextField Auteur = new JTextField("");
Jforme.add(Auteur);
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

retour.addActionListener(new ListenerFrame25(Auteur));
suivant.addActionListener(new ListenerFrame25(Auteur));

		
	}
}

class ListenerFrame25 extends JFrame implements ActionListener{

	private JTextField auteur;
	
	public ListenerFrame25(JTextField auteur)
	{
		this.auteur=auteur;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Retour"){
			
			GestionLivre.f = new JFrame();
			GestionLivre.f.add( new GestionLivre());
			GestionLivre.f.setSize(500,500);
			GestionLivre.f.setVisible(true);
			Gestion_Livre_Recherche_Auteur.f.dispose();
			}
		
		if (e.getActionCommand()== "Suivant"){
			
			Gestion_Livre_Recherche_Auteur_Lien.f = new JFrame();
			Gestion_Livre_Recherche_Auteur_Lien.f.add( new Gestion_Livre_Recherche_Auteur_Lien(this.auteur));
			Gestion_Livre_Recherche_Auteur_Lien.f.setSize(500,500);
			Gestion_Livre_Recherche_Auteur_Lien.f.setVisible(true);
			Gestion_Livre_Recherche_Auteur.f.dispose();
		}
	}

}
