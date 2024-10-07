package Chap8ElementsAbstraits.ExoElementsAbstraits.VitesseMoyenVMultiLangue.Langue;

import java.util.Scanner;

public class CalculVitesse {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Appel de la méthode choisirLangue pour déterminer la langue choisie par l'utilisateur
            Traductions traduction = choisirLangue(scanner);
    
            // Saisie des données dans la langue choisie
            System.out.print(traduction.saisieDistance());
            double distance = scanner.nextDouble();
    
            System.out.print(traduction.saisieTemps());
            double temps = scanner.nextDouble();
    
            // Calcul de la vitesse moyenne (conversion du temps en heures)
            double tempsHeures = temps / 60;
            double vitesse = distance / tempsHeures;
    
            // Affichage du résultat dans la langue choisie
            System.out.println(traduction.debutReponse() + vitesse + traduction.finReponse());
        }
    
        // Méthode pour choisir la langue
        public static Traductions choisirLangue(Scanner scanner) {
            System.out.println("Choisissez votre langue / Choose your language / Elige tu idioma / Wählen Sie Ihre Sprache:");
            System.out.println("1. Français");
            System.out.println("2. English");
            System.out.println("3. Español");
            System.out.println("4. Deutsch");
    
            int choix = scanner.nextInt();
    
            switch (choix) {
                case 1:
                    return new TradFrancaise();
                case 2:
                    return new TradAnglaise();
                case 3:
                    return new TradEspagnole();
                case 4:
                    return new TradAllemande();
                default:
                    System.out.println("Langue non reconnue, sélection par défaut : Français.");
                    return new TradFrancaise();
            }
    }
    
}
