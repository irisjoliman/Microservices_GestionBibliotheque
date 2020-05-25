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

public class Gestion_Emprunt_Recherche_DatePret extends JPanel{
	static JFrame f;
	
	public Gestion_Emprunt_Recherche_DatePret()
	{
		
		JPanel Jforme = new JPanel(); 
		
		 //Mise en forme de l'interface
this.setLayout(new BorderLayout());
Jforme.setLayout(new GridLayout(17,2)); 
this.add(Jforme , BorderLayout.CENTER); 

JLabel messAcc = new JLabel("                  Veuillez entrer ci-dessous la date de pret afin d'afficher tous les emprunts associes:");
Jforme.add(messAcc, BorderLayout.CENTER); 
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new Label(""));
Jforme.add(new JLabel("Date de pret:"));
JTextField datePret = new JTextField("");
Jforme.add(datePret);
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

retour.addActionListener(new ListenerFrame8(datePret));
suivant.addActionListener(new ListenerFrame8(datePret));

		
	}
}

class ListenerFrame8 extends JFrame implements ActionListener{

	private JTextField datePret;
	
	public ListenerFrame8(JTextField datePret)
	{
		this.datePret=datePret;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Retour"){
			
			GestionEmprunt.f = new JFrame();
			GestionEmprunt.f.add( new GestionEmprunt());
			GestionEmprunt.f.setSize(650,650);
			GestionEmprunt.f.setVisible(true);
			Gestion_Emprunt_Recherche_DatePret.f.dispose();
		}
		
		if (e.getActionCommand()== "Suivant"){
			
			Gestion_Emprunt_Recherche_DatePret_Lien.f = new JFrame();
			Gestion_Emprunt_Recherche_DatePret_Lien.f.add( new Gestion_Emprunt_Recherche_DatePret_Lien(this.datePret));
			Gestion_Emprunt_Recherche_DatePret_Lien.f.setSize(600,500);
			Gestion_Emprunt_Recherche_DatePret_Lien.f.setVisible(true);
			Gestion_Emprunt_Recherche_DatePret.f.dispose();
		}
	}

}
