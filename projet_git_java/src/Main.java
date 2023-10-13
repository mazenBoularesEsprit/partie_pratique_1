import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("bla bla test 1");

        int[] tab2 = {1, 2, 8, 4, 5};

        // Calculer la moyenne
        float moyenne = calculerMoyenne(tab2);
        System.out.println("La moyenne des éléments du tableau est : " + moyenne);

        // Trier le tableau
        trierTableau(tab2);
        System.out.println("Tableau trié : " + Arrays.toString(tab2));

        // Calculer le produit des éléments
        int produit = calculerProduit(tab2);
        System.out.println("Le produit des éléments du tableau est : " + produit);

        // Calculer la somme des éléments
        int somme = calculerSomme(tab2);
        System.out.println("La somme des éléments du tableau est : " + somme);

        // Trouver la valeur maximale
        int max = trouverMaximum(tab2);
        System.out.println("La valeur maximale du tableau est : " + max);
    }
    // calculer la moyenne
    public static float calculerMoyenne(int[] tableau) {
        int somme = 0;
        for (int i : tableau) {
            somme += i;
        }
        return (float) somme / tableau.length;
    }
    // Fonction pour trier le tableau
    public static void trierTableau(int[] tableau) {
        Arrays.sort(tableau);
    }
    // Fonction pour calculer le produit des éléments
    public static int calculerProduit(int[] tableau) {
        int produit = 1;
        for (int i : tableau) {
            produit *= i;
        }
        return produit;
    }
    // Fonction pour calculer la somme des éléments
    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int i : tableau) {
            somme += i;
        }
        return somme;
    }
    // Fonction pour trouver la valeur maximale
    public static int trouverMaximum(int[] tableau) {
        int max = tableau[0];
        for (int i : tableau) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
