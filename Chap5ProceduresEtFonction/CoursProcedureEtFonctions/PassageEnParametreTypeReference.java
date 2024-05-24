package Chap5ProceduresEtFonction.CoursProcedureEtFonctions;

import java.util.Scanner;

public class PassageEnParametreTypeReference {
    public static void main(String[] args) {
        int[] tab = new int[4];
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez la valeur n°" + (i + 1));
            tab[i] = console.nextInt();
            console.nextLine();
        }

        multiReference(tab, 2);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Valeur n°"+ (i + 1) + " = " + tab[i]);
        }
        console.close();
    }

    public static void multiReference(int[] tableau, int coef) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] *= coef;
        }
    }
}
