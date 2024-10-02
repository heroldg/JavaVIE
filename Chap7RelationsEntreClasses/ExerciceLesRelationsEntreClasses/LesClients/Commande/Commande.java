package Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients.Commande;

import java.util.Scanner;

import Chap6POO.ExercicePOO.LesClients;
import Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients.Livre;
import Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients.Oeuvres;
import Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients.Video;
import Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients.Clients.Clientele;

public class Commande {

    public static final int MAX_COMMANDES = 10000;
    private static final int MAX_CLIENT = 2000;
    
    private static final int QUITTER = 6;
    
    private static int nbCommandes = 0;
    private static int nbClient = 0;
    private static int nbOeuvre = 0;

    private static int saisie, nbPages, minutesVideo;
    private static String nom, titre, auteur;
    
    Oeuvres[] oeuvresCommande = new Oeuvres[MAX_COMMANDES];
    protected int nbOeuvres = 0;
    
    Clientele clientele;
    
    Commande[] tabCommandes = new Commande[MAX_COMMANDES];
    
    // Constructeur
    Commande(Clientele clientele) {
        this.clientele = clientele;
    }
    
    // Méthode pour ajouter une œuvre à la commande
    public void ajouter(Oeuvres oeuvre) {
        if (this.nbOeuvres < MAX_COMMANDES) {
            // Vérifie si la limite est atteinte
            this.oeuvresCommande[this.nbOeuvres] = oeuvre;
            this.nbOeuvres++;
        } else {
            System.out.println("Impossible d'ajouter plus d'œuvres. Limite atteinte !");
        }
    }
    
    // Méthode pour obtenir les informations de la commande
    public String getInfo() {
        StringBuilder ret = new StringBuilder(
            "Commande de " + this.clientele.getNom() + ":\n"
            );
            
            for (int i = 0; i < nbOeuvres; i++) {
                ret.append("- ").append(this.oeuvresCommande[i].getInfo()).append("\n");
            }
            
            return ret.toString(); // Retoune toutes les infos concaténées
        }
        
        public static void main(String[] args) {
            Clientele[] tabClienteles = new Clientele[MAX_CLIENT];
            Oeuvres[] tabOeuvres = new Oeuvres[Oeuvres.MAX_OEUVRES];
            Commande[] tabCommandes = new Commande[MAX_COMMANDES];
            Commande clientCommande = new Commande(null);


            Scanner console = new Scanner(System.in);
            
            do {
                LesClients.afficherLeMenu();
                saisie = console.nextInt();
                console.nextLine();

                switch (saisie) {
                    case 1:
                        System.out.println("--------CLIENTS---------");
                        for (int i = 0; i < nbClient; i++) {
                            System.out.println(tabClienteles[i].getInfo());
                        }
                            
                        break;
                    case 2:
                        System.out.println("Nom ?");
                        nom = console.nextLine();
                        tabClienteles[nbClient] = new Clientele(nom);
                        System.out.println(tabClienteles[nbClient].getInfo() + " ajouté");
                        nbClient++;
                        break;

                        case 3:
                        System.out.println("Type ?");
                        System.out.println("1 - Livre");
                        System.out.println("2 - Vidéo");
                        saisie = console.nextInt();
                        console.nextLine();  // Vider la ligne
                    
                        System.out.println("Titre ?");
                        titre = console.nextLine();
                        
                        System.out.println("Auteur ?");
                        auteur = console.nextLine();
                    
                        if (saisie == 1) {  // Livre
                            System.out.println("Nombre de pages ?");
                            nbPages = console.nextInt();
                            console.nextLine();  // Vider la ligne
                            tabOeuvres[nbOeuvre] = new Livre(titre, auteur, nbPages);
                        } else if (saisie == 2) {  // Vidéo
                            System.out.println("Durée (minutes) ?");
                            minutesVideo = console.nextInt();
                            console.nextLine();  // Vider la ligne
                            tabOeuvres[nbOeuvre] = new Video(titre, auteur, minutesVideo);
                        }
                    
                        System.out.println(tabOeuvres[nbOeuvre].getInfo() + " ajouté");
                        nbOeuvre++;
                        break;
                    case 4:

                        System.out.println("Pour quel client ?");
                        for (int i = 0; i < nbClient; i++) {
                            System.out.println(i + 1 +  " - " + tabClienteles[i].getNom());
                        }

                        saisie = console.nextInt() - 1;
                        console.nextLine();
                        clientCommande = new Commande(tabClienteles[saisie]);

                        while (saisie != nbOeuvre) {
                            System.out.println("Quelle oeuvre ajouter à la commande ?");
                            for (int i = 0; i < nbOeuvre; i++) {
                                System.out.println(i + 1 + " - " + tabOeuvres[i].getInfo());
                                
                            }

                            System.out.println(nbOeuvre + 1 + " - Terminer commande");
                            saisie = console.nextInt() - 1;
                            console.nextLine();
                            if (0 <= saisie & saisie < nbOeuvre) {
                                clientCommande.ajouter(tabOeuvres[saisie]);
                            }
                        }

                        tabCommandes[nbCommandes] = clientCommande;
                        nbCommandes++;

                        break;
                    
                    case 5:
                        
                        System.out.println("-------Commandes--------");
                        for (int i = 0; i < nbCommandes; i++) {
                            System.out.println(" * " + tabCommandes[i].getInfo());
                        }

                        break;

                    default:
                        break;
                }
        } while (saisie != QUITTER);
        
        console.close();
        

    }

    
}
