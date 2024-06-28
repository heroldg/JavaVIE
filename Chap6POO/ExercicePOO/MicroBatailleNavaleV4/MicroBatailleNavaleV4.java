package Chap6POO.ExercicePOO.MicroBatailleNavaleV4;

import java.util.Random;
import java.util.Scanner;

public class MicroBatailleNavaleV4 {
    private static int xComputer, yComputer, xJoueur, yJoueur;
    private static boolean gagne, gagneComputer;
    static Grille plateauJoueur;
    static Grille plateauComputer;
     
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        plateauComputer = new Grille();
        plateauJoueur = new Grille();

        xComputer = r.nextInt(1 ,Grille.HAUTEUR);
        yComputer = r.nextInt(1 , Grille.LARGEUR);

        System.out.println("Placer votre bateau sur une base");
        System.out.println("Quelle colonne:");
        yJoueur = console.nextInt() - 1;
        System.out.println("Quelle ligne:");
        xJoueur = console.nextInt() - 1;
        System.out.println("Bateau joueur placé  : (" + (yJoueur + 1) + ";" + (xJoueur + 1) + ")" );
        
        plateauComputer.deposerBateau(xComputer, yComputer);
        plateauJoueur.deposerBateau(xJoueur, yJoueur);
        
        do {
            
            System.out.println("COMPUTER PLATEAU");
            plateauComputer.afficher();
            
            System.out.println("Quelle colonne souhaité vous toucher:");
            yComputer = console.nextInt();
            System.out.println("Quelle ligne  souhaité vous toucher:");
            xComputer = console.nextInt();
            
            gagne = plateauComputer.tirer(xComputer, yComputer);
            
            yJoueur = r.nextInt(1, Grille.HAUTEUR);
            xJoueur = r.nextInt(1 , Grille.LARGEUR);
            
            gagneComputer = plateauJoueur.tirer(xJoueur
            , yJoueur);
            
            System.out.println("Tire du computer en : (" + yJoueur + ";" + xJoueur + ")" );
            System.out.println("JOUEUR PLATEAU");
            plateauJoueur.afficher();
            
            

        } while (!gagne && !gagneComputer);

        if (gagne) {
            plateauComputer.afficher();
            System.out.println("Tu as gagné !");
        } else if (gagneComputer) {
            System.out.println("L'ordinateur à gagné");
            
        
        }

        console.close();
    }
    
}
