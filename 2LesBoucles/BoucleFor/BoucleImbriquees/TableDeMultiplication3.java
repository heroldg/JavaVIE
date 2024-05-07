package LesBoucles.BoucleFor.BoucleImbriquees;

import java.util.Random;
import java.util.Scanner;

public class TableDeMultiplication3 {
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) { // Utilisation du bloc try-with-resources
            Random random = new Random();
            int a = 0, b = 0, rep = 0;
            final int NB_QUESTIONS = 10;
            for (int i = 0; i < NB_QUESTIONS; i++) {
                a = random.nextInt(11);
                b = random.nextInt(11);
                System.out.print(a + " x " + b + " = ");
                rep = console.nextInt();
                while (rep != a * b) {
                    System.out.println("C'est faux ! Réessayez...");
                    System.out.print(a + " x " + b + " = ");
                    rep = console.nextInt();
                }
                System.out.println("C'est vrai !");
            }
        } // Le scanner sera fermé automatiquement ici, même en cas d'exception
} 

}
