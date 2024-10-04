package Chap8ElementsAbstraits;

import java.util.Scanner;

import Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.BatailleNavaleAbstract;
import Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.InterfaceBN.Jouable;

public class Jeux {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choix;
        // Ajouter les nouveaux jeux
        Jouable[] jeuxDisponibles = {new BatailleNavaleAbstract() };
        do {
            System.out.println(" === Menu Principal ===");
            for (int i = 0; i < jeuxDisponibles.length; i++) {
                System.out.printf("%d - %s%n", i + 1, jeuxDisponibles[i].getNomDuJeu());

            }
            System.out.printf("%d - Quitter%n", jeuxDisponibles.length + 1);
            choix = s.nextInt() - 1;
            if (choix >= 0 && choix < jeuxDisponibles.length) {
                jeuxDisponibles[choix].jouer();
            } 
        } while (choix != jeuxDisponibles.length);
        s.close();
    }
}
