package Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients;

public class Livre extends Oeuvres {

    private int pages;
    private int numeroRefLivre;


    public Livre(int pages, String titre, String auteur) {
        super(auteur, titre);
        this.pages = pages;
        numeroRefLivre = numeroRefLivre + 1;
    } 

    public int getPages() {
        return this.pages;
    }

    public int getNumeroRefLivre() {
        return this.numeroRefLivre;
    }



    
}
