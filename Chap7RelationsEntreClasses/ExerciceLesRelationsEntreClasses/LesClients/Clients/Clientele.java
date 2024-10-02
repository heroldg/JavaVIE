package Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients.Clients;

public class Clientele {
    private String nom;
    private int numClient;
    private static int nbClients = 0; // Variable statique 

    public Clientele(String nom) {
        this.nom = nom;
        nbClients++; // Incrémentation du nombre de clienrts pour chaque nouveau clients créée
        this.numClient = Clientele.nbClients;

    }

    public String getInfo() {
        return "Client n°" + this.numClient + " [" + this.nom + "]";
    }

    public String getNom() {
        return this.nom;
    }

    public static int getNbClients() {
        return nbClients; // Retourne le nombre total de clients
    }

    


}
