package Chap4LesTableaux.ExercicesTableaux;

import java.util.Scanner;

public class MoyenDesNotesV4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int note;
        int moyenne;
        int nbNotes = 0;
        int[][] tabMoyenne = new int[100][2];
        
        System.out.println("Notes ?");
        note = console.nextInt();
        
        int totalNote =+ note;
        tabMoyenne[0][1] = note;
        while (note !=  -1 ) {
            nbNotes++;
            
            System.out.println("Notes ?");
            note = console.nextInt();
            if (note == -1) {
                totalNote++;
            }
            for (int i = 0; i < nbNotes; i++) {
                tabMoyenne[nbNotes][0] = nbNotes;
                tabMoyenne[nbNotes][1] = note;
            }
            totalNote += note;

        }

        System.out.print("La moyenne des notes (");
        for (int i = 0; i < nbNotes; i++) {
            System.out.print(tabMoyenne[i][1] + ";");
        }

        moyenne = totalNote / nbNotes;

        System.out.print(") est la moyenne est de " + moyenne + "(" + totalNote+ " /" + nbNotes + " )");

        console.close();
    }
}
