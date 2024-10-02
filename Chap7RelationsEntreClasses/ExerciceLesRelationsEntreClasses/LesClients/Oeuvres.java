package Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients;


public class Oeuvres {
    public static final int MAX_OEUVRES = 100_000_000;
    protected String titre;
    protected String auteur;

    Oeuvres(String titre, String auteur) {
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
