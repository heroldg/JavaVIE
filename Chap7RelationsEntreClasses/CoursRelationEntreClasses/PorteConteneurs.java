package Chap7RelationsEntreClasses.CoursRelationEntreClasses;

import Chap6POO.CoursPOO.Bateau;

public class PorteConteneurs extends Bateau {

    private int largeur;

    public PorteConteneurs(int largeur, int longueur) {
        super("porte-conteneurs", longueur);
        this.largeur = largeur;
    }

    public int getLargeur() {
        return this.largeur;
    }

    @Override
    public int getNbCasesUtilisees() {
        return super.getNbCasesUtilisees() * this.largeur;
    }

    @Override
    public boolean utilise(int latitude, int longitude) {

       return this.horizontal && this.latitude <= latitude && latitude <= this.latitude + this.largeur && this.longitude <= longitude && longitude < this.longitude + this.longueur || !this.horizontal && this.longitude <= longitude && longitude < this.longitude + this.largeur && this.latitude <= latitude && latitude < this.latitude + this.longueur;
        
    }
}
