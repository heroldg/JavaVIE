package Chap4Condition.ExerciceCondition;

import java.util.Scanner;

public class MeteoDegres {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int temperature;
        System.out.println("Quelle température fait-t-il ?");
        temperature = console.nextInt();
        
        String message = temperature < -2 ? "Risque de verglas" :  "Pas de risque de verglas" ;
        
        System.out.println(message);

        console.close();
    }
}
