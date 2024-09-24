package Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.ExoBatailleDeDes;

import java.util.Scanner;

import Chap6POO.ExercicePOO.LesDes;

public class JoueurBataille {
    Scanner console = new Scanner(System.in);
    private int nbJetons;
    private LesDes de;
    protected String nom;

    JoueurBataille() {
        System.out.println("Nom du joueur ?");
        this.nom = console.nextLine();

        this.nbJetons = 10;
        this.de = new LesDes();
    }

    public int tourDeJeu() {
        this.de.lancementDes();
        System.out.println(this.nom + " a fait un " + this.de.getLastGameNumber());

        return this.de.getLastGameNumber();
    }

    public boolean perteUnJeton(){
        this.nbJetons = this.nbJetons - 1;
        return this.nbJetons == 0;

    }

    public boolean gagnerUnjeton() {
        this.nbJetons = this.nbJetons + 1;
        return this.nbJetons == 0;
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbJetons() {
        return this.nbJetons;
    }

}
 