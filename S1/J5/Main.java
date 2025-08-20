public class Main {
  public static void main(String[] args) {
    CompteEpargne epargne = new CompteEpargne("99999", 2000, 3.0);
    epargne.afficherSolde();
    epargne.ajouterInterets();
    epargne.afficherSolde();
  }
}
