package Condition.ternaire;

import java.util.Scanner;

public class Voyage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Combien de personnes participent au voyages ?");
        int nbPersonnes = console.nextInt();
        console.nextLine();
        System.out.println("Voulez vous prendre une assurance annulation ?");
        boolean assurance = console.nextLine().equals("oui");
        console.close();
        System.out.printf("Le voyage est réservé pour %d personne%s %s assurance annulation ", nbPersonnes, nbPersonnes > 1 ? "s": "", assurance ? "avec" : "sans" );
        console.close();
    }
}
