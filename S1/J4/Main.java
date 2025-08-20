public class Main {
  public static void main(String[] args) {
    Client client1 = new Client("Bernard");

    CompteBancaire compte1 = new CompteBancaire("12345", 1000.0);
    CompteBancaire compte2 = new CompteBancaire("67890", 500.0);

    client1.ajouterCompte(compte1);
    client1.ajouterCompte(compte2);

    client1.afficherComptes();
  }
}
