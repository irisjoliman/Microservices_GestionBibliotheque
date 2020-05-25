import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class ApiGateway extends JPanel{
	static JFrame f;
	
public ApiGateway() {
	JPanel Jforme = new JPanel(); 
	 
	JLabel messAcc = new JLabel("Bonjour et bienvenenue à la bibliothèque de Monsieur Menceur");
	Jforme.add(messAcc, BorderLayout.NORTH); 
	this.setLayout(new BorderLayout());
	JPanel Jbutton = new JPanel();
	Jbutton.setLayout(new GridLayout(12,3)); 
	this.add(Jforme , BorderLayout.CENTER); 
	JButton gestLivre= new JButton("Gestion des livres");
	JButton gestLecteur= new JButton("Gestion des lecteurs");
	JButton gestEmprunt= new JButton("Gestion des emprunts");
	Jbutton.add(gestLivre, BorderLayout.CENTER);
	Jbutton.add(new Label(""), BorderLayout.CENTER);
	Jbutton.add(gestEmprunt, BorderLayout.CENTER);
	Jbutton.add(new Label(""), BorderLayout.CENTER);
	Jbutton.add(gestLecteur, BorderLayout.CENTER);
	Jbutton.add(new Label(""), BorderLayout.CENTER);
	this.add(Jforme);
	this.add(Jbutton, BorderLayout.SOUTH);
	
	gestLivre.addActionListener(new ListenerFrame());
	gestEmprunt.addActionListener(new ListenerFrame());
	gestLecteur.addActionListener(new ListenerFrame());
	
	

}

}

class ListenerFrame extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Gestion des livres"){
			
			GestionLivre.f = new JFrame();
			GestionLivre.f.add( new GestionLivre());
			GestionLivre.f.setSize(500,500);
			GestionLivre.f.setVisible(true);			
			ApiGateway.f.dispose();
		}
		
		if (e.getActionCommand()== "Gestion des emprunts"){
			
		
			GestionEmprunt.f = new JFrame();
			GestionEmprunt.f.add( new GestionEmprunt());
			GestionEmprunt.f.setSize(650,650);
			GestionEmprunt.f.setVisible(true);
			ApiGateway.f.dispose();
		}
		
		if (e.getActionCommand()== "Gestion des lecteurs"){
			
			GestionLecteur.f = new JFrame();
			GestionLecteur.f.add( new GestionLecteur());
			GestionLecteur.f.setSize(500,500);
			GestionLecteur.f.setVisible(true);			
			ApiGateway.f.dispose();
			
		}
		
		
	}
	
}
