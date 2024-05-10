package Chap4LesTableaux.Cours;

public class ExempleTableaux {
    public static void main(String[] args) {
        // déclaration d'un tableau de dix entiers
        int[] tabEntiers = new int[10];

        // déclaration d'un tableau de trois nombre réels
        double[] tabReels = new double[3];

        // déclaration d'un tableau de trente caractères
        char[] tabCaractere = new char[30];

        // déclaration d'un tableau de six chaînes de caractères
        String[] tabStrings = new String[6];

        // Il est possible de crée un tableau initialisé avec des valeurs directement
        int[] tab = {17, 51, 43, 22, 7, 91, 17, 34,4 , 12};

        // utilisation tabReels
        tabReels[0] = 1.61803398875;
        tabReels[1] = 2.71828182846;
        tabReels[2] = 3.14159265359;

        System.out.println("nombre d'or = " + tab[0]);
        System.out.println("e = " + tab[1]);
        System.out.println("pi = " + tab[2]);

        // PARCOURIR UN TABLEAU
        final int TAILLE = 10;
        int[] tabParcourue = new int[TAILLE];
        for (int i = 0; i < tabParcourue.length; i++) {
            tabParcourue[i]= i + 1;
        }

        // Boucle forEach: Attention ! cette boucle recopie successiment la valeur de chaque case dans la variable de la boucle forEach. une modificatuion de la valeur de cette variable n'a donc aucun effect sur les valeurs contenues dans le tableau. 
        for (int i : tabParcourue) {
            System.out.println(i);
        }

        
    }
}
