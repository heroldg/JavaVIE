package Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.ClassEnfantCycle.CyclesElectique;

public class Gyropodes extends CycleElectrique {

    private int tailleMinimCM;

    public Gyropodes(String marque, String modele,String dateDachat, int tarifCycle, int autonomieKM, int tailleMinimCm) {
        super(marque, modele, dateDachat, autonomieKM);
        this.tarifCycle = 29.90;
        this.tailleMinimCM = tailleMinimCm;
    }

    public int getTailleMinimCm() {
        return this.tailleMinimCM;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " [" + this.tailleMinimCM + "cm minimum] " + this.tarifCycle + "/heure" ;
    }

    


}
