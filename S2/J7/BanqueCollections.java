import java.util.ArrayList;
import java.util.HashMap;

public class BanqueCollections {
  public static void main(String[] args) {
    // Liste de comptes
    ArrayList<CompteBancaire> comptes = new ArrayList<>();
    comptes.add(new CompteBancaire("11111", 500.0));
    comptes.add(new CompteBancaire("22222", 1500.0));

    System.out.println("Liste des comptes :");
    for (CompteBancaire c : comptes) {
      c.afficherSolde();
    }

    // Map numéroCompte -> Compte
    HashMap<String, CompteBancaire> comptesMap = new HashMap<>();
    comptesMap.put("11111", comptes.get(0));
    comptesMap.put("22222", comptes.get(1));

    System.out.println("Recherche d'un compte via Map :");
    comptesMap.get("11111").afficherSolde();
  }
}
