package Chap4LesTableaux.ExercicesTableaux;

public class QueFaitIlDonc {
    public static void main(String[] args) {
        final int TAILLE = 4;
        int i,j, val = 0;
        int[][] tab2d = new int[TAILLE][TAILLE];
        for ( j = 0; j < TAILLE ; j++) {
            val = j;
            for ( i = 0; i < tab2d.length; i++) {
                tab2d[j][i] = val;
                val = val + 1;
                System.out.print(tab2d[j][i]);
            }
            System.out.println();
        }
    }
}
