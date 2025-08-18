import java.util.Scanner;

public class NombreMystere {
  public static void main(String[] args) {
    int nombreMystere = 7;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Devinez le nombre mystère (entre 1 et 10) :");
    int essai = scanner.nextInt();

    while (essai != nombreMystere) {
      if (essai < nombreMystere) {
        System.out.println("Trop petit, c'est plus grand !");
      } else {
        System.out.println("Trop grand, c'est plus petit !");
      }
      essai = scanner.nextInt();
    }

    System.out.println("Félicitations ! Vous avez deviné le nombre mystère.");
    scanner.close();
  }
}
