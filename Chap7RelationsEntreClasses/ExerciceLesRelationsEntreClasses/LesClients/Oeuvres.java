package Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients;

import java.util.Scanner;

import Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients.Commande.Commande;

public class Oeuvres extends Commande {
    protected String titre;
    protected String auteur;
    Livre[] tabLivres = new Livre[MAX_COMMANDES / 2];
    Video[] tabVideo = new Video[MAX_COMMANDES / 2];

    public Oeuvres () {
        
    }
    
    public void creerOeuvres(int type) {
        Scanner console = new Scanner(System.in);
        String titre,  auteur;
        int longueur;
        Oeuvres ret;
        switch (type) {
            case 1:
            System.out.println("Titre ?");
            titre = console.nextLine();
            System.out.println("Auteur ?");
            auteur = console.nextLine();
            System.out.println("Nombres de pages ?");
            longueur = console.nextInt();

            ret = new Livre(longueur, titre, auteur);
            
            System.out.println("Livre: " + ret.titre + " de  " + ret.auteur + "(" + longueur + " pages) ajouté");
            
             

            break;

            case 2:
            System.out.println("Titre ?");
            titre = console.nextLine();
            System.out.println("Auteur ?");
            auteur = console.nextLine();
            System.out.println("Durée ?");
            longueur = console.nextInt();
            
            ret = new Video(longueur, titre, auteur);
            System.out.println("Vidéo: " + ret.titre + " de " + ret.auteur +  " (" + longueur/ 60 + "h" +  (longueur % 60 < 10 ? "0" + longueur % 60 :  longueur % 60 )  + ") ajouté");
            break;



            
            default:
                break;
        }



    }

    // constructeur
    public Oeuvres(String auteur, String titre) {
        this.titre = titre;
        this.auteur = auteur;

    }

}
