package Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle;


import Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.OutilsCycles.OutilsCycles;

public abstract class Cycles {
    protected String marque;
    protected String modele;
    protected String dateDachat;
    protected Double tarifCycle;

    protected int jour;
    protected int mois;
    protected int annee;

    protected int nbCycles = 0;

    // Constructeur mais pas sûr de sa construction ...
    public Cycles(String marque, String modele, int jour, int mois, int annee  ) {
        this.marque = marque;
        this.modele = modele;
        // LA MANIĒRE DE FAIRE POUR DATEdACAHAT NE FONCTIONNE PAS !!
        this.dateDachat = OutilsCycles.dateWriteString( jour, mois, annee);
        this.nbCycles++;
    }



    // Getters
    public String getMarque() {

        return this.marque;
    }

    public int getBnCycles() {
        return this.nbCycles;
    }


    public String getModele() {
        return this.modele;
    }

    public String getDateDachat() {
        

        return this.dateDachat;
    }

    public Double getTarifCycle() {
        return this.tarifCycle;
    }

   public String getInfo() {
    return this.marque+ " " + this.modele  + " | " + this.dateDachat + " | ";
   }


    





}
