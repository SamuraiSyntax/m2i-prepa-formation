public class CompteBancaire {
  private String numeroCompte;
  private double solde;

  // Constructeur
  public CompteBancaire(String numeroCompte, double soldeInitial) {
    this.numeroCompte = numeroCompte;
    this.solde = soldeInitial;
  }

  // --- Encapsulation : Getters / Setters ---
  public String getNumeroCompte() {
    return numeroCompte;
  }

  public double getSolde() {
    return solde;
  }

  public void setSolde(double solde) {
    this.solde = solde;
  }

  // Déposer de l'argent
  public void deposer(double montant) {
    solde += montant;
    System.out.println("Dépôt de " + montant + " EUR. Nouveau solde : " + solde + " EUR");
  }

  // Retirer de l'argent avec Exception personnalisée
  public void retirer(double montant) throws SoldeInsuffisantException {
    if (montant <= solde) {
      solde -= montant;
      System.out.println("Retrait de " + montant + " EUR. Nouveau solde : " + solde + " EUR");
    } else {
      throw new SoldeInsuffisantException(
          "Solde insuffisant pour retirer " + montant + " EUR. Solde actuel : " + solde + " EUR");
    }
  }

  // Afficher le solde
  public void afficherSolde() {
    System.out.println("Compte " + numeroCompte + " - Solde : " + solde + " EUR");
  }
}
