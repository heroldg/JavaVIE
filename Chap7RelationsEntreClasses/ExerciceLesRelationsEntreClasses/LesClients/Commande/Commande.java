package Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients.Commande;

import java.util.Scanner;

import Chap6POO.ExercicePOO.LesClients;
import Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients.Oeuvres;

public class Commande {

    private String auteur, titre;
    private int longueur;

    public static final int MAX_COMMANDES = 10000;

    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Commande[] tabCommandes = new Commande[MAX_COMMANDES];
        int choix = 0;
        int indexTabCommandes = 0;

        
        while (choix != 6) {
            LesClients.afficherLeMenu();
            choix = console.nextInt();
            int videoOrLivre;
            switch (choix) {
                case 3:
                System.out.println("Type ?");
                System.out.println("1 - Livre");
                System.out.println("2 - Vidéo");
                videoOrLivre = console.nextInt();
                Oeuvres oeuvres = new Oeuvres(); // Crée une instance
                oeuvres.creerOeuvres(videoOrLivre); // Utilise l'instance
                break;
            
                default:
                    break;
            }
        }
        

    }

    
}
