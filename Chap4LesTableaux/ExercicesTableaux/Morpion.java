package Chap4LesTableaux.ExercicesTableaux;

import java.util.Scanner;

public class Morpion {
    // Créer un algorithme permettant de jouer au morpion : dans une grille de trois cases par trois, les joueurs écrivent tour à tour leur symbole (X et O), dans une case vide/ Le premier joueur qui parvient ç aligner (enligne, en colonne ou en diagonale) trois de ses symboles a gagné. 
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // Création d'un tableau pour le champs de bataille
        final int HAUTEUR  = 3;
        final int LARGEUR = 3;
        char[][] battleField = new char[LARGEUR][HAUTEUR];

        // Faire saisir les participants
        int player1Colonne;
        int player1Ligne;
        char player1Symbol = 'x';
        
        int player2Colonne;
        int player2Ligne;
        char player2Symbol = 'o';

        int nbDeCoup = 0;


        // Initialisation du champs de bataille
        for (int i = 0; i < battleField.length; i++) {
            System.out.printf("|");
            for (int j = 0; j < battleField.length; j++) {
                battleField[i][j] = ' ';
                System.out.print(battleField[i][j] + "|");
            }
            System.out.println();
        }

        
        
        
        
         while (
            
                 (battleField[0][0] != player1Symbol || battleField[0][1] != player1Symbol || battleField[0][2] != player1Symbol)  &&
                 (battleField[1][0] != player1Symbol || battleField[1][1] != player1Symbol || battleField[1][2] != player1Symbol)  &&
                 (battleField[2][0] != player1Symbol || battleField[2][1] != player1Symbol || battleField[2][2] != player1Symbol)  &&
                 (battleField[0][0] != player1Symbol || battleField[1][0] != player1Symbol || battleField[2][0] != player1Symbol) &&
                 (battleField[0][1] != player1Symbol || battleField[1][1] != player1Symbol || battleField[2][1] != player1Symbol) &&
                 (battleField[0][2] != player1Symbol || battleField[1][2] != player1Symbol || battleField[2][2] != player1Symbol) &&
                 
                 (battleField[0][0] != player2Symbol || battleField[0][1] != player2Symbol || battleField[0][2] != player2Symbol) &&
                 (battleField[1][0] != player2Symbol || battleField[1][1] != player2Symbol || battleField[1][2] != player2Symbol) &&
                 (battleField[2][0] != player2Symbol || battleField[2][1] != player2Symbol || battleField[2][2] != player2Symbol) &&
                 (battleField[0][0] != player2Symbol || battleField[1][0] != player2Symbol || battleField[2][0] != player2Symbol) &&
                 (battleField[0][1] != player2Symbol || battleField[1][1] != player2Symbol || battleField[2][1] != player2Symbol) &&
                 (battleField[0][2] != player2Symbol || battleField[1][2] != player2Symbol || battleField[2][2] != player2Symbol) &&
                 
                 (battleField[0][0] != player1Symbol || battleField[1][1] != player1Symbol || battleField[2][2] != player1Symbol) &&
                 (battleField[0][0] != player2Symbol || battleField[1][1] != player2Symbol || battleField[2][2] != player2Symbol) &&
                 
                 
                 (battleField[0][2] != player1Symbol || battleField[1][1] != player1Symbol || battleField[2][0] != player1Symbol) &&
                 (battleField[0][2] != player2Symbol || battleField[1][1] != player2Symbol || battleField[2][0] != player2Symbol) 
                 ) {
                            // Tour du joueur 1
                        System.out.println("Faites jouer le joueur 1");
                        System.out.println("Quelle colonne ?");
                        player1Colonne = console.nextInt() - 1;
                        System.out.println("Quelle ligne ?");
                        player1Ligne = console.nextInt() - 1;

                        if (battleField[player1Colonne][player1Ligne] == player2Symbol) {
                            System.out.println("Cette case est déjà prise par le joueur 2, veuillez prendre une case vide:");
                            System.out.println("Quelle colonne ?");
                            player1Colonne = console.nextInt() - 1;
                            System.out.println("Quelle ligne ?");
                            player1Ligne = console.nextInt() - 1;
                        }

                        battleField[player1Colonne][player1Ligne] = player1Symbol;
                        
                        for (int i = 0; i < battleField.length; i++) {
                            for (int j = 0; j < battleField.length; j++) {
                            System.out.print(battleField[i][j] + "|");
                            }
                            System.out.println();
                        }
                        
                        nbDeCoup++;
                        
                        //Tour du joueur 2
                        System.out.println("Faites jouer le joueur 2");
                        System.out.println("Quelle colonne ?");
                        player2Colonne = console.nextInt() - 1;
                        System.out.println("Quelle ligne ?");
                        player2Ligne = console.nextInt() - 1;
                        
                        if (battleField[player2Colonne][player2Ligne] == player1Symbol) {
                            System.out.println("Cette case est déjà prise par le joueur 1, veuillez prendre une case vide:");
                            System.out.println("Quelle colonne ?");
                            player2Colonne = console.nextInt() - 1;
                            System.out.println("Quelle ligne ?");
                            player2Ligne = console.nextInt() - 1;
                        }
                        battleField[player2Colonne][player2Ligne] = player2Symbol;
                        
                        
                        for (int i = 0; i < battleField.length; i++) {
                            for (int j = 0; j < battleField.length; j++) {
                                System.out.print(battleField[i][j] + "|");
                            }
                            System.out.println();
                        }
                        nbDeCoup++;
            };

            if (nbDeCoup % 2 == 0 && nbDeCoup < 9) {
                System.out.println("Le joueur 2 à gagné !");
            } else if (nbDeCoup % 2 != 0 && nbDeCoup < 9) {
                
                System.out.println("Le joueur 1 à gagné !");
            } else {
                
                System.out.println("Match nul");
            }
        
        
            console.close();
        
    }
}
