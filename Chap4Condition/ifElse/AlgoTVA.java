package Chap4Condition.ifElse;

import java.util.Scanner;

public class AlgoTVA {
    // Calculer le prix TTC  d'un article 
    public static void main(String[] args) {
        double tva = 20.0 / 100;
        double prixHT;
        
        Scanner console = new Scanner(System.in);
        System.out.println("Prix de l'article ?");
        prixHT = console.nextDouble();
        console.nextLine();
        System.out.println("Ce produit bénéficié-t-il dun taux de TVA réduit ? ");
        String tvaReduite = console.nextLine();
        if (tvaReduite.equals("oui")) {
            System.out.println("Quel est le taux (%) ?");
            tva = console.nextDouble() / 100;
            console.nextLine();
        }

        System.out.printf("PRix TTC de l'article : %.2f euros%n", prixHT * (1 + tva));

        console.close();

    }
}
