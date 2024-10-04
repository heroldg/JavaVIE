package Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle;

import Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.OutilsCycles.OutilsCycles;

public abstract class Cycles {
    protected String marque;
    protected String modele;
    protected String dateDachat;
    protected Double tarifCycle;

    protected int nbCycles;

    // Constructeur mais pas sûr de sa construction ...
    public Cycles(String marque, String modele, String dateDachat) {
        this.marque = marque;
        this.modele = modele;
        // LA MANIĒRE DE FAIRE POUR DATEdACAHAT NE FONCTIONNE PAS !!
        this.dateDachat = this.getDateDachat();
        this.nbCycles++;
    }


    // Getters
    public String getMarque() {

        return this.marque;
    }

    public String getModele() {
        return this.modele;
    }

    public String getDateDachat() {
        
        this.dateDachat = OutilsCycles.dateCycles("Écrivez la date d'achat de votre " + this.modele);

        return this.dateDachat;
    }

    public Double getTarifCycle() {
        return this.tarifCycle;
    }

   public String getInfo() {
    return this.modele + " " + this.marque + "| " + this.dateDachat + " | ";
   }


    





}
