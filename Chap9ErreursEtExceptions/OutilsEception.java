package Chap9ErreursEtExceptions;

import java.util.Scanner;

public class OutilsEception {
    // Syntaxe try... catch
    private static Scanner s = new Scanner(System.in);

    private static int saisieEntreLesDeux(String message, int min, int max) {
        System.out.printf("%s", message );
        int val = 0;
        boolean ok;
        do {
            try {
                val = OutilsEception.s.nextInt();
                ok = val >= min && val <= max;
            } catch (Exception e) {
                ok = false;
            }
            OutilsEception.s.nextLine();
            if (!ok) {
                System.out.printf("La valeur doit être un entier compris entre %d et %d%nRessaisissez...", min, max);
            }
        } while (!ok);
        return val;
    }

    public static int str2int(String chaine) throws Exception {
        int retour = 0;
        for (int i = 0; i < chaine.length(); i++) {
            char c = chaine.charAt(i);
            retour *= 10;
            if (!Character.isDigit(c)) {

                throw new Exception("un caractère n'est pas un chiffre");
            }
            retour += c - '0';
                
            
        }
        return retour;
    } 
}
