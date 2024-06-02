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

        int saisieColonne = 0;
        int saisieLigne = 0;

        int aleatLargeur;
        aleatLargeur = (int)(random.nextInt(LARGEUR));
        int aleatHauteur;
        aleatHauteur = (int) (random.nextInt(HAUTEUR));

        initialiserPlateau(champsDeBaitaille, LARGEUR, HAUTEUR, aleatLargeur, aleatHauteur);

        afficherPlateau(champsDeBaitaille, aleatLargeur, aleatHauteur);

        // saisirEntierEntreBornes(saisieColonne, saisieLigne, LARGEUR, HAUTEUR);
        
        tirer(champsDeBaitaille, saisieColonne, saisieLigne, aleatLargeur, aleatHauteur, LARGEUR, HAUTEUR);
            
        console.close();
    }

    public static void initialiserPlateau(char[][] champsBataille, int l, int h, int lAleatoir, int hAleatoire) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < h; j++) {
                champsBataille[i][j] = '?';
                
                if (champsBataille[lAleatoir][hAleatoire] == champsBataille[i][j]) {
                    
                    champsBataille[i][j] = 'o';
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

    public static char[][] saisirEntierEntreBornes(char[][] tabValSaisie, int saisieColonne, int saisieLigne , int Largeur, int Hauteur) {
        Scanner console = new Scanner(System.in); 

       
            while (saisieColonne >= Largeur) {
                System.out.println("La colonne selectionner est hors du champs d'action, veuillez choisir entre 1 et " + Largeur + ":");
                saisieColonne = console.nextInt() - 1;
            }
            
            
            while (saisieColonne >= Hauteur) {
                System.out.println("La ligne selectionner est hors du champs d'action, veuillez choisir entre 1 et " + Hauteur + ":");
            }
            
        
        
        tabValSaisie[saisieColonne][saisieLigne] = 'x';
        console.close();


        return tabValSaisie ;
        
    }

    public static char tirer(char[][] tabChampsBataille  ,int saisieColonne, int saisieLigne, int cibleLargeur, int cibleHauteur, int Largeur, int Hauteur) {
        Scanner console = new Scanner(System.in);
        
        do {
            
           
            System.out.println("Quelle colonne ?");
            saisieColonne = console.nextInt() - 1;
            
           

            System.out.println("Quelle ligne ?");
            saisieLigne = console.nextInt() - 1;
            
            tabChampsBataille[saisieLigne][saisieColonne] = 'x';
            
            // saisirEntierEntreBornes(tabChampsBataille, saisieColonne, saisieLigne, Largeur, Hauteur);

            afficherPlateau(tabChampsBataille, cibleLargeur, cibleHauteur);

            

        } while (tabChampsBataille[saisieColonne][saisieLigne] != tabChampsBataille[cibleLargeur][cibleHauteur]);

        System.out.println("cible touché !");

        console.close();
        return tabChampsBataille[saisieColonne][saisieLigne] = 'x';
    }
}
