package Chap6POO.CorrectionExo.MicroBatailleNavaleV4;

import java.util.Random;
import java.util.Scanner;

import Chap6POO.ExercicePOO.MicroBatailleNavaleV4.Grille;

public class MicrobatailleNavaleV4 {
    
    static Grille plateauJoueur, plateauOrdi;
    private static int x, y, numTir = 0;
    private static boolean gagne;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random r = new  Random();
        
        // L'ordinateur prépare son plateau de jeu
        
        plateauOrdi = new Grille();
        x = r.nextInt(1 , Grille.LARGEUR);
        y = r.nextInt(1, Grille.HAUTEUR);
        plateauOrdi.deposerBateau(x, y);

        // Le joueur prépare son plateau de jeu
        plateauJoueur = new Grille();
        System.out.println("Positionnez votre bateau");
        x = console.nextInt();
        y = console.nextInt();
        plateauJoueur.deposerBateau(x, y);

        do {
            System.out.println("Votre carré de tir");
            plateauOrdi.afficher();
            x = console.nextInt();
            y = console.nextInt();

            gagne = plateauOrdi.tirer(x, y);

            if (gagne) {
                plateauOrdi.afficher();
                System.out.println("Touché coulé ! Bravo, vous avez gagné");
            } else {
                x = numTir % Grille.LARGEUR + 1;
                y = numTir / Grille.LARGEUR + 1;

                System.out.println("L'ordinateur tire en " + x + ";" + y);
                numTir = numTir + 1;
                gagne = plateauJoueur.tirer(x, y);
                System.out.println("Le carré de tir de l'ordinateur: ");
                plateauJoueur.afficher();
                if (gagne) {
                    System.out.println("Touché Coulé ! Vous avez perdu !");
                }
            }

        } while (!gagne);

        console.close();
    }
    // public int saisie(String message, int min, int max ) {

    //     int valeur;
    //     valeur = message;
    //     while (valeur < min || valeur > max ) {
    //         System.out.println("La valeur doit être comprise entre" +  min + " et " + max );
    //         valeur = 
    //     }


    //         return valeur
    // }
    
}
