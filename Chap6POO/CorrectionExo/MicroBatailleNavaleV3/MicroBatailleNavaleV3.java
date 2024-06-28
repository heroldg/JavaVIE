package Chap6POO.CorrectionExo.MicroBatailleNavaleV3;

import java.util.Random;
import java.util.Scanner;

public class MicroBatailleNavaleV3 {
    
    private static  int x , y;
    private static boolean gagne;
    static Grille plateauDejeu;
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        plateauDejeu = new Grille();
        x = r.nextInt(1, Grille.LARGEUR);
        y = r.nextInt(1, Grille.HAUTEUR);

        plateauDejeu.deposerBateau(x, y);
        do {
            plateauDejeu.afficher();
            System.out.println("Quelle colonne: ");
            x = console.nextInt();
            System.out.println("Quelle ligne: ");
            y = console.nextInt();
            gagne = plateauDejeu.tirer(x, y);
            
        } while (!gagne);
        plateauDejeu.afficher();
        System.out.println("Touché coulé ! Bravo, vous avez gagné !");

        console.close();
    }


}
