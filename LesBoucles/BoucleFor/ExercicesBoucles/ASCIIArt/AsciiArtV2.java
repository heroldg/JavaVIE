package LesBoucles.BoucleFor.ExercicesBoucles.ASCIIArt;

import java.util.Scanner;

public class AsciiArtV2 {
    // Dessiner des formes selon le choix de l'utilisateur
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    char caractere = 'a';
    int choix = 0;
    int taille = 0;


    System.out.println("Dessigner une des formes suivantes selon votre choix: ");

    while (choix != 7) {
        // Choix de la taille de la forme
        System.out.println("Taille ?");
        taille = console.nextInt();
        
        console.nextLine();
        // Choix du caractère de la forme
        System.out.println("Caractère ?");
        caractere = console.nextLine().charAt(0);
        
        // Choix du caractère de la forme
        System.out.println("Forme ?");
        System.out.print(" \n1 - Rectangle plein \n2 - rectangle creux \n3 - Triangle rectangle \n4 - Croix de Saint-André \n5 - Losange \n6 - Damier \n 7 - Quitter \n");

        choix = console.nextInt();

        switch (choix) {

            case 1:
            for (int i = 0; i < taille; i++) {
            
                for (int j = 0; j < taille - 1; j++) {
                    System.out.print(caractere);
                    
                }
                System.out.println(caractere);
            }
            
            break;
            
            case 2:
            
                for (int j = 0; j < taille - 1; j++) {
                    System.out.print(caractere);
                    
                }


            break;
            
            default:
            break;
        }
    }
        
        
    }

}
