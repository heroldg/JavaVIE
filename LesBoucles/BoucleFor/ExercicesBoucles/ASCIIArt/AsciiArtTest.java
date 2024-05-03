package LesBoucles.BoucleFor.ExercicesBoucles.ASCIIArt;

import java.util.Scanner;

public class AsciiArtTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char caractere  = 'a';
        int choix = 0;
        int taille = 0;

        System.out.println("Dessiner une des formes suivantes selon votre choix:");

        while (choix != 7) {
        
        // Choix de la taille de la forme
        System.out.println("Taille ?");
        taille = console.nextInt();
        
        console.nextLine();
        // Choix du caractère de la forme
        System.out.println("Caractère ?");
        caractere = console.nextLine().charAt(0);
        
        
        // Choix de la forme
        System.out.println("Forme ?");
        System.out.print("1 - Rectangle plein \n2 - Rectangle creux \n3 - Triangle rectangle\n4 - Croix de Saint-André\n5 - Losange\n6 - Damier\n7 - Quitter");
        System.out.println();
        
        choix = console.nextInt();

        switch (choix) {
            // Rectangle plein
            case 1:
            
                for (int i = 0; i < taille; i++) {

                    for (int j = 0; j < taille; j++) {
                    System.out.print(caractere);
                    
                }
                System.out.println();
                
            }
            break;
            
            // Rectangle creux
            case 2:

                // Première ligne
                for (int i = 0; i < taille; i++) {
                    System.out.print(caractere);
                }
                System.out.println(); // Saut de ligne

                // Ligne du milieu
                for (int i = 0; i < taille - 2; i++) {
                    for (int j = 0; j < taille - 1; j++) {
                        if (j == 0) {
                            
                            System.out.print(caractere);
                        } else {

                            System.out.print(" ");
                        }
                        
                    }
                    System.out.println(caractere);
                }

                 // Dernière ligne
                 for (int i = 0; i < taille; i++) {
                    System.out.print(caractere);
                }
                
                System.out.println();



                
            break;
            // Triangle rectangle
            case 3: 
            // Première ligne
            System.out.print(caractere + "\n");

            // Ligne du milieu
            for (int i = 0; i < taille - 2; i++) {
                System.out.print(caractere);

                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                System.out.println(caractere);
            }

            // Dernière ligne
            for (int i = 0; i < taille; i++) {
                System.out.print(caractere);
            }
            
            
            System.out.println();

            break;
            // Croix Saint-Anne
            case 4: 
           // En haut 
           for (int i = 0; i < taille / 2; i++) {

                    
            // En haut à gauche
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(caractere);
            System.out.print(" ");

            // En haut à droite
            for (int j = 1; j <  (taille / 2) - i; j++) {
                
                System.out.print(" ");
                System.out.print(" ");
            }
            
            System.out.println(caractere);


    }
            break;
            case 5:
            console.close();
            break;
            
        
            default:
                break;
        }
        
    }
    }
}
