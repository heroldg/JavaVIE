package Chap2Boucles.BoucleFor;

public class Puissance2 {
    // Affiche les puissances de deux inférieures à 10 000
    public static void main(String[] args) {
        for (int i = 1; i < 10000; i*= 2) {
            System.out.println(i);
        }
    }
}
