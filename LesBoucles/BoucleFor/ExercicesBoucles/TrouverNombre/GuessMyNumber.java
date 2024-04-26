package LesBoucles.BoucleFor.ExercicesBoucles.TrouverNombre;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    // Cette fois-ci, c'est l'ordinateur qui doit deviner un nombre choisi pr l'utilisateur. L'utilisateur lui indique si le nombre est plus grand(+), plus petit(-) ou s'il à trouvé le nombre (=)
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int nbOrdinateur = 0;
        char findItOrNot = '1';
        Random random = new Random();
        int nbTentative = 0;
        int max = 100;
        int min = 1;
        System.out.println("Choisissez un nombre compris entre 1 et 100, puis appuyez une une touche pour commencer:");

        console.next().charAt(0);

        while (findItOrNot != '=') {
           
            nbOrdinateur = random.nextInt(max - min + 1) + min;
            System.out.printf("Je tente %d, est-ce plus, moins ou est-ce le nombre (+/-+=) ? \n", nbOrdinateur);
            findItOrNot = console.next().charAt(0);
            nbTentative++;
            if (findItOrNot == '-') {
                max = nbOrdinateur;
            }
            if (findItOrNot == '+') {
                min = nbOrdinateur;
                
            }
         
        }

        System.out.printf("Super ! c'est donc %d, j'ai trouvé en %d tentatives.", nbOrdinateur, nbTentative);
        console.close();


    }
}
