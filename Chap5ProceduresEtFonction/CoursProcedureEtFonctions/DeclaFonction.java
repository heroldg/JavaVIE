package Chap5ProceduresEtFonction.CoursProcedureEtFonctions;

import java.util.Scanner;

public class DeclaFonction {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Quelle phrase avec-vous à copier pour votre punition");
        String phrase = console.nextLine();

        System.out.println("Combien de fois avez-vous eu à la copier ? ");
        int nbFois = console.nextInt();
        console.nextLine();

        afficheNfois(phrase, nbFois);
        console.close();


    }

    // Déclaration d'une fonction
    public static double puissance(double a , int n) {
        double p = 1;
        for (int i = 0; i < n; i++) {
            p *= a;
        }

        return p;
    }

    // Déclaration d'une procédure
    public static void afficheNfois(String t, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(t);
        }
    }
}
