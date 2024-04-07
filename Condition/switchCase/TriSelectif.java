package Condition.switchCase;

import java.util.Scanner;

public class TriSelectif {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Que souhaitez-vous jeter ?");
        String dechet = console.nextLine();
        switch (dechet) {

            case "papier":
            case "carton":
            case "boîte de conserve":
            System.out.println("à recycler");
            break;
            
            case "végétaux":
            case "épluchures":
            System.out.println("à composter");
            
            break;
            
            default:
            
            System.out.println("à mettre à la poubelle");
                break;
        }

        console.close();
    }
}
