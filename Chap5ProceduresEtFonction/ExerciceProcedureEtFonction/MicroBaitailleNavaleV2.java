package Chap5ProceduresEtFonction.ExerciceProcedureEtFonction;

import java.util.Random;
import java.util.Scanner;

public class MicroBaitailleNavaleV2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        final int HAUTEUR = 4;
        final int LARGEUR = 4;
        char[][] champsDeBaitaille = new char[LARGEUR][HAUTEUR];

        int aleatLargeur;
        aleatLargeur = (int)(random.nextInt(LARGEUR));
        int aleatHauteur;
        aleatHauteur = (int) (random.nextInt(HAUTEUR));

        initialiserPlateau(champsDeBaitaille, LARGEUR, HAUTEUR, aleatLargeur, aleatHauteur);

        afficherPlateau(champsDeBaitaille, aleatLargeur, aleatHauteur);

        
    }

    public static void initialiserPlateau(char[][] champsBataille, int l, int h, int lAleatoir, int hAleatoire) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < h; j++) {
                champsBataille[i][j] = '?';
                
                if (champsBataille[lAleatoir][hAleatoire] == champsBataille[i][j]) {
                    
                    champsBataille[i][j] = 'x';
                }
            }
        }
    }

    public static void afficherPlateau(char[][] champsBataille, int l, int h) {
        for (int i = 0; i < champsBataille.length; i++) {
            for (int j = 0; j < champsBataille[h].length; j++) {

                
                    System.out.print(champsBataille[i][j]);
                
            }
            System.out.println();
        }
    }

    // public static saisirEntierEntreBornes() {
        

    // }

    // public static tirer() {

    // }
}
