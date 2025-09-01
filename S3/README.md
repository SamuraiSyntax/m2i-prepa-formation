# S3: Création d'une API REST avec Spring Boot et PostgreSQL

## Objectif
Créer une API REST robuste et fonctionnelle en utilisant Spring Boot, connectée à une base de données PostgreSQL, pour la gestion des étudiants.

## Jour 11: Initialisation du Projet Spring Boot
- **Installation de Spring Boot**: Utilisation de Spring Initializr ou de la CLI pour générer la structure de base du projet.
- **Création du projet `gestion-etudiants-api`**: Inclusion des dépendances essentielles :
    - `Spring Web`: Pour le développement d'applications web et RESTful.
    - `Spring Data JPA`: Pour la persistance des données avec JPA et Hibernate.
    - `PostgreSQL Driver`: Pour la connectivité avec la base de données PostgreSQL.
- **Premier lancement**: Mise en place d'un `HelloController` simple avec un endpoint `GET /hello` pour vérifier le bon fonctionnement de l'application.

## Jour 12: Modélisation des Données et Configuration de la Base de Données
- **Création de l'entité `Etudiant`**: Définition de la structure de l'étudiant avec les attributs `id`, `nom`, `prenom`, et `email`.
- **Création de l'interface `EtudiantRepository`**: Extension de `JpaRepository` pour bénéficier des opérations CRUD de base sans implémentation manuelle.
- **Configuration de PostgreSQL**: Paramétrage de la connexion à la base de données PostgreSQL dans le fichier `application.properties` (URL, nom d'utilisateur, mot de passe).

## Jour 13: Développement des Endpoints CRUD pour les Étudiants
- **Création de `EtudiantController`**: Implémentation des endpoints RESTful pour la gestion des étudiants :
    - `GET /etudiants`: Récupérer tous les étudiants.
    - `POST /etudiants`: Ajouter un nouvel étudiant.
    - `GET /etudiants/{id}`: Récupérer un étudiant par son ID.
    - `PUT /etudiants/{id}`: Mettre à jour un étudiant existant.
    - `DELETE /etudiants/{id}`: Supprimer un étudiant par son ID.

## Jour 14: Tests Unitaires
- **Ajout des tests unitaires**: Intégration de JUnit et Spring Boot Test pour assurer la qualité et la fiabilité du code.
- **Écriture de `EtudiantRepositoryTest`**: Création de tests spécifiques pour vérifier les fonctionnalités d'insertion et de recherche dans le repository des étudiants.

## Jour 15: Sécurité et Documentation de l'API
- **Intégration de Spring Security**: Mise en place d'une authentification simple en mémoire pour sécuriser l'API.
- **Installation de Swagger (Springdoc OpenAPI)**: Ajout de la documentation interactive de l'API pour faciliter les tests et l'intégration par d'autres développeurs.
