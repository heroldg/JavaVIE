package Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.ExoBatailleDeDes;


public class LaBatailleDeDes {

  
    private static JoueurBataille j1 = new JoueurBataille();
    private static JoueurBataille j2 = new JoueurBataille();
    private static boolean fin;
    private static int score1, score2;
  
    public static void main(String[] args) {
     do {
        score1 = j1.tourDeJeu();
        score2 = j2.tourDeJeu();

        if (score1 > score2) {
        
            System.out.println(j1.getNom() + " remporté");
            System.out.println();
            j1.gagnerUnjeton();
            fin = j2.perteUnJeton();
            
        } else if (score1 < score2) {
            
            System.out.println(j2.getNom() + " remporté ");
            System.out.println();
            j2.gagnerUnjeton();
            fin = j1.perteUnJeton();
        
        } else {
        
            System.out.println("Égalité");
            System.out.println();
            fin = false;
        }

        System.out.println("Score " + j2.getNom() + ": " + j2.getNbJetons());
        System.out.println("Score " + j1.getNom() + ": " + j1.getNbJetons());
        System.out.println("-----------------------------");

     } while (!fin);

     if (j1.getNbJetons() == 0) {
        System.out.println(j2.getNom() + " gagne !");
     } else {
        System.out.println(j1.getNom() + " gagné !");
     }
        
    } 
    
}
 