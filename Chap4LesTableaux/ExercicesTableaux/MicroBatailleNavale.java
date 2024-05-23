package Chap4LesTableaux.ExercicesTableaux;

import java.util.Random;
import java.util.Scanner;

public class MicroBatailleNavale {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        final int HAUTEUR = 4;
        final int LARGEUR = 4;
        char[][] battleField = new char[LARGEUR][HAUTEUR];
        
        int aleatHauteur;
        aleatHauteur = (int)(random.nextInt(HAUTEUR));
        int aleatLargeur;
        aleatLargeur = (int)(random.nextInt(LARGEUR));
        
        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                battleField[i][j] = '?';
                
                if ( battleField[aleatLargeur][aleatHauteur]== battleField[i][j] ) {
                battleField[i][j] = 'x';
                }
                System.out.print(battleField[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("Quelle colonne ?");
        int saisieColonne = console.nextInt() - 1;
        
        if (saisieColonne > LARGEUR) {
            System.out.println("La colonne selectionner est hors du champs d'action, veuillez choisir entre 1 et 4:");
            saisieColonne = console.nextInt() - 1;
        }
        
        System.out.println(saisieColonne);
        
        System.out.println("Quelle ligne ?");
        int saisieLigne = console.nextInt() - 1;

        if (saisieColonne > HAUTEUR) {
            System.out.println("La colonne selectionner est hors du champs d'action, veuillez choisir entre 1 et 4:");
            saisieLigne = console.nextInt() - 1;
        }
        
        System.out.println(saisieLigne);
        
        
        do {
            System.out.println("Plouf ! À l'eau !");
            for (int i = 0; i < battleField.length; i++) {
                for (int j = 0; j < battleField.length; j++) {
                    battleField[saisieColonne][saisieLigne] = 'o';
                    System.out.print(battleField[i][j]);
                    
                }
                System.out.println();
            }
            System.out.println("Quelle colonne ?");
            saisieColonne = console.nextInt() - 1;
            
             System.out.println("Quelle ligne ?");
            saisieLigne = console.nextInt() - 1;

        
        }
        while (battleField[aleatLargeur][aleatHauteur] != battleField[saisieColonne][saisieLigne] ) ;
        

        System.out.println("Boum ! Touché coulé");
        System.out.println("Bravo, Vous avez gagné");

    }
    
    
}
