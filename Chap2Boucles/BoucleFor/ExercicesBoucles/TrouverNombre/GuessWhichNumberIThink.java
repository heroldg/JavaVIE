package Chap2Boucles.BoucleFor.ExercicesBoucles.TrouverNombre;

import java.util.Random;
import java.util.Scanner;

public class GuessWhichNumberIThink {
    // Votre algo doit tirer un nombre aléatoire compris entre 1 et 100. L'utilisateur doit trouver ce nombre; Pour cela, à chaque tentative de l'utilisateur, un indice lui est donné pour lui indiquer si le nombre est plus grand, plus petit ou égal à la valeur essayée. Le programme se termine lorsque l'utilisateur a trouvé le nombre. 
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int nbOrdi;
        int nbUtilisateur = 0;

        Random random = new Random();
        nbOrdi = random.nextInt(100) + 1;
        System.out.println("À quelle nombre entre 1 et 100 je pense ?");

        
        
        while (nbOrdi != nbUtilisateur) {   
            nbUtilisateur = console.nextInt();
            if (nbOrdi > nbUtilisateur) {
                System.out.println("C'est plus !");
            } else if (nbOrdi < nbUtilisateur) {
                
                System.out.println("c'est moins !");
            }

        }
        System.out.println("Bravo ! Vous avez trouvé");
        
        console.close();
        
    }     
}
