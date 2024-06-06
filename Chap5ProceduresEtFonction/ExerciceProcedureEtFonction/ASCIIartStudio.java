package Chap5ProceduresEtFonction.ExerciceProcedureEtFonction;

import java.util.Scanner;

public class ASCIIartStudio {
    public static int LIGNES = 10;
    public static int COLONNES = 40;
    public static char[][] tabAscii = new char[LIGNES][COLONNES];


    public static void main(String[] args) {
        int choix = 0;
        Scanner console = new Scanner(System.in);
        initialiserTabAscii(tabAscii);
        afficherTabAscii(tabAscii);
        presentation(console);
        choix = console.nextInt();
        switch (choix) {
            case 1:
            console.nextLine();
            dessinerUnCaractere(tabAscii, console);
                
                break;
        
            case 2:
            console.nextLine();
            int caractereRectangle = dessinerUnRectangle(tabAscii, console);
                
                break;
        
            case 3:
            console.nextLine();
            changerDeCaractere(tabAscii, LIGNES, COLONNES, console);
                
                break;
        
            default:
                break;
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

    public static void changerDeCaractere(char[][] TabAscii, int l, int c, Scanner console) {
        int x , y, ancienCaractere, nouveauCaractere;
        System.out.println("Selectionner un caractère à dessiner ");
        char caractere = console.nextLine().charAt(0);
        System.out.println("Selectionner la ligne du caractère " + caractere + " :");
        x = console.nextInt() - 1;
        System.out.println("Selectionner la colonne du caractère " + caractere + " :");
        y = console.nextInt() - 1;
        if (x >= 0 && x < LIGNES && y >= 0 && y < COLONNES) {
            ancienCaractere = tabAscii[x][y];

            
        }
    }

    public static void changerCaractereRecursive(int x, int y, char[][] TabAscii, int l, int c, char ancienCaractere, char nouveauCaractere ) {
        if (x >= 0 && x < LIGNES && y > 0 && y < COLONNES) {
            if (tabAscii[y][x] == ancienCaractere) {
                tabAscii[y][x] = nouveauCaractere;
                changerCaractereRecursive(x - 1, y, TabAscii, l, c, ancienCaractere, nouveauCaractere);
                changerCaractereRecursive(x + 1, y, TabAscii, l, c, ancienCaractere, nouveauCaractere);
                changerCaractereRecursive(x, y - 1, TabAscii, l, c, ancienCaractere, nouveauCaractere);
                changerCaractereRecursive(x, y + 1, TabAscii, l, c, ancienCaractere, nouveauCaractere);

            }
        }
    }
    
}
