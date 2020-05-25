import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GestionLecteur extends JPanel{
	//ajout modif supp id (nom prenom) ts 
	static JFrame f;
	public GestionLecteur() {
		JPanel Jforme = new JPanel(); 
		 
		JLabel messAcc = new JLabel("Veuillez choisir le service souhait� parmis:");
		Jforme.add(messAcc, BorderLayout.NORTH); 
		this.setLayout(new BorderLayout());
		JPanel Jbutton = new JPanel();
		Jbutton.setLayout(new GridLayout(14,1)); 
		this.add(Jforme , BorderLayout.CENTER); 
		JButton ajoutLecteur= new JButton("Ajouter un lecteur � la liste des adh�rents");
		JButton modifLecteur= new JButton("Modifier un adh�rent");
		JButton suppLecteur= new JButton("Supprimer un adh�rent");
		JButton listTousLecteur= new JButton("Afficher tous les adh�rents de la biblioth�que");
		JButton listNPLecteur= new JButton("Rechercher des adh�rents par nom et prenom");
		JButton listLecteurID= new JButton("Rechercher des adh�rents par Id");
		JButton retour= new JButton("Retour � l'accueil");
		Jbutton.add(ajoutLecteur, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(modifLecteur, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(suppLecteur, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(listTousLecteur, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(listNPLecteur, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(listLecteurID, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(retour, BorderLayout.CENTER);
		this.add(Jforme);
		this.add(Jbutton, BorderLayout.SOUTH);
		
		ajoutLecteur.addActionListener(new ListenerFrame15());
		modifLecteur.addActionListener(new ListenerFrame15());
		suppLecteur.addActionListener(new ListenerFrame15());
		listTousLecteur.addActionListener(new ListenerFrame15());
		listNPLecteur.addActionListener(new ListenerFrame15());
		listLecteurID.addActionListener(new ListenerFrame15());
		retour.addActionListener(new ListenerFrame15());
		
		
	}

}

class ListenerFrame15 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Ajouter un lecteur � la liste des adh�rents"){
			
			Gestion_Lecteur_Creation.f = new JFrame();
			Gestion_Lecteur_Creation.f.add( new Gestion_Lecteur_Creation());
			Gestion_Lecteur_Creation.f.setSize(500,500);
			Gestion_Lecteur_Creation.f.setVisible(true);
			GestionLecteur.f.dispose();
			}
		if (e.getActionCommand()== "Modifier un adh�rent"){
	
			
			}
		if (e.getActionCommand()== "Supprimer un adh�rent"){
	
			
			}
		if (e.getActionCommand()== "Afficher tous les adh�rents de la biblioth�que"){
	
			Gestion_Lecteur_Affichage_all.f = new JFrame();
			Gestion_Lecteur_Affichage_all.f.add( new Gestion_Lecteur_Affichage_all());
			Gestion_Lecteur_Affichage_all.f.setSize(500,500);
			Gestion_Lecteur_Affichage_all.f.setVisible(true);
			GestionLecteur.f.dispose();
			}
		if (e.getActionCommand()== "Rechercher des adh�rents par nom et prenom"){
	
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom.f = new JFrame();
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom.f.add( new Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom());
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom.f.setSize(600,500);
			Gestion_Lecteur_Recherche_Lecteur_Nom_Prenom.f.setVisible(true);
			GestionLecteur.f.dispose();
			}
		if (e.getActionCommand()== "Rechercher des adh�rents par Id"){
	
			Gestion_Lecteur_Recherche_ID.f = new JFrame();
			Gestion_Lecteur_Recherche_ID.f.add( new Gestion_Lecteur_Recherche_ID());
			Gestion_Lecteur_Recherche_ID.f.setSize(600,500);
			Gestion_Lecteur_Recherche_ID.f.setVisible(true);
			GestionLecteur.f.dispose();
			}
		
		if (e.getActionCommand()== "Retour � l'accueil"){
	
			
			ApiGateway.f = new JFrame();
			ApiGateway.f.add( new ApiGateway());
			ApiGateway.f.setSize(500,500);
			ApiGateway.f.setVisible(true);
			GestionLecteur.f.dispose();
			
		}
	}
	
}
