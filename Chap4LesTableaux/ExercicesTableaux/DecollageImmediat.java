package Chap4LesTableaux.ExercicesTableaux;


public class DecollageImmediat {
    public static void main(String[] args) {
        final int CompteARebourd = 10;
        int[][] tabEcheange = new int[1][CompteARebourd];

        for (int i = 0; i < tabEcheange.length; i++) {
            for (int j = 0; j < tabEcheange[i].length; j++) {
                tabEcheange[i][j] = CompteARebourd - j;
                System.out.println(tabEcheange[i][j]);
            }
        }


    }
}
