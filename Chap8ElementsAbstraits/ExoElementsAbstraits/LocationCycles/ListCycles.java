package Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles;

import Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.Cycles;
import Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.ClassEnfantCycle.Velo;
import Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.ClassEnfantCycle.CyclesElectique.Gyropodes;
import Chap8ElementsAbstraits.ExoElementsAbstraits.LocationCycles.ClassParentCycle.ClassEnfantCycle.CyclesElectique.Gyroroues;

public class ListCycles {

    public static final int MAX_CYCLES = 1000;
    
    
    public static void main(String[] args) {
        Cycles[] tabCyclesALouer = new Cycles[MAX_CYCLES];
        int nbCycles = 6;


        
        tabCyclesALouer[0] = new Velo("Lapierre", "speed 400",  2, 12, 2012, 27);

        tabCyclesALouer[1] = new Velo("Btwin", "riverside 900",  23, 10, 2019, 10);

        tabCyclesALouer[2] = new Gyropodes("Segway", "Nine", 10, 10, 2023, 40, 150);    

        tabCyclesALouer[3] = new Gyropodes("Weebot", "Echo", 10, 9, 2023, 35, 160);

        tabCyclesALouer[4] = new Gyroroues("Immotion ", "v8", 23, 2, 2022, 40);
        tabCyclesALouer[5] = new Gyroroues("Segway ", "Ninebot One E+", 2, 2, 2024, 30);
        
        
        for (int i = 0; i < nbCycles; i++) {
            System.out.println(tabCyclesALouer[i].getInfo());
        }
    }

    
}
