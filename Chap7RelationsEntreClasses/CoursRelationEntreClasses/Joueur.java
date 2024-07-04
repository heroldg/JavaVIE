package Chap7RelationsEntreClasses.CoursRelationEntreClasses;

import Chap6POO.CoursPOO.Bateau;

public class Joueur {
    private String nom;
    private GrilleDeJeu champDeTir = new GrilleDeJeu();
    private Bateau[] bateaux = new Bateau[5];
    private int nbBateaux = 0;
    private int nbBateauxCoules = 0;
    private Joueur adversaire;
    
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

    // public void positionnerBateau(Bateau b) {
    //     int colonne, ligne;
    //     boolean orientHoriz;
    //     do {
    //         orientHoriz = Outils.choix("Quelle orientation souhaitez-vous pour le " + b.getType() + " ?", orientations) == 1;

    //         if (orientHoriz) {
                
    //             ligne = Outils.saisirEntreBornes("ligne ?", 1, GrilleDeJeu.HAUTEUR);
    //             colonne = Outils.saisirEntreBornes("colonne ?", b.getLongueur(), GrilleDeJeu.LARGEUR) - 1;
    //         } else {
                
    //         }
    //     } while (condition);
    // }
}