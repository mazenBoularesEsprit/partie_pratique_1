import java.util.Scanner;

public class Nourhene {

    public boolean estPair() {
        Scanner scanner = new Scanner(System.in);

        // 1. Demander à l'utilisateur d'entrer un nombre.
        System.out.println("Entrez un nombre :");
        int nombre = scanner.nextInt();

        // 2. Vérifier si le nombre est positif.
        if (nombre < 0) {
            System.out.println("Le nombre doit être positif.");
            return true;
        }

        // 3. Vérifier si le nombre est pair.
        if (nombre % 2 == 0) {
            System.out.println("Le nombre est pair.");
        } else {
            System.out.println("Le nombre est impair.");
        }

        // 4. Vérifier si le nombre est premier.
        boolean estPremier = true;

        for (int i = 2; i <= nombre / 2; i++) {
            if (nombre % i == 0) {
                estPremier = false;
                break;
            }
        }

        if (estPremier) {
            System.out.println("Le nombre est premier.");
        } else {
            System.out.println("Le nombre n'est pas premier.");
        } return true;
    }
}