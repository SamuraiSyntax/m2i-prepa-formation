public class Main {
  public static void main(String[] args) {
    CompteBancaire compte1 = new CompteBancaire("12345", 1000.00);
    compte1.afficherSolde();
    compte1.deposer(200.00);
    compte1.retirer(150.00);
    compte1.retirer(2000.00); // Test fonds insuffisants
  }
}
