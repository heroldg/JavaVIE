package Chap7RelationsEntreClasses.CorrectionRelationEntreClasses;

public class CLIENTS {
    private String nom;
    private int numClient;
    private static int nbClients = 0;  // Variable statique pour suivre le nombre de clients

    public CLIENTS(String nom) {
        this.nom = nom;
        nbClients++;  // Incrémentation du nombre de clients chaque fois qu'un nouveau client est créé
        this.numClient = CLIENTS.nbClients;
    }

    public String getInfo() {
        return "Client n°" + this.numClient + " [" + this.nom + "]";
    }

    public String getNom() {
        return this.nom;
    }

    public static int getNbClients() {
        return nbClients;  // Retourne le nombre total de clients
    }
}