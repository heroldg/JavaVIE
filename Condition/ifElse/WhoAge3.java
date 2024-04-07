package Condition.ifElse;
import java.util.Scanner;

public class WhoAge3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Quel est votre âge ?");
        int age = console.nextInt();
        if (age < 0) {
            System.out.println("Ce n'est pas possible");
            
        } else if (age >=18){
            System.out.println("Vous êtes majeur");
        } else {
            
            System.out.println("Vous êtes mineur");
        }

        console.close();
    }
}
