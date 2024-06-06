package Chap5ProceduresEtFonction.CorrectionExo;

import java.util.Random;
import java.util.Scanner;

public class MicroBatailleNavale {
    // Taille du plateau de jeu
    static final int TAILLE = 5;
    static char[][] plateau = new char[TAILLE][TAILLE];
    // Position du bateau
    static int bateauX;
    static int bateauY;

    // Initialiser le plateau de jeu avec des '~' (eau)
    public static void initialiserPlateau() {
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                plateau[i][j] = '~';
            }
        }
    }

    // Placer le bateau à une position aléatoire
    public static void placerBateau() {
        Random rand = new Random();
        bateauX = rand.nextInt(TAILLE);
        bateauY = rand.nextInt(TAILLE);
    }

    // Afficher le plateau de jeu
    public static void afficherPlateau() {
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                System.out.print(plateau[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Demander à l'utilisateur de saisir un entier entre min et max (inclus)
    public static int saisirEntierEntreBornes(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int valeur;
        do {
            System.out.println("Veuillez saisir un entier entre " + min + " et " + max + ":");
            valeur = scanner.nextInt();
            // scanner.close();
        } while (valeur < min || valeur > max);
        return valeur;
    }

    // Permettre au joueur de choisir ses coordonnées de tir
    public static boolean tirer() {
        System.out.println("Coordonnées de tir:");
        int x = saisirEntierEntreBornes(0, TAILLE - 1);
        int y = saisirEntierEntreBornes(0, TAILLE - 1);

        // Vérifier si le bateau est touché
        if (x == bateauX && y == bateauY) {
            plateau[x][y] = 'X';  // Marquer le coup réussi sur le plateau
            System.out.println("Touché!");
            return true;
        } else {
            plateau[x][y] = 'O';  // Marquer le coup raté sur le plateau
            System.out.println("Manqué!");
            return false;
        }
    }

    public static void main(String[] args) {
        initialiserPlateau();
        placerBateau();
        afficherPlateau();

        boolean touche = false;
        while (!touche) {
            touche = tirer();
            afficherPlateau();
        }
        
        System.out.println("Vous avez coulé le bateau!");
    }
}
