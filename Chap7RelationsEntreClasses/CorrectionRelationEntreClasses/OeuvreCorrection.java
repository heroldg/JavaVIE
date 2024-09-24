package Chap7RelationsEntreClasses.CorrectionRelationEntreClasses;

public class OeuvreCorrection {
    String titre;
    String auteur;

    OeuvreCorrection(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public String getTitre() {
        return this.titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public String getInfo() {
        return this.titre + " de " + this.auteur;
    }

    
}
