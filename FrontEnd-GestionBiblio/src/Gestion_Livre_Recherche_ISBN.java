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

public class Gestion_Livre_Recherche_ISBN extends JPanel{
	static JFrame f;
	
	public Gestion_Livre_Recherche_ISBN()
	{
		
		JPanel Jforme = new JPanel(); 
		
		 //Mise en forme de l'interface
this.setLayout(new BorderLayout());
Jforme.setLayout(new GridLayout(17,2)); 
this.add(Jforme , BorderLayout.CENTER); 

JLabel messAcc = new JLabel("     Veuillez entrer ci-dessous l'ISBN afin d'afficher les informations du livre associ�:");
Jforme.add(messAcc, BorderLayout.CENTER); 
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new JLabel("ISBN: "));
JTextField ISBN = new JTextField("");
Jforme.add(ISBN);
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

retour.addActionListener(new ListenerFrame23(ISBN));
suivant.addActionListener(new ListenerFrame23(ISBN));

		
	}
}

class ListenerFrame23 extends JFrame implements ActionListener{

	private JTextField isbn;
	
	public ListenerFrame23(JTextField isbn)
	{
		this.isbn=isbn;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Retour"){
			
			GestionLivre.f = new JFrame();
			GestionLivre.f.add( new GestionLivre());
			GestionLivre.f.setSize(500,500);
			GestionLivre.f.setVisible(true);
			Gestion_Livre_Recherche_ISBN.f.dispose();
		}
		
		if (e.getActionCommand()== "Suivant"){
			
			Gestion_Livre_Recherche_ISBN_Lien.f = new JFrame();
			Gestion_Livre_Recherche_ISBN_Lien.f.add( new Gestion_Livre_Recherche_ISBN_Lien(this.isbn));
			Gestion_Livre_Recherche_ISBN_Lien.f.setSize(500,500);
			Gestion_Livre_Recherche_ISBN_Lien.f.setVisible(true);
			Gestion_Livre_Recherche_ISBN.f.dispose();
		}
	}

}