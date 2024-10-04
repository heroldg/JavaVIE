package Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.ClassEnfantCycle.CyclesElectique;

import Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.Cycles;

public class CycleElectrique extends Cycles {
    
    private int autonomieKM;


    public CycleElectrique(String marque, String modele,String dateDachat, int autonomieKM) {
        super(marque, modele, dateDachat);
        this.autonomieKM = autonomieKM;
    }

    public int getAutonomieKM() {
        return this.autonomieKM;
    }

    public String getInfo() {
        return super.getInfo() + " " + this.autonomieKM + " d'autonomie";
    }

    
}
