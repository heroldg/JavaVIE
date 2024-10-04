package Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.ClassEnfantCycle;

import Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.Cycles;

public class Velo  extends Cycles{
    private  int nbVitesses;

    public Velo(String marque, String modele,String dateDachat, int nbVitesses) {
        super(marque, modele, dateDachat);
        this.tarifCycle = 4.90;
        this.nbVitesses = nbVitesses;
    }

    public int getNbVitesses(){
        return this.nbVitesses;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.nbVitesses + " vitesses" + this.tarifCycle + "/heure";
    }

}
