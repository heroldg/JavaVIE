package Chap5ProceduresEtFonction.ExerciceProcedureEtFonction;

import java.util.Scanner;

public class ASCIIartStudio {
    public static int LIGNES = 10;
    public static int COLONNES = 40;
    public static char[][] tabAscii = new char[LIGNES][COLONNES];
    public static char caractereRect = ' ';


    public static void main(String[] args) {
        int choix = 0;
        Scanner console = new Scanner(System.in);
        initialiserTabAscii(tabAscii);
        afficherTabAscii(tabAscii);
        
        
        while (choix != 4) {

            presentation(console);
            choix = console.nextInt();
            
            switch (choix) {
                case 1:
                console.nextLine();
                dessinerUnCaractere(tabAscii, console);
                
                break;
                
                case 2:
                console.nextLine();
                caractereRect  = dessinerUnRectangle(tabAscii, console);
                
                break;
                
                case 3:
                console.nextLine();
                changerDeCaractere(tabAscii, caractereRect, console);
                
                break;
                
                case 4:
                System.out.println("Fin , aurevoir !");
                break;
                
                default:
                break;
            }
        }

    
    }

    public static void initialiserTabAscii(char[][] tabAUtiliser) {
        for (int i = 0; i < tabAUtiliser.length ; i++) {
            for (int j = 0; j < tabAUtiliser[i].length ; j++) {
                tabAUtiliser[i][j] = '_';
            }
        }
    }
    public static void afficherTabAscii(char[][] tabAsciiAAfficher) {
        System.out.print("   ");
        for (int i = 0; i < COLONNES; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        System.out.print("   ");
        for (int i = 0; i < COLONNES; i++) {
            if (i < 10) {
                
                System.out.print("__");
            } else {
                
                System.out.print("___");
            }
        }
        for (int i = 0; i < tabAsciiAAfficher.length ; i++) {
            if (i < 9) {
                System.out.println();
                System.out.print(i + 1 + " |");
            } else {
                System.out.println();
                System.out.print(i + 1 + "|" );

            }
            for (int j = 0; j < tabAsciiAAfficher[i].length ; j++) {
        
                if (j < 9) {
                    
                    System.out.print(tabAsciiAAfficher[i][j] + "|");
                } else {
                    
                    System.out.print(tabAsciiAAfficher[i][j] + "_|");
                }
            }
        }

        System.out.println();
    }

    public static void presentation(Scanner console) {
        System.out.println("Choissisez entre les choix suivants:");
        System.out.println("1 - Dessiner un caractère");
        System.out.println("2 - Dessiner un rectangle avec un ensemble de caractères");
        System.out.println("3 - Changer le caractère ");
        System.out.println("4 - QUITTER");
      
    }

    public static char dessinerUnCaractere(char[][] tabAscii, Scanner console) {
        System.out.println("Selectionner un caractère à dessiner ");
        char caractere = console.nextLine().charAt(0);
        System.out.println("Selectionner la ligne du caractère " + caractere + " :");
        int l = console.nextInt() - 1;
        System.out.println("Selectionner la colonne du caractère " + caractere + " :");
        int c = console.nextInt() - 1;
        if (l < LIGNES && c < COLONNES ) {
            tabAscii[l][c] = caractere;
            afficherTabAscii(tabAscii);
        } else {
            console.nextLine();
            System.out.println("Les valeurs selectionner ne rentres pas dans le tableau, réessayez:");
            dessinerUnCaractere(tabAscii, console);
        }

        return caractere;
    }

    
    public static char dessinerUnRectangle(char[][] tabAscii, Scanner console) {
        System.out.println("Selectionner un caractère à dessiner ");
        char caractere = console.nextLine().charAt(0);
        System.out.println("Nombre de lignes pour ce rectangle: ");
        int ligneRectangle = console.nextInt();
        System.out.println("Nombre de colonnes pour ce rectangle:");
        int colonneRectangle = console.nextInt();
        System.out.println("À quelle lignes commence votre rectangle: ");
        int startLigne = console.nextInt() - 1;
        System.out.println("À quelle colonnes commence votre rectangle:");
        int startColonne = console.nextInt() - 1;

        if (ligneRectangle + startLigne > LIGNES || colonneRectangle + startColonne > COLONNES) {
            System.out.println("Les valeurs selectionner dépassent les limites du champs d'action de se tableau, veuillez recommencez:");
            console.nextLine();
            ligneRectangle = 0;
            colonneRectangle = 0;
            startColonne = 1;
            startLigne = 1;
            dessinerUnRectangle(tabAscii, console);
        } else {

            for (int i = startLigne ; i < ligneRectangle + startLigne; i++) {
                for (int j = startColonne ; j < colonneRectangle + startColonne; j++) {
                        tabAscii[i][j] = caractere; 
                }
            }
        }



        afficherTabAscii(tabAscii);

        return caractere;
        
    }

    public static void changerDeCaractere(char[][] TabAscii, char ancienCaractere, Scanner console) {
        int x , y;

        System.out.println("Selectionner un caractère à dessiner ");
        char nouveauCaractere = console.nextLine().charAt(0);
        System.out.println("Selectionner la ligne du caractère " + nouveauCaractere + " :");
        x = console.nextInt() - 1;
        System.out.println("Selectionner la colonne du caractère " + nouveauCaractere + " :");
        y = console.nextInt() - 1;
        if (x >= 0 && x < LIGNES && y >= 0 && y < COLONNES) {  
            if (tabAscii[x][y] == ancienCaractere) {
                
                if (ancienCaractere != nouveauCaractere) {
                changernouveauCaractereRecursive(x, y, TabAscii, ancienCaractere, nouveauCaractere);
            }
        }
            
        }

        afficherTabAscii(tabAscii);

    }

    public static void changernouveauCaractereRecursive(int x, int y, char[][] TabAscii, char ancienCaractere, char nouveauCaractere ) {
        if (x >= 0 && x < LIGNES && y > 0 && y < COLONNES) {
            if (tabAscii[x][y] == ancienCaractere) {
                tabAscii[x][y] = nouveauCaractere;
                changernouveauCaractereRecursive(x - 1, y, TabAscii, ancienCaractere, nouveauCaractere);
                changernouveauCaractereRecursive(x + 1, y, TabAscii, ancienCaractere, nouveauCaractere);
                changernouveauCaractereRecursive(x, y - 1, TabAscii, ancienCaractere, nouveauCaractere);
                changernouveauCaractereRecursive(x, y + 1, TabAscii, ancienCaractere, nouveauCaractere);

            }
        }
    }
    
}
