package Chap4Condition.ExerciceCondition;

import java.util.Scanner;

public class MeteoMessage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int temperature;
        System.out.println("Quelle température fait-il ?");
        temperature = console.nextInt();

        String message;

        if (temperature < 2) {
            message = "Risque de verglas";    
        } else if(2 <= temperature && temperature < 15) {
            message = "C'est pas chaud";
        } else if (15 <= temperature && temperature < 30) {
            message = "Bonne température";
        } else {
            message = "Trop chaud";
        }

        System.out.println(message);

        console.close();
    }
}
