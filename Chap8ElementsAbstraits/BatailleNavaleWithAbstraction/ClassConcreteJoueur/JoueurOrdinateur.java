package Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.ClassConcreteJoueur;

import java.util.Random;

import Chap6POO.CoursPOO.Bateau;
import Chap7RelationsEntreClasses.CoursRelationEntreClasses.GrilleDeJeu;
import Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.ClassAbstract.Joueur;

public class JoueurOrdinateur extends Joueur{
    
    private static Random r = new Random();

    public JoueurOrdinateur() {
        this.nom = "Ordinateur";
    }

    @Override
    public void positionnerBateau(Bateau b) {
        int colonne, ligne;
        boolean orientHoriz;
        do {
            orientHoriz = JoueurOrdinateur.r.nextBoolean();
            if (orientHoriz) {
                ligne = JoueurOrdinateur.r.nextInt(GrilleDeJeu.HAUTEUR);
                colonne = JoueurOrdinateur.r.nextInt(GrilleDeJeu.LARGEUR - b.getLongueur() + 1);
            } else {
                ligne = JoueurOrdinateur.r.nextInt(GrilleDeJeu.HAUTEUR - b.getLongueur() + 1);
                colonne = JoueurOrdinateur.r.nextInt(GrilleDeJeu.LARGEUR);
            }
        } while (!this.ajouterBateau(ligne, colonne, orientHoriz, b));

        
    }

    @Override
    public boolean tirer() {
        this.champDeTir.afficher();
        int lat, lon;
        do {
            lat = JoueurOrdinateur.r.nextInt(GrilleDeJeu.HAUTEUR);
            lon = JoueurOrdinateur.r.nextInt(GrilleDeJeu.LARGEUR);
            
        } while (this.champDeTir.get(lat, lon) != GrilleDeJeu.INCONNU);

        System.out.println(this.nom + " tire en [" + (lat + 1) + ";" + (lon + 1) + "]");

        return this.testerTir(lat, lon);
    }

}
