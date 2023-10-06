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

        int[] tab = {1, 2, 3, 4, 5};
        int s = 0;
        for( int i : tab) {
            s = s + i;
        }
        System.out.println("La somme des éléments du tableau est : "+ s);


        nt[] tab = {1, 2, 3, 4, 5};
        int s = 0;
        float moyenne = 0;

        for( int i : tab) {
            s = s + i;
        }
        moyenne = somme / array.length;
        System.out.println("La moyenne des éléments du tableau est : "+ moyenne);
    }



}