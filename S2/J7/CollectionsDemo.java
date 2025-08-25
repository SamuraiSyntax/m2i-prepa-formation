import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsDemo {
  public static void main(String[] args) {
    // --- LIST ---
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Pomme");
    fruits.add("Banane");
    fruits.add("Pomme"); // doublon accepté
    System.out.println("Liste des fruits : " + fruits);

    // --- SET ---
    HashSet<String> couleurs = new HashSet<>();
    couleurs.add("Rouge");
    couleurs.add("Bleu");
    couleurs.add("Rouge"); // doublon ignoré
    System.out.println("Set des couleurs : " + couleurs);

    // --- MAP ---
    HashMap<String, String> capitales = new HashMap<>();
    capitales.put("France", "Paris");
    capitales.put("Espagne", "Madrid");
    capitales.put("Italie", "Rome");
    System.out.println("Capitale de la France : " + capitales.get("France"));
  }
}
