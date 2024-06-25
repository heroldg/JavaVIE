package Chap6POO.ExercicePOO.MicroBatailleNavaleV3;

import java.util.Scanner;

public class MicroBatailleNavaleV3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int pointX = 0;
        int pointY = 0;
        
        Grille grille = new Grille();
        grille.deposerBateau(console);
        grille.afficher();
        // while (condition) {
            System.out.println("Vous souhaitez tirer sur la ligne :");
        pointX = console.nextInt() - 1;
        System.out.println("Vous souhtaitez tirer sur la colonne : ");
        pointY = console.nextInt() - 1;
        
        int[] tir = grille.utilise(pointX, pointY);
        grille.tirer(tir[0], tir[1]);
        grille.afficher();
        // }
        console.close();

    }
}
 