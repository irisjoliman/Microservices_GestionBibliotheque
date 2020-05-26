import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GestionEmprunt extends JPanel{
	static JFrame f;
// creer modif supp rech ts id isbn lecteur datep dater encours
	public GestionEmprunt() {
		JPanel Jforme = new JPanel(); 
		 
		JLabel messAcc = new JLabel("Veuillez choisir le service souhait� parmis:");
		Jforme.add(messAcc, BorderLayout.NORTH); 
		this.setLayout(new BorderLayout());
		JPanel Jbutton = new JPanel();
		Jbutton.setLayout(new GridLayout(22,3)); 
		this.add(Jforme , BorderLayout.CENTER); 
		JButton ajoutEmprunt= new JButton("Effectuer un emprunt � la biblioth�que");
		JButton modifEmprunt= new JButton("Modifier un emprunt de la biblioth�que");
		JButton suppEmprunt= new JButton("Supprimer un emprunt de la biblioth�que");
		JButton listTousEmprunt= new JButton("Afficher tous les emprunts de la biblioth�que");
		JButton listIsbnEmprunt= new JButton("Rechercher des emprunts par ISBN");
		JButton listLecteurEmprunt= new JButton("Rechercher des emprunts par lecteur");
		JButton listDatePretEmprunt= new JButton("Rechercher des emprunts par date de pret");
		JButton listDateRetourEmprunt= new JButton("Rechercher des emprunts par date de retour");
		JButton listIDEmprunt= new JButton("Rechercher des emprunts par identifiant");
		JButton listEmpruntEnCours= new JButton("Afficher la liste des emprunts en cours");
		JButton retour= new JButton("Retour � l'accueil");
		Jbutton.add(ajoutEmprunt, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(modifEmprunt, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(suppEmprunt, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(listTousEmprunt, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(listEmpruntEnCours, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(listIsbnEmprunt, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(listLecteurEmprunt, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(listDatePretEmprunt, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(listDateRetourEmprunt, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(listIDEmprunt, BorderLayout.CENTER);
		Jbutton.add(new Label(""), BorderLayout.CENTER);
		Jbutton.add(retour, BorderLayout.EAST);
		this.add(Jforme);
		this.add(Jbutton, BorderLayout.SOUTH);
		
		ajoutEmprunt.addActionListener(new ListenerFrame2());
		modifEmprunt.addActionListener(new ListenerFrame2());
		suppEmprunt.addActionListener(new ListenerFrame2());
		listTousEmprunt.addActionListener(new ListenerFrame2());
		listIsbnEmprunt.addActionListener(new ListenerFrame2());
		listLecteurEmprunt.addActionListener(new ListenerFrame2());
		listDatePretEmprunt.addActionListener(new ListenerFrame2());
		listDateRetourEmprunt.addActionListener(new ListenerFrame2());
		listIDEmprunt.addActionListener(new ListenerFrame2());
		listEmpruntEnCours.addActionListener(new ListenerFrame2());
		retour.addActionListener(new ListenerFrame2());
		
		
	}

}

class ListenerFrame2 extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand()== "Effectuer un emprunt � la biblioth�que"){
			
			Gestion_Emprunt_Creation.f = new JFrame();
			Gestion_Emprunt_Creation.f.add( new Gestion_Emprunt_Creation());
			Gestion_Emprunt_Creation.f.setSize(600,500);
			Gestion_Emprunt_Creation.f.setVisible(true);
			GestionEmprunt.f.dispose();
		}
		if (e.getActionCommand()== "Modifier un emprunt de la biblioth�que"){
	
			
		}
		if (e.getActionCommand()== "Supprimer un emprunt de la biblioth�que"){
	
			
		}
		if (e.getActionCommand()== "Afficher tous les emprunts de la biblioth�que"){
	
			/*Gestion_Emprunt_Affichage_all.f = new JFrame();
			Gestion_Emprunt_Affichage_all.f.add( new Gestion_Emprunt_Affichage_all());
			Gestion_Emprunt_Affichage_all.f.setSize(500,500);
			Gestion_Emprunt_Affichage_all.f.setVisible(true);
			GestionEmprunt.f.dispose();*/
			try {
				Desktop.getDesktop().browse(new URI("http://localhost:8002/getEmprunt/All"));
			}
			catch (IOException | URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getActionCommand() == "Rechercher des emprunts par ISBN"){
	
			Gestion_Emprunt_Recherche_ISBN.f = new JFrame();
			Gestion_Emprunt_Recherche_ISBN.f.add( new Gestion_Emprunt_Recherche_ISBN());
			Gestion_Emprunt_Recherche_ISBN.f.setSize(500,500);
			Gestion_Emprunt_Recherche_ISBN.f.setVisible(true);
			GestionEmprunt.f.dispose();
		}
		if (e.getActionCommand()== "Rechercher des emprunts par lecteur"){
	
			Gestion_Emprunt_Recherche_Lecteur.f = new JFrame();
			Gestion_Emprunt_Recherche_Lecteur.f.add( new Gestion_Emprunt_Recherche_Lecteur());
			Gestion_Emprunt_Recherche_Lecteur.f.setSize(600,500);
			Gestion_Emprunt_Recherche_Lecteur.f.setVisible(true);
			GestionEmprunt.f.dispose();
		}
		if (e.getActionCommand()== "Rechercher des emprunts par date de pret"){
	
			Gestion_Emprunt_Recherche_DatePret.f = new JFrame();
			Gestion_Emprunt_Recherche_DatePret.f.add( new Gestion_Emprunt_Recherche_DatePret());
			Gestion_Emprunt_Recherche_DatePret.f.setSize(600,500);
			Gestion_Emprunt_Recherche_DatePret.f.setVisible(true);
			GestionEmprunt.f.dispose();
		}
		if (e.getActionCommand()== "Rechercher des emprunts par date de retour"){
	
			Gestion_Emprunt_Recherche_DateRetour.f = new JFrame();
			Gestion_Emprunt_Recherche_DateRetour.f.add( new Gestion_Emprunt_Recherche_DateRetour());
			Gestion_Emprunt_Recherche_DateRetour.f.setSize(600,500);
			Gestion_Emprunt_Recherche_DateRetour.f.setVisible(true);
			GestionEmprunt.f.dispose();
		}
		if (e.getActionCommand()== "Rechercher des emprunts par identifiant"){
	
			Gestion_Emprunt_Recherche_ID.f = new JFrame();
			Gestion_Emprunt_Recherche_ID.f.add( new Gestion_Emprunt_Recherche_ID());
			Gestion_Emprunt_Recherche_ID.f.setSize(500,500);
			Gestion_Emprunt_Recherche_ID.f.setVisible(true);
			GestionEmprunt.f.dispose();
		}
		if (e.getActionCommand()== "Afficher la liste des emprunts en cours"){
	
			Gestion_Emprunt_Affichage_current.f = new JFrame();
			Gestion_Emprunt_Affichage_current.f.add( new Gestion_Emprunt_Affichage_current());
			Gestion_Emprunt_Affichage_current.f.setSize(500,500);
			Gestion_Emprunt_Affichage_current.f.setVisible(true);
			GestionEmprunt.f.dispose();
		}
		if (e.getActionCommand()== "Retour � l'accueil"){
	
			
			ApiGateway.f = new JFrame();
			ApiGateway.f.add( new ApiGateway());
			ApiGateway.f.setSize(500,500);
			ApiGateway.f.setVisible(true);
			GestionEmprunt.f.dispose();
			
			
		}
	}
	
}
