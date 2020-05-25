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

public class Gestion_Livre_Creation extends JPanel{
	static JFrame f;
	
	public Gestion_Livre_Creation()
	{
		
		JPanel Jforme = new JPanel(); 
		
		 //Mise en forme de l'interface
this.setLayout(new BorderLayout());
Jforme.setLayout(new GridLayout(17,2)); 
this.add(Jforme , BorderLayout.CENTER); 

JLabel messAcc = new JLabel("                  Veuillez entrer ci-dessous les caractéristiques du livre à créer:");
Jforme.add(messAcc, BorderLayout.CENTER); 
Jforme.add(new Label(""));
Jforme.add(new Label(""));

Jforme.add(new JLabel("ISBN:"));
JTextField isbn = new JTextField("");
Jforme.add(isbn);
Jforme.add(new JLabel("Auteur:"));
JTextField auteur = new JTextField("");
Jforme.add(auteur);
Jforme.add(new JLabel("Titre:"));
JTextField titre = new JTextField("");
Jforme.add(titre);
Jforme.add(new JLabel("Editeur:"));
JTextField editeur = new JTextField("");
Jforme.add(editeur);
Jforme.add(new JLabel("Edition:"));
JTextField edition = new JTextField("");
Jforme.add(edition);




JPanel Jbutton = new JPanel(); 

JButton retour = new JButton ("Retour"); 
Jbutton.add(retour); 
JButton suivant = new JButton("Suivant"); 
Jbutton.add(suivant);
this.add(Jbutton , BorderLayout.SOUTH); 

retour.addActionListener(new ListenerFrame31(isbn, auteur, titre, editeur, edition));
suivant.addActionListener(new ListenerFrame31(isbn, auteur, titre, editeur, edition));

		
	}
}

class ListenerFrame31 extends JFrame implements ActionListener{

	private JTextField isbn;
	private JTextField auteur;
	private JTextField titre;
	private JTextField editeur;
	private JTextField edition;
	
	public ListenerFrame31(JTextField isbn,JTextField auteur,JTextField titre,JTextField editeur,JTextField edition)
	{
		this.isbn=isbn;
		this.auteur=auteur;
		this.titre=titre;
		this.editeur=editeur;
		this.edition=edition;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Retour"){
			
			GestionLivre.f = new JFrame();
			GestionLivre.f.add( new GestionLivre());
			GestionLivre.f.setSize(500,500);
			GestionLivre.f.setVisible(true);
			Gestion_Livre_Creation.f.dispose();
			}
		
		if (e.getActionCommand()== "Suivant"){
			
			Gestion_Livre_Creation_Lien.f = new JFrame();
			Gestion_Livre_Creation_Lien.f.add( new Gestion_Livre_Creation_Lien(this.isbn, this.auteur,this.titre,this.editeur,this.edition));
			Gestion_Livre_Creation_Lien.f.setSize(500,500);
			Gestion_Livre_Creation_Lien.f.setVisible(true);
			Gestion_Livre_Creation.f.dispose();
		}
	}

}
