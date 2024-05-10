package Chap4LesTableaux.CoursTableau;

public class TabMultidimensionnels {
    // Une question ce pose: pour créer un tableau multidimensionnels, que faire de l'ordre des cases par exemple doit-je déclarer entier[10][4] ou entier[4][10] ? Les deux façons de faire sont possibles. Dans la mémoire les valeurs ne sont pas organisées de cette manière-là. Par contre, une fois que ce choix a été effectué, il faut être cohérent. Si la PREMIERE DIMENSION correspond aux LIGNES et la seconde aux COLONNES, il faut que par la suite ce soit toujours le cas. Dans ici, c'est ce choix qui est fait

    // Variable tab2d : entier[LIGNES][COLONNES]
    public static void main(String[] args) {
        final int NB_LIGNES = 2;
        final int NB_COLONNES = 3;
        char[][] tab2d = new char[NB_LIGNES][NB_COLONNES];

        tab2d[0][0] = 'E';
        tab2d[0][1] = 'N';
        tab2d[0][2] = 'I';
        tab2d[1][0] = 'D';
        tab2d[1][1] = 'e';
        tab2d[1][2] = 'v';

        for (int j = 0; j < NB_LIGNES; j++) {
                for (int i = 0; i < NB_COLONNES; i++) {
                System.out.print(tab2d[j][i]);
            }
            System.out.println();
        }
    }
}
