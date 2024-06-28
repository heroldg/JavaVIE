package Chap6POO.ExercicePOO.MicroBatailleNavaleV4;

public class Grille {
    public static final int HAUTEUR = 4;
    public static final int LARGEUR = 4;
    public static final char PLOUF = '~';
    public static final char BATEAU = 'b';
    public static final char EAU = 'e';
    public static final char EPAVE = 'x';
    
    private char[][] plateau = new char[HAUTEUR][LARGEUR];

    public Grille() {
        int i , j;
        for ( j = 0; j < plateau.length; j++) {
            for ( i = 0; i < plateau.length; i++) {
                this.plateau[j][i] = EAU;
            }
        }
    }

    public void deposerBateau(int x, int y) {
        this.plateau[y][x] = BATEAU;
    }

    public boolean tirer(int x , int y) {
        if(this.plateau[y - 1][y - 1] == BATEAU) {
            this.plateau[y - 1][x - 1] = EPAVE;
            return true;
        } else 
        this.plateau[y - 1][x - 1] = PLOUF;
        return false;

    }

    public void afficher() {
        for (int j = 0; j < plateau.length; j++) {
            for (int i = 0; i < plateau.length; i++) {
                if (this.plateau[j][i] == BATEAU || this.plateau[j][i] == EAU ) {
                    System.out.print("?");
                }
                
                else {
                    System.out.print(this.plateau[j][i]);
                }
            }
            System.out.println();

        }
    }
}
