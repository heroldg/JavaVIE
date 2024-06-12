package Chap6POO.CorrectionExo.LesClientsCorrection;

public class LesClientsCorrection {
    
    // Attribut d'instance
    private String nom;
    private int numCli;

    // attribut de classe
    private static int nbClients = 0;

    LesClientsCorrection(String nom) {
        this.nom = nom;
        LesClientsCorrection.nbClients = LesClientsCorrection.nbClients + 1;
        this.numCli = LesClientsCorrection.nbClients;
    }

    public String getInfo() {
        return "Client n°" + this.numCli + " [" + this.nom + "]";
    }

    public static void afficherLeMenu() {
        System.out.println("-- Menu --");
        System.out.println("1 - Afficher les clients");
        System.out.println("2 - Créer un clients");
        System.out.println("3 - Quitter");
    }

    public static int getNbClients() {
        return LesClientsCorrection.nbClients;
    }

}
