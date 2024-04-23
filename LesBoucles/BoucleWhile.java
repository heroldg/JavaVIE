package LesBoucles;

import java.util.Scanner;

public class BoucleWhile {
    // fait saisir l'utilisateur jusqu'a ce qu'il saisisse la bonne réponse
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // Amorce
        System.out.println("Quelle est la capitale de la France ?");
        String saisie  = console.nextLine();
        // condition 
        while (!saisie.equals("Paris")) {
            // traitement
            System.out.println("Vous vous êtes trompé(e) !");
            // relance
            System.out.println("Réessayez.. Capitale de la France ?");
            saisie = console.nextLine();
        }

        console.close();
        System.out.println("Bravo !");
    }
}
