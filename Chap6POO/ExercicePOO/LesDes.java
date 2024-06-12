package Chap6POO.ExercicePOO;

import java.util.Random;

public class LesDes {

    private int nbFacesDes;
    private int lastGameNumber;


    // Deux constructeurs
    public LesDes(int nbFacesDes) {
        this.nbFacesDes = nbFacesDes;
    }

    public LesDes() {
        this.nbFacesDes = 6;

    }

    // Getters
    public int getNbFacesDes(int nbFacesDes) {
        return this.nbFacesDes ;
    }

    public int getLastGameNumber() {
        return this.lastGameNumber;
    }

    // Setter
    public void setNbFacesDes(int nbFacesDes) {
        this.nbFacesDes = nbFacesDes;
    }

    // Méthodes d'instance
    public void lancementDes() {

        Random rand = new Random();
        this.lastGameNumber = rand.nextInt(nbFacesDes) + 1;
        
    }


    public void DesAtteint20(int resultat, int nbCoups, LesDes des) {
        resultat = des.getLastGameNumber();
        while (resultat <= 20) {
            if (resultat == 20) {
                break;
            } else {

                nbCoups++;
                des.lancementDes();
                resultat += des.getLastGameNumber();
                System.out.println("Pour le "+ nbCoups+ " coups de dé le nombre est " + des.getLastGameNumber() + " au total cela fait " + resultat);
            }
            
            
        }
    }

   
    public static void main(String[] args) {
        
        int des10faces = 10;
        int des12faces = 12;

        int resultatDes6 = 0;
        int resultatDes10 = 0;
        int resultatDes12 = 0;

        int nbCoupsDes6 = 0;

        

        System.out.println("Resultat pour les Dé de 6:");
        LesDes joueDes = new LesDes();
        joueDes.DesAtteint20(resultatDes6, nbCoupsDes6, joueDes);
        
        
        System.out.println();
        System.out.println();
        
        
        System.out.println("Resultat pour les Dé de " + des10faces + ":");
        LesDes joueLesDesDe10 = new LesDes(des10faces);
        joueLesDesDe10.DesAtteint20(resultatDes10, nbCoupsDes6, joueLesDesDe10);
        
        System.out.println();
        System.out.println();
        
        System.out.println("Resultat pour les Dé de " + des12faces + ":");
        LesDes joueLesDesDe12 = new LesDes(des12faces);
        joueLesDesDe12.DesAtteint20(resultatDes12, nbCoupsDes6, joueLesDesDe12);        
       

    }


}
