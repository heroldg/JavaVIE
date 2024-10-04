package Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.ClassEnfantCycle.CyclesElectique;

public class Gyropodes extends CycleElectrique {

    private int tailleMinimCM;

    public Gyropodes(String marque, String modele, int jour, int mois, int annee ,  int autonomieKM, int tailleMinimCm) {
        super(marque, modele, jour, mois, annee, autonomieKM);
        this.tarifCycle = 29.90;
        this.tailleMinimCM = tailleMinimCm;
    }

    public int getTailleMinimCm() {
        return this.tailleMinimCM;
    }

    @Override
    public String getInfo() {
        return "- Gyropodes " + super.getInfo() + " [" + this.tailleMinimCM + "cm minimum] " + this.tarifCycle + " euros/heure" ;
    }

    


}
