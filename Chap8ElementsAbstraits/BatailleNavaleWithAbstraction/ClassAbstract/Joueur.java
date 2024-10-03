package Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.ClassAbstract;

import Chap6POO.CoursPOO.Bateau;
import Chap7RelationsEntreClasses.CoursRelationEntreClasses.GrilleDeJeu;

public abstract class Joueur {
    protected String nom;
    protected GrilleDeJeu champDeTir = new GrilleDeJeu();
    private Bateau[] bateaux = new Bateau[5];
    private int nbBateaux = 0;
    protected int nbBateauxCoules = 0;
    private Joueur adversaire;


    public Joueur() {
        this.champDeTir = new GrilleDeJeu();
        this.nbBateaux = 0;
        this.nbBateauxCoules = 0;
    }


    // Methode abstraite
    public abstract void positionnerBateau(Bateau b);
    
    // Methode abstraite
    public abstract boolean tirer();

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

    protected boolean ajouterBateau(int ligne, int colonne, boolean orientHoriz, Bateau b) {
        boolean ok = true;
        int c = 0;
        while (ok && c < b.getLongueur()) {
            int n = 0;
            while (ok && n < this.nbBateaux) {
                if (orientHoriz) {
                    ok = !this.bateaux[n].utilise(ligne, colonne + c);
                } else {
                    ok = !this.bateaux[n].utilise(ligne + c, colonne);
                    n++;
                }
            }
            c++;
        }
        if (ok) {
            b.positionner(ligne, colonne, orientHoriz);
            this.bateaux[this.nbBateaux] = b;
            this.nbBateaux++;
        } else {
            System.out.println("Le bateau ne peut être positionné à cet emplacement, il se superpose à un autre");
        }
        return ok;
    }

    protected boolean testerTir(int ligne, int colonne) {
        boolean gagne =false;
        int resultatTir = this.champDeTir.get(ligne, colonne);
        if (resultatTir != GrilleDeJeu.INCONNU) {
            System.out.println("Vous avez déjà tiré à ette position");

        }   else {
            resultatTir = 0;
            int n = 0;
            while (resultatTir == 0 && n < this.adversaire.nbBateaux) {
                resultatTir = this.adversaire.bateaux[n].testerTir(ligne, colonne);
                n++;

            }
            if (resultatTir == 0) {
                System.out.println("Plouf !");
                this.champDeTir.set(ligne, colonne, GrilleDeJeu.BOOM);
                if (resultatTir == Bateau.COULE)  {
                    System.out.println("Coulé ! Vous avez coulé son" + this.adversaire.bateaux[n - 1].getType());
                    this.adversaire.nbBateaux++;
                    gagne = this.adversaire.nbBateaux == this.adversaire.nbBateauxCoules;
                }
            }
        }     
        return gagne;
    }



}
