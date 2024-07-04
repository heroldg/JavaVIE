package Chap7RelationsEntreClasses.CoursRelationEntreClasses;

import Chap6POO.CoursPOO.Bateau;

public class GrilleDeJeu {
    public static final int BOOM = 2;
    public static final int INCONNU = 3;
    public static final int PLOUF = 4;
    public static final int LARGEUR = 10;
    public static final int HAUTEUR = 10;


    private int[][] plateauDeJeu;

    public GrilleDeJeu() {
        this.plateauDeJeu = new int[HAUTEUR][LARGEUR];
        for (int j = 0; j < plateauDeJeu.length; j++) {
            for (int i = 0; i < plateauDeJeu.length; i++) {
                this.plateauDeJeu[j][i] = INCONNU;
            }
        }
    }

    public void afficher() {
        for (int j = 0; j < HAUTEUR ; j++) {
            for (int i = 0; i <  LARGEUR; i++) {
                switch (this.plateauDeJeu[j][i]) {
                    case INCONNU:
                        System.out.print(" ?");
                        break;
                    case PLOUF:
                        System.out.print(" ~");

                    default: // bateau touché ou coulé
                        System.out.print(" " + Bateau.getSymbole());
                        break;
                }
            }

            System.out.println();
        }
    }

    public int get(int ligne, int colonne) {
        return this.plateauDeJeu[ligne][colonne];
    }

    public void set(int ligne, int colonne, int valeur) {
        this.plateauDeJeu[ligne][colonne] = valeur;
    }
}
