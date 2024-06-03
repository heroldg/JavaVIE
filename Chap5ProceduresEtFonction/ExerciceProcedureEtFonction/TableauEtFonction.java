package Chap5ProceduresEtFonction.ExerciceProcedureEtFonction;

import java.util.Random;
import java.util.Scanner;

public class TableauEtFonction {
    final static int largeur = 10;
    final static int[] tab = new int[largeur];

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Choissisez un nombre minimum pour votre tab");
        int minimum = console.nextInt();
        System.out.println("Choissisez un nombre maximum pour votre tab");
        int maximum = console.nextInt();
        console.close();

       tabAleatoire(minimum, maximum);

       System.out.println("Le nombre le plus élévé du tableau est " + findBiggestNumber(tab));

    }

    public static void tabAleatoire(int min, int max) {
        Random rand = new Random();
        for (int j = 0; j < tab.length; j++) {
            tab[j] = rand.nextInt(max - min) + min;
            System.out.print( tab[j] + " | " );
    }
    System.out.print("\n");
    }

    public static int findBiggestNumber(int[] tab) {

        int biggestNumber = 0;
        for (int i = 0; i < tab.length; i++) {
            
            if (biggestNumber < tab[i]) {
                biggestNumber = tab[i];
            }
        }

        return biggestNumber;
    }

}
