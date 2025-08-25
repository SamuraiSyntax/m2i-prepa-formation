public class Main {
  public static void main(String[] args) {
    CompteBancaire compte = new CompteBancaire("12345", 1000.0);

    compte.afficherSolde();

    try {
      compte.retirer(150); // OK
      compte.retirer(2000); // Va lever l'exception
    } catch (SoldeInsuffisantException e) {
      System.out.println("Erreur : " + e.getMessage());
    }

    compte.afficherSolde();
  }
}
