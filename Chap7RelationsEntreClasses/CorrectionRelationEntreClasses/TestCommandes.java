package Chap7RelationsEntreClasses.CorrectionRelationEntreClasses;

import java.util.Scanner;

public class TestCommandes {
    private static int nbOeuvres = 0;
    private static int nbCommandes = 0;
    private static int nb = 0, saisie, nbPages, duree;
    private static String nom, titre, auteur;

    
    public static void main(String[] args) {
        
        final int QUITTER = 6;
        final int MAX = 100;
        CLIENTS[] clients = new CLIENTS[MAX];
        OeuvreCorrection[] oeuvres = new OeuvreCorrection[MAX];
        CommandeCorrection[] commandes = new CommandeCorrection[MAX];
        CommandeCorrection com = new CommandeCorrection(null);
        Scanner console = new Scanner(System.in);
        do {
            System.out.println("-- Menu --");
            System.out.println("1 - Afficher les clients");
            System.out.println("2 - Créer un clients");
            System.out.println("3 - Créer une œuvre");
            System.out.println("4 - Créer une commande");
            System.out.println("5 - Afficher les commandes");
            System.out.println("6 - Quitter");
            int saisie = console.nextInt();
            console.nextLine();

            switch (saisie) {
                case 1:
                    System.out.println("-------CLIENTS-------");
                    for (int i = 0; i < nb; i++) {
                        System.out.println(clients[i].getInfo());
                    }
                    
                    break;
            
                case 2:

                        System.out.println("Nom ?");
                        nom = console.nextLine();
                        clients[nb] = new CLIENTS(nom);
                        System.out.println(clients[nb].getInfo() + " ajouté");
                        nb++;
                    break;

                case 3:
                        System.out.println("Type ?");
                        System.out.println("1 - Livre");
                        System.out.println("2 - Vidéo");
                        saisie = console.nextInt();
                        console.nextLine();
                        
                        System.out.println("Titre ?");
                        titre = console.nextLine();
                        
                        System.out.println("Auteur ?");
                        auteur = console.nextLine();

                        if (saisie == 1 ) {
                            System.out.println("Nombre de pages ?");
                            nbPages = console.nextInt();
                            console.nextLine();
                            oeuvres[nbOeuvres] = new LivreCorrection(titre, auteur, nbPages);


                        } else {
                            System.out.println("Durée (minutes) ?");
                            duree = console.nextInt();
                            console.nextLine();
                            oeuvres[nbOeuvres] = new VideoCorrection(titre, auteur, duree);
                        }

                        System.out.println(oeuvres[nbOeuvres].getInfo() + " ajouté");
                        nbOeuvres++;

                        break;
                        
                    case 4:
                        System.out.println("Pour quel client ?");
                        for (int i = 0; i < nb; i++) {
                            System.out.println(i + 1 + " - " + clients[i].getNom());
                        }


                        saisie = console.nextInt() - 1;
                        console.nextLine();
                        com = new CommandeCorrection(clients[saisie]);

                        while (saisie != nbOeuvres ) {
                            System.out.println("Quelle oeuvre ajouter à la commande ?");
                            for (int i = 0; i < nbOeuvres ; i++) {
                                System.out.println(i + 1 + " - " + oeuvres[i].getInfo());
                            }
                            System.out.println(nbOeuvres + 1 + " - Terminer commande");
                            saisie = console.nextInt() - 1;
                            console.nextLine(); 
                            if (0 <= saisie & saisie < nbOeuvres) {
                                com.ajouter(oeuvres[saisie]);
                            }
                        }

                        commandes[nbCommandes] = com;
                        nbCommandes++;

                        break;
                    
                    case 5:
                        System.out.println("------Commandes------");
                        for (int i = 0; i < nbCommandes; i++) {  // Utilisez nbCommandes au lieu de commandes.length
                            if (commandes[i] != null) {  // Vérifiez que la commande n'est pas nulle
                                System.out.println(" * " + commandes[i].getInfo());
                            }
                        }
                        break;
            
                default:
                    break;
            }
            


        } while (saisie != QUITTER);

        console.close();
    }

    

}
