package Chap4LesTableaux.CoursTableau;

import java.util.Scanner;

public class ListeDeCourse {
    public static void main(String[] args) {
        final String QUITTER = "q";
        final int MAX = 100;
        Scanner console = new Scanner(System.in);
        String[] aACHETER = new String[MAX];
        int nbArticles = 0;
        String saisie;
        
        do {
            System.out.println("Indiquez l'article à mettre sur votre liste de courses ou saisissez " + QUITTER + " pour terminer la saisie");
            saisie = console.nextLine();
            if (!saisie.equals(QUITTER)) {
                aACHETER[nbArticles] = saisie;
                nbArticles++;
            }
        } while (!saisie.equals(QUITTER) && nbArticles < MAX);
        if (nbArticles == MAX) {
            System.out.println("La liste débords.. Allez déja acheter:");
        } else {
            System.out.println("Liste de courses :");

        }
        for (int i = 0; i < nbArticles; i++) {
            System.out.println("- " + aACHETER[i]);
        }
        console.close();
    }
}
