# Gestion d'une Bibliotheque à la façon Microservices
Ce projet s'inscrit dans le cadre de notre cours : Applications WEB Orientées Services à l'université Paris Dauphine.

Objectif : 
Concevoir et réaliser une application permettant de réaliser des emprunts de livres.
  - gérer des livres (un livre possède : ISBN | auteur | titre | editeur | edition)
  - gérer des prêts de livres (un prêt possède : id | ISBN | lecteur | date_pret | date_retour)
  - gérer des lecteurs (un lecteur possède : id | genre | nom | prenom | date_naissance | adresse)
  
 
Technologies utilisées :
  - Docker pour l'isolation des microservices
  - Sprin
  
 # Prérequis logiciels:
  * Maven
  * Docker Toolkit 
  * Java
  * Postman
  
  # Architecture :
   - Microservice Livre : en charge de la gestion des livres 
   - Microservice Emprunt : en charge de la gestion des emprunts
   - Microservice Lecteur : en charge de la gestion des lecteurs
 



