package Chap7RelationsEntreClasses.CoursRelationEntreClasses;

import Chap6POO.CoursPOO.Bateau;

public class Joueur {
    private String nom;
    private GrilleDeJeu champDeTir = new GrilleDeJeu();
    private Bateau[] bateaux = new Bateau[5];
    private int nbBateaux = 0;
    private int nbBateauxCoules = 0;
    private Joueur adversaire;

    private String[] orientations = {"Horizontal", "Vertival"};
    
    public String getNom() {
        return this.nom;
    }

    public Joueur getAdversaire() {
        return this.adversaire;

    }

    public void setAdversaire(Joueur adversaire) {
        if (adversaire != this) {
            this.adversaire = adversaire;
        }
    }

    public void positionnerBateau(Bateau b) {
        int colonne, ligne;
        boolean orientHoriz;
        // do {
            orientHoriz = Outils.choix("Quelle orientation souhaitez-vous pour le " + b.getType() + " ?", orientations) == 1;

            if (orientHoriz) {
                ligne = Outils.saisirEntreBornes("Ligne ?", 1, GrilleDeJeu.HAUTEUR) - 1;
                colonne = Outils.saisirEntreBornes("Colonne de début du bateau ?", 1, b.getLongueur() + 1) - 1;
            } else {
                ligne = Outils.saisirEntreBornes("Ligne du haut du bateau ?", 1, GrilleDeJeu.LARGEUR) - 1;
            }
        // } while()
    }
}