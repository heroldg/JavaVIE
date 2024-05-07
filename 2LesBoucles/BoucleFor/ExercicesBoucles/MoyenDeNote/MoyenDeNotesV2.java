package LesBoucles.BoucleFor.ExercicesBoucles.MoyenDeNote;

import java.util.Scanner;

public class MoyenDeNotesV2 {
    // L'utilisateur doit mettre les notes puis indiquer lorsqu'il a finit afin de calculer la moyenne
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    

    int nbValeur = -1; // nbValeur égale -1 pour l'itération réequilibré l'itération en plus pour mettre fin à la boucle while
    double totalnotes = 0;
    double note = 0;
    double moyenne = 0;
    
    System.out.println("Entrez le nombe de notes :");

    while (note != -1) {
        System.out.println("Note (notez '-1' pour mettre fin et obtenir la moyen) :"); // Pour mettre fin il faut que l'utilisateur met -1
        note = console.nextDouble();
        if (note == -1) {
            nbValeur++;
            break; // Sort de la boucle si la note est -1
        }
        totalnotes += note;
        nbValeur++;
    }

    moyenne = totalnotes / nbValeur;

    System.out.printf("la moyenne est %.2f (nombre note: %d) \n", moyenne, nbValeur);

    console.close();
    

    }
    
}
