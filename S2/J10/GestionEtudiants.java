package J10;

import J9.Etudiant;
import J9.EtudiantDAO;

import java.util.List;
import java.util.Scanner;

public class GestionEtudiants {

    private static EtudiantDAO etudiantDAO = new EtudiantDAO();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choix;
        do {
            afficherMenu();
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    listerEtudiants();
                    break;
                case 2:
                    ajouterEtudiant();
                    break;
                case 3:
                    supprimerEtudiant();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 4);

        scanner.close();
    }

    private static void afficherMenu() {
        System.out.println("\n--- Menu Gestion Étudiants ---");
        System.out.println("1 - Lister étudiants");
        System.out.println("2 - Ajouter étudiant");
        System.out.println("3 - Supprimer étudiant");
        System.out.println("4 - Quitter");
        System.out.print("Votre choix : ");
    }

    private static void listerEtudiants() {
        System.out.println("\n--- Liste des étudiants ---");
        List<Etudiant> etudiants = etudiantDAO.getAllEtudiants();
        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant trouvé.");
        } else {
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant);
            }
        }
    }

    private static void ajouterEtudiant() {
        System.out.println("\n--- Ajouter un étudiant ---");
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Email : ");
        String email = scanner.nextLine();

        Etudiant nouvelEtudiant = new Etudiant(0, nom, prenom, email);
        etudiantDAO.addEtudiant(nouvelEtudiant);
        System.out.println("Étudiant ajouté avec succès.");
    }

    private static void supprimerEtudiant() {
        System.out.println("\n--- Supprimer un étudiant ---");
        System.out.print("ID de l'étudiant à supprimer : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consommer la nouvelle ligne

        etudiantDAO.deleteEtudiant(id);
        System.out.println("Étudiant supprimé avec succès (si existant).");
    }
}