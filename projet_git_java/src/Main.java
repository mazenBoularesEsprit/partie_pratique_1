// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("bla bla test 1");

        int[] tab2 = {1, 2, 8, 4, 5};
        int s = 0;
        float moyenne = 0;

        for( int i : tab2) {
            s = s + i;
        }
        moyenne = s / tab2.length;
        System.out.println("La moyenne des éléments du tableau est : "+ moyenne);




    }


}