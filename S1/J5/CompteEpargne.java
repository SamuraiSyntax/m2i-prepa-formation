public class CompteEpargne extends CompteBancaire {
  private double tauxInteret;

  // Constructeur
  public CompteEpargne(String numeroCompte, double soldeInitial, double tauxInteret) {
    super(numeroCompte, soldeInitial); // Appelle le constructeur parent (CompteBancaire)
    this.tauxInteret = tauxInteret;
  }

  public void ajouterInterets() {
    double interets = getSolde() * tauxInteret / 100;
    deposer(interets); // utilise la méthode deposer() héritée
    System.out.println("Interets ajoutés : " + interets + " EUR");
  }

  @Override
  public String toString() {
    return "Compte Epargne " + getNumeroCompte() + " (Solde : " + getSolde() + " EUR, Taux : " + tauxInteret + "%)";
  }
}
