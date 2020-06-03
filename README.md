# Gestion d'une Bibliotheque à la façon Microservices avec Spring Boot
Ce projet s'inscrit dans le cadre de notre cours : Applications WEB Orientées Services à l'université Paris Dauphine.
 *********************
 
Objectif : 
Concevoir et réaliser une application permettant de réaliser des emprunts de livres.
  - gérer des livres (un livre possède : ISBN | auteur | titre | editeur | edition)
  - gérer des prêts de livres (un prêt possède : id | ISBN | lecteur | date_pret | date_retour)
  - gérer des lecteurs (un lecteur possède : id | genre | nom | prenom | date_naissance | adresse)
 
 Nous avons fait le choix de mettre en place l'application suivante sous-forme de trois  webservices: Emprunt, Livre et Lecteur.
Au sein de chacun, plusieurs fonctions ont été mises en place afin de permettre à l'utilisateur d'interroger la base, d'ajouter ou de modifier des instances.
Ainsi, vous pourrez ajouter, modifier ou supprimer un livre à partir du webservice Livre. Par ailleurs, il est possible d'effectuer des recherches de livres selon les critères "ISBN", "auteur" ou encore d'afficher tous les livres existants.

D'autre part, le webservice Lecteur sera à disposition pour permettre d'ajouter, de modifier ou de supprimer un lecteur. Les personnes présentes en base seront retrouvables si l'utilisateur choisi de tous les afficher ou d'en rechercher par identifiant ou par nom et prénom.

Enfin, le webservice Emprunt, illustre l'emprunt d'un livre par un lecteur. En plus des ajouts, modifications et suppressions possibles, l'application permet d'effectuer des recherches selon l'identifiant de l'emprunt, l'identifiant du lecteur, l'ISBN, la date de prêt et la date de retour.
Il est à noter que, lors d'un emprunt, les dates de retour  sont initialisées à "notRetrunedYet" et seront mises à jour lors de la restitution du livre. Vous trouverez la liste de tous les emprunts ainsi que ceux en cours également dans ce webservice.



 # Prérequis:
  * Maven
  * Docker Toolkit 
  * Java 14
  * Postman
  * Minikube
  * Kubectl
  
  # Utilisation de Minikube (commandes)
  Après avoir créé les conteneurs Docker, réaliser les commandes suivantes :
  -> minikube start
  
  -> minikube dashboard
  
  -> kubectl run livre-service --image=livre-service --port=9090
  
  Notre problème a eu lieu à cet endroit (jamais le statut READY)
  
  -> kubectl get pods
  
  -> kubectl expose deployment livre-service --type=NodePort
  
 
 *********************
  # Services disponibles :
   * Microservice Livre : en charge de la gestion des livres

GET | http://localhost:8000/getLivre/isbn/1234567892 | accéder à un livre par isbn

GET | http://localhost:8000/getLivre/All | accéder à la liste de tous les livres

GET | http://localhost:8000/getLivre/auteur/dzlbjs | accéder à la liste des livres d'un auteur

POST| http://localhost:8000/Livre | modifier un livre

DELETE | http://localhost:8000/Livre/isbn:1234567892 | supprimer un livre




   * Microservice Emprunt : en charge de la gestion des emprunts
   
GET| http://localhost:8002/getEmprunt/id/1                        | accéder à un emprunt par id   

GET| http://localhost:8002/getEmprunt/isbn/1234567892             | accéder aux emprunts associés à un isbn

GET| http://localhost:8002/getEmprunt/lecteur/1                   | accéder aux emprunts associés à un lecteur

GET| http://localhost:8002/getEmprunt/Datepret/06-05-2020         | accéder aux emprunts associés à une date d'emprunt

GET| http://localhost:8002/getEmprunt/Dateretour/05-05-2020       | accéder aux emprunts associés à une date de retour

GET| http://localhost:8002/getEmprunt/All                         | accéder à la liste de tous les emprunts

GET| http://localhost:8002/getEmprunt/Emprunt_En_Cours            | accéder à tous les emprunts en cours

POST| http://localhost:8002/Emprunt                                | modifier un emprunt

DELETE | http://localhost:8002/Emprunt/id:1                           | supprimer un emprunt à partir de son id


   * Microservice Lecteur : en charge de la gestion des lecteurs
   
GET    | http://localhost:8001/getLecteur/id:1                        | accéder à un lecteur par id

GET    | http://localhost:8001/getLecteur/nom:ARIZANOVA/prenom:Simona | accéder à un lecteur par nom et prénom

GET    | http://localhost:8001/getLecteur/All                         | accéder à la liste de tous les lecteurs

POST   | http://localhost:8001/Lecteur                                | modifier un lecteur

DELETE | http://localhost:8001/Lecteur/id:1                           | supprimer un lecteur

	
 #Remarque 1 # pour les requêtes POST il est nécessaire de donner toutes les informations du livre, de l'emprunt ou du lecteur.


  ex pour les livre :
  
  
{
	"isbn": "167339",
	"auteur": "auteurpost",
	"titre": "titrepost",
	"editeur": "editeurpost",
	"edition": 2021
}
   
   

 #Remarque 2 # localhost et le port sont à changer fonction du contecte (ex Docker)
 



