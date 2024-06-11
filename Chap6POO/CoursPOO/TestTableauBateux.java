package Chap6POO.CoursPOO;

public class TestTableauBateux {
    public static void main(String[] args) {
        Bateau[] flotte = new Bateau[3];
        for (int i = 0; i < flotte.length; i++) {
            flotte[0] = new Bateau("Porte-avion", 5);
            flotte[1] = new Bateau("Croiseur", 4);
            flotte[2] = new Bateau("Sous-marin", 3);
        }


        System.out.println("Dans le tableau de bateaux, il y a:");
        for (int i = 0; i < flotte.length; i++) {
            System.out.println(" - " + flotte[i].getType());
        }
    }
}
