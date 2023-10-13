import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         Nourhene nounou = new Nourhene();
        // 1. Demander à l'utilisateur de saisir un nombre.
        System.out.println("Veuillez saisir un nombre :");
        int nombre = scanner.nextInt();

        // 2. Vérifier si le nombre est négatif.
        if (nombre < 0) {
            System.out.println("Le nombre doit être positif.");
            return;
        }

        // 3. Vérifier si le nombre est pair.
        if (nounou.estPair()) {
            System.out.println("Le nombre est pair.");
        } else {
            System.out.println("Le nombre est impair.");
        }
       // 4. methode factorielle
        System.out.println("methode factorielle.");
        System.out.println(nounou.factorielle(5));

    }
}