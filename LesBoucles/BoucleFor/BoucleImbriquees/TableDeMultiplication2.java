package LesBoucles.BoucleFor.BoucleImbriquees;

import java.util.Random;
import java.util.Scanner;

public class TableDeMultiplication2 {
    public static void main(String[] args) {
        try(Scanner console = new Scanner(System.in)) {

            // Il semble que le message "Resource leak: 'console' is never closed" soit dû à l'analyseur statique de code qui détecte une éventuelle fuite de ressources dans votre programme. Pour éviter cela, vous pouvez utiliser un bloc try-with-resources pour garantir que le scanner sera fermé correctement même en cas d'exception. Voici comment vous pouvez le faire dans le fichier TableDeMultiplication3.java
            Random random = new Random();
            int i, a = 0, b = 0, rep = 0;
            final int NB_QUESTIONS = 10;
            for (i = 0; i < NB_QUESTIONS; i++) {
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
        }
    }
}
