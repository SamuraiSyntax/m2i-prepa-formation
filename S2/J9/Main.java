package J9;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EtudiantDAO etudiantDAO = new EtudiantDAO();

        // Exemple d'ajout d'un étudiant
        System.out.println("\n--- Ajout d'un nouvel étudiant ---");
        // Ajout d'un nouvel étudiant avec un email unique pour éviter les erreurs de clé dupliquée
        Etudiant nouvelEtudiant = new Etudiant("Durand", "Paul", "paul.durand@example.com"); // L'ID sera auto-généré par la DB
        etudiantDAO.addEtudiant(nouvelEtudiant);

        // Exemple de récupération de tous les étudiants
        System.out.println("\n--- Liste de tous les étudiants ---");
        List<Etudiant> etudiants = etudiantDAO.getAllEtudiants();
        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant trouvé.");
        } else {
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant);
            }
        }

        // Vous pouvez ajouter d'autres tests ici
    }
}
