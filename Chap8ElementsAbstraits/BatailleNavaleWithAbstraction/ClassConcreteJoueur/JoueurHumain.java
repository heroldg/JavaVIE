package Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.ClassConcreteJoueur;


import Chap6POO.CoursPOO.Bateau;
import Chap7RelationsEntreClasses.CoursRelationEntreClasses.GrilleDeJeu;
import Chap7RelationsEntreClasses.CoursRelationEntreClasses.Outils;
import Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.ClassAbstract.Joueur;

public class JoueurHumain extends Joueur {
    

    public JoueurHumain() {
        
        this.nom = Outils.saisir("Quel est votre nom ?");
        
    }   

    private static final String[] orientations = {"Vertical", "Horizontal"};

    @Override
    public void positionnerBateau(Bateau b) 
    {
        int colonne, ligne;
        boolean orientHoriz;
        do {
            orientHoriz = Outils.choix("Quelle orientation souhaitez-vous pour le " + b.getType() + " ?", orientations) == 1;
            if (orientHoriz) {
                ligne = Outils.saisirEntreBornes("Ligne ?", 1, GrilleDeJeu.HAUTEUR) - 1;
                colonne = Outils.saisirEntreBornes("Colonne de début du bateau ?", 1, GrilleDeJeu.LARGEUR - b.getLongueur() + 1) - 1;
            } else {
                ligne = Outils.saisirEntreBornes("ligne du haut du bateau ? ", 1, GrilleDeJeu.HAUTEUR - b.getLongueur() + 1) - 1;
                colonne = Outils.saisirEntreBornes("colonne ? ", 1, GrilleDeJeu.LARGEUR) - 1;
            }
        } while (!ajouterBateau(ligne, colonne, orientHoriz, b));
    }

    @Override
    public boolean tirer() {
        this.champDeTir.afficher();
        int lat = Outils.saisirEntreBornes("ligne ?", 1, GrilleDeJeu.HAUTEUR) - 1;
        int lon = Outils.saisirEntreBornes("colonnes ? ", 1, GrilleDeJeu.LARGEUR) - 1;
        return this.testerTir(lat, lon);
    }

}
