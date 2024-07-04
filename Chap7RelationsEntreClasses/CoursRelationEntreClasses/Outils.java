package Chap7RelationsEntreClasses.CoursRelationEntreClasses;

import java.util.Scanner;

public class Outils {
    private static Scanner s = new Scanner(System.in);

    public static int saisirEntreBornes(String message, int min, int max) {
        System.out.printf("%s", message);
        int val = 0;
        boolean ok;
        do {
            val = Outils.s.nextInt();
            ok = val >= min && val <= max;
            if (!ok) {
                System.err.printf("La valeur doit être un entier compris entre %d et %d%nRessaisissez...", min, max);
            }
        } while (!ok );

        return val;
    }

    public static int choix(String message, String[] propositions) {
        System.out.println(message);
        int i = 1;
        int ret;
        for (String t : propositions) {
            System.out.printf("%d - %s%n", i , t);
            i++;
        }

        if (i == 2) {
            System.out.println("une seule possibilité, automatiquement retenue");
            ret = 0;

        } else {
            ret = Outils.saisirEntreBornes("choix : ", 1, i - 1) - 1;
        }

        return ret;
    }


}
