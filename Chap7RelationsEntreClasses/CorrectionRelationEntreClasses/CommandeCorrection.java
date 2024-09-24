package Chap7RelationsEntreClasses.CorrectionRelationEntreClasses;


public class CommandeCorrection {
    final int MAX_OEUVRES = 10;
    OeuvreCorrection[] oeuvresCommandes = new OeuvreCorrection[MAX_OEUVRES];
    int nbOeuvres = 0;
    CLIENTS cli;

    // Constructeur
    CommandeCorrection(CLIENTS cli) {
        this.cli = cli;
    }

    // Méthode pour ajouter une œuvre à la commande
    public void ajouter(OeuvreCorrection o) {
        if (this.nbOeuvres < MAX_OEUVRES) {  // Vérifie si la limite est atteinte
            this.oeuvresCommandes[this.nbOeuvres] = o;
            this.nbOeuvres++;
        } else {
            System.out.println("Impossible d'ajouter plus d'œuvres. Limite atteinte !");
        }
    }

    // Méthode pour obtenir les informations de la commande
    public String getInfo() {
        StringBuilder r = new StringBuilder("Commande de " + this.cli.getNom() + " :\n"); // Utilise StringBuilder pour la performance

        for (int i = 0; i < this.nbOeuvres; i++) {
            r.append("- ").append(this.oeuvresCommandes[i].getInfo()).append("\n"); // Concatène chaque œuvre avec un saut de ligne
        }

        return r.toString();  // Retourne toutes les infos concaténées
    }
}