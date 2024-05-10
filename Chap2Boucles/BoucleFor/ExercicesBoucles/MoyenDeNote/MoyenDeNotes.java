package Chap2Boucles.BoucleFor.ExercicesBoucles.MoyenDeNote;

import java.util.Scanner;

public class MoyenDeNotes {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
        // L'utilisateur doit saisir le nombre de valeur qu'il souhaite avant qu'une moyenne y soit calculé
       int nbValeur = 0;
       double totalnotes = 0;
       double note = 0;
       double moyenne = 0;

       System.out.println("Entrez le nombre de notes:");
       nbValeur = console.nextInt();
       
       for (int i = 0; i <  nbValeur; i++) {
           System.out.println("Note:");
           note = console.nextDouble();
           totalnotes += note;

       }

       moyenne = totalnotes / nbValeur;

       System.out.printf("la moyenne est %.2f \n", moyenne);

       console.close();

    }
}
