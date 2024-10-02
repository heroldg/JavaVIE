package Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients;

public class Livre extends Oeuvres {

    private int nbpages;


    public Livre(String titre, String auteur, int nbpages) {
        super(auteur, titre);
        this.nbpages = nbpages;
    } 

    public int getPages() {
        return this.nbpages;
    }

    @Override
    public String getInfo() {
        return "Livre " + super.getInfo() + " (" + this.nbpages + ") pages";
    }

    
}
