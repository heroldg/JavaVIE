package Chap6POO.ExercicePOO.MicroBatailleNavaleV3;

public class Grille {
    // Les constantes nécessaire
    public static final int HAUTEUR = 10;
    public static final int LARGEUR = 10;
    public static final int TOUCHE = 1;
    public static final int COULE = 2;


    // attribut de classe 
    private static final char EAU = '~';

    // Méthode de classe 
    public static void afficherReglesPositionnement() {
        System.out.println("Les bateaux doivent être possitionnés soit horizontalement , soit verticalement mais jamais en biais.");
        System.out.println("Les bateaux ne peuvent pas se superposer. Il est néamoins possible qu'ils se touchent.  ");
        System.out.println("Les bateaux doivent être positionnés intégralement dans la grille de jeu de la bataille navale");
        System.out.println("Une fois positionnés, les bateaux ne peuvent être déplacés. ");
    }
    


    // Un attribut d'instance de type tableau de 10 x 10 cases.
    char [][] tabGrilles = new char [LARGEUR][HAUTEUR];
    Grille() {
        for (int i = 0; i < LARGEUR; i++) {
            for (int j = 0; j < HAUTEUR; j++) {
                tabGrilles[i][j] = EAU;
            }
        }
    }

    // méthode d'instance deposerBateau()
    public void deposerBateau() {
        
    }

    // méthode d'instance tirer()
    public void tirer() {

    }

    // méthode d'instance afficher()
    public void afficher() {
        
    }


}
