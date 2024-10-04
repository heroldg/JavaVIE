package Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.ClassEnfantCycle.CyclesElectique;

public class Gyroroues extends CycleElectrique {

    public Gyroroues(String marque, String modele,String dateDachat, int tarifCycle, int autonomieKM) {
        super(marque, modele, dateDachat, autonomieKM);
        this.tarifCycle = 18.90;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.tarifCycle + "/heure" ;
    }

}
