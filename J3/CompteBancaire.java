public class CompteBancaire {
  private String numeroCompte;
  private double solde;

  public CompteBancaire(String numeroCompte, double soldeInitiale) {
    this.numeroCompte = numeroCompte;
    this.solde = soldeInitiale;
  }

  public void deposer(double montant) {
    solde += montant;
    System.out.println("Depot de " + montant + "EUR. Nouveau solde : " + solde + "EUR.");
  }

  public void retirer(double montant) {
    if (montant <= solde) {
      solde -= montant;
      System.out.println("Retrait de " + montant + "EUR. Nouveau solde : " + solde + "EUR.");
    } else {
      System.out.println("Fonds insuffisants. Solde actuel : " + solde + "EUR.");
    }
  }

  public void afficherSolde() {
    System.out.println("Compte " + numeroCompte + " - Solde : " + solde + "EUR.");
  }
}
