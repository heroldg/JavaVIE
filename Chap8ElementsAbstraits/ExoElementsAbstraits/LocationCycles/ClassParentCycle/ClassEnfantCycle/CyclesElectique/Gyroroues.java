package Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.ClassEnfantCycle.CyclesElectique;

public class Gyroroues extends CycleElectrique {

    public Gyroroues(String marque, String modele, int jour, int mois, int annee ,  int autonomieKM) {
        super(marque, modele, jour, mois, annee, autonomieKM);
        this.tarifCycle = 18.90;
    }


    @Override
    public String getInfo() {
        return "- Gyroroues " + super.getInfo() + " " + this.tarifCycle + " euros/heure" ;
    }

}
