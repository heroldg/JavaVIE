package Condition.ifElse;

import java.util.Scanner;

public class WhoJava {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Quel est vôtre âge ?");
        int age =  console.nextInt();
        if (age >= 18) {
            System.out.println("Vous êtes majeur !");
            
        } else {
            System.out.println("Vous êtes mineur !");
        }
        console.close();
    }
}
