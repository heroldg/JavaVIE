package LesBoucles.BoucleFor.ExercicesBoucles.ASCIIArt;

import java.util.Scanner;

public class AsciiArt {
    // L'ASCII Art est l'art de réaliser undessin uniquement avec des caractères. Une des formes les plus primitives de cet art sont les smileys: les caracteres dessinent un vasage souriant 

    // Écrire un algorithme qui affiche un rectangle réalisé en ASCII art suivant les souhait de l'utilisateur. 

    public static void main(String[] args) {
        Scanner console  = new Scanner(System.in);

        char caractere = 'a';
        int largeur = 0;
        int longueur = 0;

        System.out.println("Largeur ?");
        largeur = console.nextInt();
        
        System.out.println("Longueur ?");
        longueur = console.nextInt();

        console.nextLine();
        
        System.out.println("Caractère ?");
        caractere = console.nextLine().charAt(0);

        for (int i = 0; i < longueur; i++) {
            
            for (int j = 0; j < largeur - 1; j++) {
                System.out.print(caractere);
            }
            System.out.println(caractere);
        }
        
        console.close();
    }
}
