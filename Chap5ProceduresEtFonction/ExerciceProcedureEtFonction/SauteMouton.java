package Chap5ProceduresEtFonction.ExerciceProcedureEtFonction;

import java.util.Scanner;

public class SauteMouton {
    // faire un tab à 7 entrée pour y mettre 2 troupeau de 3 mouton et 1 espace
    final static int TAILLE = 7;
    final static char[] espaceDeJeu = new char[TAILLE];
    final static char ESPACE = ' ';
    final static char moutonGauche = '>';
    final static char moutonDroite = '<';
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // To properly close the Scanner object and prevent resource leaks, you should call console.close() after you are done using the scanner. In your current implementation, it makes the most sense to close the Scanner within the bougerMouton method after reading the user input, since this is the only place where the scanner is used. However, since the game has a loop that repeatedly calls bougerMouton, closing the scanner inside the method will cause an issue because the scanner will be closed on the first call, and subsequent calls will attempt to use a closed scanner, leading to an exception.

        // To avoid this, you can either:

        // Declare the scanner outside the loop and close it after the loop ends.
        initialisationEspaceDeJeu();
        afficherEspaceDeJeu();
        while (espaceDeJeu[0] != moutonDroite || espaceDeJeu[1] != moutonDroite || espaceDeJeu[2] != moutonDroite || espaceDeJeu[3] != ESPACE) {
            bougerMouton(console); // Ici Scanner console est en paramètre 
            afficherEspaceDeJeu();
            
        }
        System.out.println("Bravo vous avez gagné !");
    } 

    public static void initialisationEspaceDeJeu() {

        // troupeau de gauche
        for (int i = 0; i < TAILLE / 2; i++) {
            espaceDeJeu[i] = moutonGauche; 
        }
        espaceDeJeu[3] = ESPACE;
        // troupeau de droite
        for (int i = 4; i < espaceDeJeu.length; i++) {
            espaceDeJeu[i] = '<'; 
            
        }
    }

    public static void afficherEspaceDeJeu() {

        System.out.print("| ");
        for (int i = 0; i < espaceDeJeu.length; i++) {
            System.out.print( i + " | ");
        }
        System.out.print("\n");

        System.out.print("| ");
        for (int i = 0; i < espaceDeJeu.length; i++) {
            System.out.print( espaceDeJeu[i] +" | ");
        }
        System.out.print("\n");
    }

    public static void bougerMouton(Scanner console) {
            
        System.out.println("Quel mouton voulez vous déplacer ?");
        int mouton = console.nextInt();
        if (espaceDeJeu[mouton] == moutonGauche) {
            if (espaceDeJeu[mouton + 1] == ESPACE ) {
                espaceDeJeu[mouton + 1] = espaceDeJeu[mouton] ;
                espaceDeJeu[mouton] = ESPACE;
            
            } else if (espaceDeJeu[mouton + 1] == moutonDroite && espaceDeJeu[mouton + 2] == ESPACE) {
                espaceDeJeu[mouton + 2] = espaceDeJeu[mouton];
                espaceDeJeu[mouton] = ESPACE;
            }
        }


        if (espaceDeJeu[mouton] == moutonDroite) {
            
            if(espaceDeJeu[mouton - 1] == ESPACE) {
                espaceDeJeu[mouton - 1] = espaceDeJeu[mouton];
                espaceDeJeu[mouton] = ESPACE;
            } else if (espaceDeJeu[mouton - 1] == moutonGauche && espaceDeJeu[mouton - 2] == ESPACE) {
                espaceDeJeu[mouton - 2] = espaceDeJeu[mouton];
                espaceDeJeu[mouton] = ESPACE;
            }
            
        }
    }
}
