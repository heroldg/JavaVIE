package Chap2Boucles.BoucleFor.ExercicesBoucles.RepliqueDeFilms;

import java.util.Scanner;

public class RepliqueDeFilm {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        
        int saisie = 0;
        
        System.out.print("1 - Une réplique de la cité de la peur \n2 - Une réplique de James Bond \n3 - Une réplique de la vie est un long fleuve tranquille \n4 - Une réplique de Star Wars \n5 - Quitter cette magnique application \n ");
        while (saisie != 5) {
            
            saisie = console.nextInt();
            switch (saisie) {
                case 1:
                System.out.println("Attention, c'est une véritable boucherie !");                
                    break;
                case 2:
                System.out.println("Les choses sont rares, précieuses et souvent très, très dangereuses.");                
                    break;
            
                case 3:
                System.out.println("Dans la rivière de la vie, les courants tranquilles cachent souvent les plus grandes surprises.");                
                    break;
                case 4:
                System.out.println("'Que la Force soit avec toi.'  - Maître Yoda");                
                break;
                
                default:
                break;
            }
        }
        
        
        System.out.println("Au revoir !");
        
        console.close();

    }
}
