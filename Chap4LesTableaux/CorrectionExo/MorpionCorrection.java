package Chap4LesTableaux.CorrectionExo;

import java.util.Scanner;

public class MorpionCorrection {
    
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);

        final char SYMBOLE1 = 'o';
        final char SYMBOLE2 = 'x';
        final char INDEFINI = 'r';
        final char VIDE = ' ';

        char[][] grille = new char[3][3];
        int nbCoupsJoues = 0;
        char joueur = SYMBOLE1;
        char gagnant = INDEFINI;
        int l, c;

        // Initialisation pour la grille
        for (l = 0; l < grille.length; l++) {
            for (c = 0; c < grille[l].length; c++) { // Correction : utiliser grille[l].length au lieu de grille.length
                grille[l][c] = VIDE;
            }
        }
        
        do {
            // affichage de la grille de jeu
            for ( l = 0; l < grille.length; l++) {
                for ( c = 0; c < grille[l].length; c++) { // Correction : utiliser grille[l].length au lieu de grille.length
                    System.out.print(grille[l][c]);
                    if (c < grille[l].length - 1) System.out.print("|"); // Ajouter des séparateurs de colonnes
                }
                System.out.println();
                if (l < grille.length - 1) System.out.println("-----"); // Ajouter des séparateurs de lignes
            }

            System.out.println("C'est au joueur " + joueur + " de joueur");

            System.out.println("Ligne : ");
            l = console.nextInt() - 1;

            System.out.println("Colonne : ");
            c = console.nextInt() - 1;

            if (l < 0 || l > 2 || c < 0 || c > 2) {
                System.out.println("Mauvaise coordonnées, passez votre tour !");
            } else if (grille[l][c] != VIDE) {
                System.out.println("La case est occupée, passez votre tour !");
            } else {
                nbCoupsJoues = nbCoupsJoues + 1;
                grille[l][c] = joueur;
                // le joueur a-t-il gagné ? 
                if (grille[l][0] == grille[l][1] && grille[l][0] == grille[l][2] ||
                grille[0][c] == grille[1][c] && grille[0][c] == grille[2][c] ||
                grille[0][0] == grille[1][1] && grille[0][0] == grille[2][2] && grille[0][0] == joueur ||
                grille[0][2] == grille[1][1] && grille[0][2] == grille[2][0] && grille[0][2] == joueur
                ) {
                    gagnant = joueur;
                }
            }

            // changement du joueur curant
            if (joueur == SYMBOLE1) {
                joueur = SYMBOLE2;
            } else {
                joueur = SYMBOLE1;
            }

        } while (gagnant == INDEFINI && nbCoupsJoues != 9);

        if (gagnant == INDEFINI) {
            System.out.println("Match nul !");
        } else {
            System.out.println("Le joueur " + gagnant + " à gagné !");
        }

        console.close();
    }
}
