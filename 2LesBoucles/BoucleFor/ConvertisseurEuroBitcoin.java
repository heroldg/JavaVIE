package LesBoucles.BoucleFor;

import java.util.Scanner;

public class ConvertisseurEuroBitcoin {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Combien d'euros vaut 1 Bitcoin ?");
        double txConversion = console.nextDouble();
        console.nextLine();
        String encore;
        do {
            System.out.println(("Quelle somme en euros voulez-vous convertir en bitcoins ?"));
            double valeurEuros = console.nextDouble();
            console.nextLine();
            System.out.printf( "Cela représente une somme de  %.2f bitcoin(s) %n", valeurEuros / txConversion );
            System.out.println("Avez-vous encore une conversion à effectuer ? (oui/non)");
            encore = console.nextLine();
        } while(encore.equals("oui"));
        console.close();
    }
}
