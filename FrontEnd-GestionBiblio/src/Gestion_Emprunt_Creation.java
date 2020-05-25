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

public class Gestion_Emprunt_Creation extends JPanel{
	static JFrame f;
	
	public Gestion_Emprunt_Creation()
	{
		
		JPanel Jforme = new JPanel(); 
		
		 //Mise en forme de l'interface
this.setLayout(new BorderLayout());
Jforme.setLayout(new GridLayout(17,2)); 
this.add(Jforme , BorderLayout.CENTER); 

JLabel messAcc = new JLabel("                  Veuillez entrer ci-dessous les caractéristiques de l'emprunt à créer:");
Jforme.add(messAcc, BorderLayout.CENTER); 
Jforme.add(new Label(""));
Jforme.add(new Label(""));

Jforme.add(new JLabel("ID:"));
JTextField id = new JTextField("");
Jforme.add(id);
Jforme.add(new JLabel("ISBN:"));
JTextField isbn = new JTextField("");
Jforme.add(isbn);
Jforme.add(new JLabel("Lecteur:"));
JTextField lecteur = new JTextField("");
Jforme.add(lecteur);
Jforme.add(new JLabel("Date de pret:"));
JTextField datePret = new JTextField("");
Jforme.add(datePret);
Jforme.add(new JLabel("Date de retour:"));
JTextField dateRetour = new JTextField("");
Jforme.add(dateRetour);




JPanel Jbutton = new JPanel(); 

JButton retour = new JButton ("Retour"); 
Jbutton.add(retour); 
JButton suivant = new JButton("Suivant"); 
Jbutton.add(suivant);
this.add(Jbutton , BorderLayout.SOUTH); 

retour.addActionListener(new ListenerFrame27(id, isbn, lecteur, datePret, dateRetour));
suivant.addActionListener(new ListenerFrame27(id, isbn, lecteur, datePret, dateRetour));

		
	}
}

class ListenerFrame27 extends JFrame implements ActionListener{

	private JTextField dateRetour;
	private JTextField datePret;
	private JTextField lecteur;
	private JTextField isbn;
	private JTextField id;
	
	public ListenerFrame27(JTextField id,JTextField isbn,JTextField lecteur,JTextField datePret,JTextField dateRetour)
	{
		this.id=id;
		this.isbn=isbn;
		this.lecteur=lecteur;
		this.datePret=datePret;
		this.dateRetour=dateRetour;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Retour"){
			
			GestionEmprunt.f = new JFrame();
			GestionEmprunt.f.add( new GestionEmprunt());
			GestionEmprunt.f.setSize(650,650);
			GestionEmprunt.f.setVisible(true);
			Gestion_Emprunt_Creation.f.dispose();
			}
		
		if (e.getActionCommand()== "Suivant"){
			
			Gestion_Emprunt_Creation_Lien.f = new JFrame();
			Gestion_Emprunt_Creation_Lien.f.add( new Gestion_Emprunt_Creation_Lien(this.id, this.isbn,this.lecteur,this.datePret,this.dateRetour));
			Gestion_Emprunt_Creation_Lien.f.setSize(500,500);
			Gestion_Emprunt_Creation_Lien.f.setVisible(true);
			Gestion_Emprunt_Creation.f.dispose();
		}
	}

}
