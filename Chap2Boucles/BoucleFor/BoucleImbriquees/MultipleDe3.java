package Chap2Boucles.BoucleFor.BoucleImbriquees;

import java.util.Scanner;

public class MultipleDe3 {
    // Écrire un programme qui fasse saisir l'utilisateur jusqu'a ce qu'il daisisse un multiple de trois.
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        
        int saisie = 0;
        int resultat = -1;
        
        System.out.println("Entrez un multiple de trois");

        while ((resultat % 3) != 0) {

            saisie = console.nextInt();
            resultat = saisie;
            System.out.println("Erreur " + resultat + " n'est pas un multiple de trois");
            
        }
        
        System.out.println("Ok : " + resultat + " est un multiple de trois");
        console.close();
    }



}
