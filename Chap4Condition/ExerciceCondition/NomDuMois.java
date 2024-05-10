package Chap4Condition.ExerciceCondition;

import java.util.Scanner;

public class NomDuMois {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int mois = 0;
        String message= "";

        System.out.println("Quelle mois somme nous ? (écrire le numéro du mois)");
        mois = console.nextInt();
        switch (mois) {
            case 1:
                message = "Mois de janvier";
                break;
        
            case 2:
                message = "Mois de février";
                break;
            case 3:
                message = "Mois de mars";
                break;
            case 4:
                message = "Mois de avril";
                break;
            case 5:
                message = "Mois de mai";
                break;
            case 6:
                message = "Mois de juin";
                break;
            case 7:
                message = "Mois de juillet";
                break;
            case 8:
                message = "Mois de août";
                break;
            case 9:
                message = "Mois de septembre";
                break;
            case 10:
                message = "Mois de octobre";
                break;
            case 11:
                message = "Mois de novembre";
                break;
            case 12:
                message = "Mois de décembre";
                break;
        
            default:
                break;
        }

        System.out.println(message);

        console.close();
    }

}
