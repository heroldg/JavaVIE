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
        System.out.print(" \n1 - Rectangle plein \n2 - rectangle creux \n3 - Triangle rectangle \n4 - Croix de Saint-André \n5 - Losange \n6 - Damier \n7 - Quitter \n");

        choix = console.nextInt();

        switch (choix) {

            case 1:
            // RECTANGLE PLEIN
            for (int i = 0; i < taille; i++) {
                
                for (int j = 0; j < taille - 1; j++) {
                    if (j == 0 && j == taille - 1) {
                        
                    }
                    System.out.print(caractere);
                    
                }
                System.out.println(caractere);
            }
            
            break;
            
            case 2:
            // RECTANGLE CREUX
            // Premier ligne
            for (int i = 0; i < taille; i++) {
                System.out.print(caractere);
                
            }
            System.out.print("\n"); // System.out.println() aurait fait la même action c'a-d sauté une ligne
            // LIGNES DU MILIEU
            for (int i = 0; i < taille - 2; i++) { // taille - 2 permet d'intégrer les espaces vides et la condition pour les caractères au milieu
                
                for (int j = 0; j < taille - 1; j++) {
                    if (j == 0 || j == taille - 2) {
                        
                        System.out.print(caractere);
                    }
                    
                    System.out.print(" ");
                    
                    
                }
                System.out.println();
            }

            // Dernière ligne
            for (int i = 0; i < taille ; i++) {
                System.out.print(caractere);
                
            }
            System.out.print("\n");

            
            
            break;
            case 3: 
            // TRIANGLE RECTANGLE
            
            // Première ligne
            if (taille > 0) {
                System.out.print(caractere);
            }
            // Pour toutes les lignes entre la premiere et la derniere
            for (int i = 0; i < taille - 2; i++) {

                System.out.println();
                System.out.print(caractere);

                // Cela permet de rajouter un espace à chaque nouvelle ligne pour obtenir le triangle souhaité
                do {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                } while (i == taille - 2);
                    
                System.out.print(caractere);
                
            }
            System.out.println();
            // Dernière ligne
            for (int i = 0; i < taille ; i++) {
                System.out.print(caractere);
                
            }
            System.out.println();
            
            break;
            case 4: 
            // Croix de Saint-André
           
            for (int i = 0; i < taille ; i++) {

                
                // Cela permet de rajouter un espace à chaque nouvelle ligne 
                do {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                } while (i == taille);
                
                System.out.print(caractere);
                
                System.out.println();
                
            }
            
           

            
            break;
            case 5: 
            // LOSANGE
            
            break;
            case 6: 
            // DAMIER
            for (int i = 0; i < taille; i++) {
                
                for (int j = 0; j < taille - 1; j++) {
                    if (j == 0 && j == taille - 1) {
                        
                    }
                    System.out.print(caractere);
                    System.out.print(" ");
                    
                }
                System.out.println(caractere);
            }
            
            
            break;
            case 7:
            
            System.out.println("Au revoir ! ");
            console.close();
            break;

            default:
            break;
        }
    }
        
        
    }

}
