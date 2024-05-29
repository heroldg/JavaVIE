package Chap5ProceduresEtFonction.ExerciceProcedureEtFonction;

import java.util.Scanner;

public class LePlusGrand {
    // Écrire une fonction prenant deux valeurs réelles en paramètres et qui retourne la plus grande des deux
    // Écrire une autre fonction prenant également deux valeurs réellles en paramètres , mais qui retourne:
    // 0 si les deux valeurs sont égales;
    // 1 si c'est la première valeur qui est la plus grande
    // -1 sinon
    // Écrire un algorithme principal faisant appel à ces deux fonctions.

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double val1, val2;


        System.out.println("Entrez la première valeur");
        val1 = console.nextDouble();
        System.out.println("Entrez la seconde valeur");
        val2 = console.nextDouble();

        String resultat1 = PlusGrandeValeur(val1, val2);
        System.out.println(resultat1);
        int resultat2 = PlusGrandeVal(val1, val2);
        System.out.println("Le resultat de la comparaison : " + resultat2);
        
        console.close();
        
    }
    
    public static String PlusGrandeValeur(double val1, double val2) {
            String biggestVal;
            
            if (val1 == val2) {
                biggestVal = "Les deux valeurs sont égales";
            } if (val1 > val2) {
                biggestVal = "La première valeur " + val1 + " est plus grande que " + val2  ;
                
            } else {
                biggestVal = "La valeur seconde " + val2 + " est plus grande " + val1;
            }
            
            return biggestVal;
        }
        
        public static int PlusGrandeVal(double val1, double val2) {
            int biggestVal;
            
            if (val1 < val2) {
                biggestVal = 0;
            } else if(val1 > val2) {
                biggestVal = 1;
                
            } else {
                biggestVal = -1;
            }
            
            return biggestVal;
        }
    }
