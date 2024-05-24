package Chap5ProceduresEtFonction.CoursProcedureEtFonctions;

import java.util.Scanner;

public class RetourDeFonctionNbSecToHMS {
    public static final int H = 0;
    public static final int M = 1;
    public static final int S = 2;
    public static final int TAILLE = 3;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Entrer une durée en secondes: ");
        int nbDeSecondes = console.nextInt();
        console.nextLine();
        console.close();

        int[] temps = nbSecToHMS(nbDeSecondes);
        System.out.printf("durée = %02d:%02d:%02d%n", temps[H],temps[M],temps[S]);
        
    }

    public static int[] nbSecToHMS(int nbs) {
        int[] hms = new int[TAILLE];
        hms[H] = nbs / 3600; // 3600 équivaut au nombre de seconde dans 1 heure
        nbs %= 3600; // nombre de secondes restante apres le calcul du nombre d'heure
        hms[M] = nbs / 60; // 60 équivaur au nombre de seconde dans 1 minute
        hms[S] = nbs % 60;

        return hms; // Certes il y a une obligation de retourner un seule élement dans une fonction mais si celui-ci est un tableau commme dans notre exemple il est possible de regrouper un ensemble d'information assez conséquent.


    }
}
