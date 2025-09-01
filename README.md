# 📚 Prépa Formation M2I - Java Full Stack

Ce dépôt contient mes exercices et mini-projets réalisés **avant ma formation M2I** (Java, Spring Boot, Angular).
L’objectif est de consolider mes bases en Java, Git, SQL et POO, afin d’arriver préparé à la formation.

---

## 🚀 Objectifs
- Revoir les fondamentaux en **Java** (POO, collections, héritage).
- Pratiquer les bases de **Git & GitHub**.
- Manipuler les **bases de données SQL** avec JDBC.
- Découvrir **Spring Boot** pour créer une API REST.
- Apprendre les bases de **Angular** pour le front-end.

---

## 📂 Structure du dépôt
```
m2i-prepa-formation/
└── S1/ # Semaine 1 - Bases Java & Git
    ├── J1/ # Hello World, installation JDK + Git
    ├── J2/ # Variables, conditions, boucles
    ├── J3/ # Classe CompteBancaire
    ├── J4/ # Classe Client avec liste de comptes
    └── J5/ # Héritage : CompteEpargne
└── S2/ # Semaine 2 - Exceptions et Collections
    ├── J6/ # Exceptions personnalisées
    ├── J7/ # Collections (List, Set, Map)
    ├── J8/ # Bases de Données SQL et PostgreSQL
    ├── J9/ # Connexion JDBC et Classe EtudiantDAO
    └── J10/ # Application Console GestionEtudiants
└── S3/ # Semaine 3 - API REST avec Spring Boot
    └── gestion-etudiants-api/ # Projet Spring Boot de gestion des étudiants
```

## ▶️ Exécution

Chaque jour contient des fichiers `.java`.
Pour exécuter un programme :

1. Compiler le fichier (depuis la racine du projet si vous utilisez des packages) :
```bash
javac S2\J7\CollectionsDemo.java S2\J7\BanqueCollections.java S2\J7\CompteBancaire.java S2\J7\SoldeInsuffisantException.java S2\J7\CompteEpargne.java
```
2. Lancer le programme (en spécifiant le nom complet de la classe avec son package) :
```bash
java S2.J7.CollectionsDemo
```
⚠️ Assurez-vous d’avoir installé Java JDK 21 (ou une version compatible).

Pour les projets Spring Boot (S3 et futurs), utilisez Maven pour construire et exécuter :
```bash
mvn clean install
mvn spring-boot:run
```

## 🛠️ Technologies utilisées
- Java 21 (POO, JDBC, héritage, Collections, Exceptions)
- Git & GitHub (versionning du projet)
- VS Code / Cursor comme IDE
- Spring Boot (API REST, JPA, Security, Swagger)
- PostgreSQL (Base de données)
- (À venir) Angular

## ✨ Auteur
👤 Bernard Rogier
📍 Bordeaux, Nouvelle-Aquitaine
💼 Développeur Web Junior → Prépa Développeur Java Full Stack

🚀 Ce dépôt sera enrichi au fil des semaines, jusqu’au début de la formation M2I (Java + Spring Boot + Angular).
