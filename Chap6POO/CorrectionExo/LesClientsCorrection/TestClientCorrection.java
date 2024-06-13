package Chap6POO.CorrectionExo.LesClientsCorrection;

import java.util.Scanner;

public class TestClientCorrection {
    public static final int QUITTER = 3;
    public static int i , nb , saisie;
    public static String nom;
    
    public static final int MAX_CLIENT = 100;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        LesClientsCorrection[] clients = new LesClientsCorrection[MAX_CLIENT];
        do {
            LesClientsCorrection.afficherLeMenu();
            saisie = console.nextInt();
            nb = LesClientsCorrection.getNbClients();

            switch (saisie) {
                case 1:
                    System.out.println("--Clients--");
                    for (int i = 0; i < nb; i++) {
                        System.out.println(clients[i].getInfo());
                    }
                    break;
            
                case 2:
                    System.out.println("Nom ?");
                    console.nextLine();
                    nom = console.nextLine();
                    clients[nb] = new LesClientsCorrection(nom);

                    System.out.println(clients[nb].getInfo() + " ajouté");
                    
                    break;
            
            
                default:
                    break;
            }
        } while (saisie != QUITTER);

        console.close();
    }
}
