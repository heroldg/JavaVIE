package Chap6POO.ExercicePOO;

import java.util.Scanner;

public class LesClients {
    
    private String nom;
    private int numeroClient;
    int nbClients = 0;

    public LesClients() {
        this.nom = this.getNom();
        this.numeroClient = numeroClient + 1;
    }
    

    LesClients(String nom, int numeroClient) {
        this.nom = nom;
        this.numeroClient = numeroClient + 1;
    }

    public String getNom() {
        return this.nom;
    }

    public int getNumeroClient() {
        return this.numeroClient;
    }

    public void setNom(String nom) {
        if (nom.equals("")) {
            System.out.println("Le nom du client ne peut être vide");
        } else {
            this.nom = nom;
        }
    }

    public static void afficherLeMenu() {
        System.out.println("-- Menu --");
        System.out.println("1 - Afficher les clients");
        System.out.println("2 - Créer un clients");
        System.out.println("3 - Créer une œuvre");
        System.out.println("4 - Créer une commande");
        System.out.println("5 - Afficher les commandes");
        System.out.println("6 - Quitter");
    }



    public static final int MAXCLIENTS = 10000;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        LesClients[] tabClients = new LesClients
        [MAXCLIENTS];
        int choix = 0;
        String nomClient;
        int indexTab = 0;


        while (choix != 6   ) {
            LesClients.afficherLeMenu();
            choix = console.nextInt();
            switch (choix) {
                case 1:
                    for (int i = 0; i < indexTab; i++) {
                        System.out.println("Client n°"+tabClients[i].getNumeroClient() + " [" + tabClients[i].getNom() + "] ");
                    }
                    break;
                    
                case 2:
                System.out.println("Nom ?");

                console.nextLine();
                nomClient = console.nextLine();

                tabClients[indexTab] = new LesClients(nomClient, indexTab);
                

                System.out.println("Client n°" + tabClients[indexTab].getNumeroClient() + " [" + tabClients[indexTab].getNom() + "] ajouté | " );
                indexTab++;    
                    break;
            
                case 6:
                    
                    break;
            
                default:
                    break;
            }
        }
        console.close();
    }



}
