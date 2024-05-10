package Chap2Boucles.BoucleFor;

public class TableDeMultiplication {
    // Affiche la table de multiblication de 7
    public static void main(String[] args) {
        final int TABLE = 7;
        System.out.println("Table de " + TABLE);
        for(int m = 0; m <= 10; m++) {
            System.out.println((m + " x" + TABLE + " = " + m * TABLE));
        }
    }
}
