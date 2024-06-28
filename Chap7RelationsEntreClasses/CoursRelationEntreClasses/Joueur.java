package Chap7RelationsEntreClasses.CoursRelationEntreClasses;

import Chap6POO.CoursPOO.Bateau;
import Chap6POO.ExercicePOO.MicroBatailleNavaleV4.Grille;


public class Joueur {
    private int nom;
    private Grille champsDeTir = new Grille();
    private Bateau[] bateaux[] = new Bateau[5][];
    private int nbBateaux = 0;
    private int nbBateauxCoules = 0;
    private Joueur adversaire;
    
}
