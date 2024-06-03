package Chap5ProceduresEtFonction.ExerciceProcedureEtFonction;

import java.util.Scanner;

public class SauteMouton {
    // faire un tab à 7 entrée pour y mettre 2 troupeau de 3 mouton et 1 espace
    final static int TAILLE = 7;
    final static char[] espaceDeJeu = new char[TAILLE];
    final static char ESPACE = ' ';
    final static char MoutonGauche = '>';
    final static char MoutonDroite = '<';
    public static void main(String[] args) {
        
        initialisationEspaceDeJeu();
        afficherEspaceDeJeu();
        while (espaceDeJeu[0] != MoutonDroite ) {
            bougerMouton();
            afficherEspaceDeJeu();
            
        }
    } 

    public static void initialisationEspaceDeJeu() {

        // troupeau de gauche
        for (int i = 0; i < TAILLE / 2; i++) {
            espaceDeJeu[i] = MoutonGauche; 
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

    public static void bougerMouton() {
            
        Scanner console = new Scanner(System.in);
        System.out.println("Quel mouton voulez vous déplacer ?");
        int mouton = console.nextInt();
        if (espaceDeJeu[mouton + 1] == ESPACE ) {
            espaceDeJeu[mouton + 1] = espaceDeJeu[mouton] ;
            espaceDeJeu[mouton] = ESPACE;
        } else if(espaceDeJeu[mouton - 1] == ESPACE) {
            espaceDeJeu[mouton - 1] = espaceDeJeu[mouton];
            espaceDeJeu[mouton] = ESPACE;
        }
    }
}
