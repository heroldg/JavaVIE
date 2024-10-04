package Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.ClassEnfantCycle;

import Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.Cycles;

public class Velo  extends Cycles{
    private  int nbVitesses;

    public Velo(String marque, String modele, int jour, int mois, int annee, int nbVitesses) {
        super(marque, modele,  jour, mois, annee);
        this.tarifCycle = 4.90;
        this.nbVitesses = nbVitesses;
    }

    public int getNbVitesses(){
        return this.nbVitesses;
    }

    @Override
    public String getInfo() {
        return "- Vélo " +super.getInfo() + " " + this.nbVitesses + " vitesses " + this.tarifCycle + " euros/heure";
    }

}
