package Chap6POO.CoursPOO;

public class TestBateau {
  public static void main(String[] args) {

    System.out.println("Voici les règles de positionnement des bateaux à la bataille navale");
    // Appel à une méthode de classe
    Bateau.afficherReglesPositionnement();
    // Initialisation grâce à un setters de méthode de classe
    Bateau.setSymboleTouche('#');
    System.out.println("Lorsqu'un bateau est touché, cela est indiqu par un " + Bateau.getSymbole() + " à l'emplacement du tir.");



    Bateau croiseur = new Bateau("Croiseur", 4);
    int resultatTir;

    // positionner dans le sens vertical avec pour première case (3; 7)
    croiseur.positionner(3, 7, false);


    // tir en (2;4) : normalement, le bateau n'est pas touché 
    resultatTir = croiseur.testerTir(2, 4);
    if (resultatTir == 0)    {
        System.out.println("Un tir hor du bateau ne lui a pas causé de dégâts ! tout va bien !");
    } else {
        System.out.println("Il y a un problème ! un tir hors du bateau lui a causé du dégats");
    }

    // tir en (6;7) : normalement ce tir touche le bateau
    resultatTir = croiseur.testerTir(6, 7);
    if (resultatTir == Bateau.TOUCHE) {
        System.out.println("Le bateau a bien été touché ! Tout va bien !");
    } else {
        System.out.println("Il y a un problème le bateau n'a pas été touché !");
    } 

    // tir en (5;7) : normalement ce tir touche le bateau
    resultatTir = croiseur.testerTir(5, 7);
    if (resultatTir == Bateau.TOUCHE) {
        System.out.println("Le bateau a bien touché ! Tout va bien !");
    } else {
        System.out.println("Il y a un probleme ! Le bateau n'a pas été touché");
    }

    // tir en (4;7) : normalement ce tir touche le bateau
    resultatTir = croiseur.testerTir(4, 7);
    if (resultatTir == Bateau.TOUCHE) {
        System.out.println("Le bateau a bien été touché ! Tout va bien !");
    } else {
        System.out.println("Il y a un problème ! Le bateau n'a pas été touché");
    }

    // tir en (3;7) : normalement ce tir coule le bateau
    resultatTir = croiseur.testerTir(3, 7);
    if (resultatTir == Bateau.COULE) {
        System.out.println("Le " + croiseur.getType() + " a été coulé ! Tout va bien !");
        croiseur.SetType("épave de croiseur");
        System.out.println("C'est maintenant une " + croiseur.getType());
    } else {
        System.out.println("Il y a un problème ! Le bateau n'a pas été coulé");
    }
  }
    
}
