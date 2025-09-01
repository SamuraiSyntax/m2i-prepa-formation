package J9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO {

    // Informations de connexion à la base de données
    private static final String URL = "jdbc:postgresql://localhost:5432/gestion_etudiants";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    public EtudiantDAO() {
        // Assurez-vous que le pilote JDBC est chargé
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(
                    "Erreur: Pilote JDBC introuvable. Assurez-vous que le JAR du pilote est dans le classpath.");
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public List<Etudiant> getAllEtudiants() {
        List<Etudiant> etudiants = new ArrayList<>();
        String sql = "SELECT id, nom, prenom, email FROM etudiants";

        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String email = rs.getString("email");
                etudiants.add(new Etudiant(id, nom, prenom, email));
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de la récupération des étudiants: " + e.getMessage());
            e.printStackTrace();
        }
        return etudiants;
    }

    public void addEtudiant(Etudiant etudiant) {
        String sql = "INSERT INTO etudiants(nom, prenom, email) VALUES(?, ?, ?)";
        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, etudiant.getNom());
            pstmt.setString(2, etudiant.getPrenom());
            pstmt.setString(3, etudiant.getEmail());
            pstmt.executeUpdate();
            System.out.println("Étudiant " + etudiant.getNom() + " " + etudiant.getPrenom() + " ajouté avec succès.");
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'ajout de l'étudiant : " + e.getMessage());
        }
    }

    public void deleteEtudiant(int id) {
        String sql = "DELETE FROM etudiants WHERE id = ?";
        try (Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Étudiant avec l'ID " + id + " supprimé avec succès.");
            } else {
                System.out.println("Aucun étudiant trouvé avec l'ID " + id + ".");
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de la suppression de l'étudiant : " + e.getMessage());
        }
    }
}
