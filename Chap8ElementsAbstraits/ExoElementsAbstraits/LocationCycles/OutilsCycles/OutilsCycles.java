package Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.OutilsCycles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OutilsCycles {
    private static Scanner s = new Scanner(System.in);

    public static String dateWriteString( int jour, int mois, int annee) {

        LocalDate ld2 = LocalDate.of(annee, mois, jour);  // Utiliser LocalDate au lieu de LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = ld2.format(formatter);

        return formattedDate;
    } 

    public static String dateCycles(String message) {
        System.out.println(message);
        int jour = 0;
        int mois = 0;
        int annee = 0;
        boolean ok;
        do {
            System.out.println("Jour ?");
            jour = s.nextInt();
            s.nextLine();
            System.out.println("Mois ?");
            mois = s.nextInt();
            s.nextLine();
            System.out.println("Année ? (format: XXXX)");
            annee = s.nextInt();
            while (annee < 1000) {
                System.out.println("vous n'avez pas respecté le format : XXXX, pour l'année.. Réessayez: ");
                annee = s.nextInt();
            }
            ok = jour != 0 && mois != 0 && annee != 0;
            StringBuilder retString = new StringBuilder(
                (jour < 10 ? "0" + jour : jour) + "/" + (mois < 10 ? "0" + mois : mois) + "/" + annee  
            );

            return retString.toString();

        } while (!ok); 
    }
}
