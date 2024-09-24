package Chap7RelationsEntreClasses.CorrectionRelationEntreClasses;

public class LivreCorrection extends OeuvreCorrection {
    int nbPages;

    LivreCorrection(String titre, String auteur, int nbPages) {
        super(titre, auteur);
        this.nbPages = nbPages;
    }

    public int getNbPages() {
        return nbPages;
    }

    @Override

    public String getInfo() {
        return "Livre" + super.getInfo() + " ( " + this.nbPages + " pages)";
    }

}
