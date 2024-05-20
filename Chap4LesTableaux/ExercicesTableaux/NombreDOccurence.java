package Chap4LesTableaux.ExercicesTableaux;

import java.util.Scanner;

public class NombreDOccurence {
    public static void main(String[] args) {
        final int NumeroDeLOccurence = 10;
        final int NbDOccurence = 2;
        int saisie = 10;
        int[][] tabOccurence = new int[NumeroDeLOccurence][NbDOccurence];
        Scanner console = new Scanner(System.in);

        System.out.println("Entrer une valeur comprise entre 0 et 9 ou -1 pour finir..");


        for (int i = 0; i < NumeroDeLOccurence; i++) {
            tabOccurence[i][0] = i;
            tabOccurence[i][1] = 0;
        }

        do {
            saisie = console.nextInt();
            for (int i = 0; i < NumeroDeLOccurence; i++) {
                if (saisie == tabOccurence[i][0] ) {
             
                    tabOccurence[i][1] = tabOccurence[i][1] + 1;
                        System.out.println("saisie: " + saisie + "| numeroOccurence " + tabOccurence[i][0] + "| nbOccurence : " +tabOccurence[i][1]) ;

                    }
                    
            }
            System.out.println("Autre valeur, svp ou -1 pour finir...");
            
        } while (saisie != -1);


        for (int i = 0; i < NumeroDeLOccurence; i++) {
                System.out.println("Nombre de " + tabOccurence[i][0] + " : " + tabOccurence[i][1] );                
        }

        console.close();




    }
}
