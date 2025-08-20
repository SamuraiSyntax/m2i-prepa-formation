import java.util.ArrayList;

public class Client {
  private String nom;
  private ArrayList<CompteBancaire> listeComptes;

  public Client(String nom) {
    this.nom = nom;
    this.listeComptes = new ArrayList<>();
  }

  public void ajouterCompte(CompteBancaire compte) {
    this.listeComptes.add(compte);
    System.out.println("Compte " + compte + " ajouté pour " + nom);
  }

  public void afficherComptes() {
    System.out.println("Comptes de " + nom + " :");
    for (CompteBancaire compte : listeComptes) {
      compte.afficherSolde();
    }
  }
}
