package LesBoucles.BoucleFor.ExercicesBoucles.RepliqueDeFilms;

import java.util.Random;
import java.util.Scanner;

public class RepliquesDeFilmsV2 {
    // Reprendre l'algorithme V1 en le modifiant pour que ce ne soit pas toujours la même citation qui soit affichée, mais qu'alétoirement, il en présente une parmi plusieurs
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int saisie = 0;
        Random random = new Random();
        
        System.out.print("1 - Une réplique de la cité de la peur \n2 - Une réplique de James Bond \n3 - Une réplique de la vie est un long fleuve tranquille \n4 - Une réplique de Star Wars \n5 - Quitter cette magnique application \n ");
        while (saisie != 5) {
            
            saisie = console.nextInt();
            switch (saisie) {
                case 1:
                String[] CitationFilm1 = {"Attention, c'est une véritable boucherie !",
                                         "C'est clair... net... et précis !",   
                                         "Vous vous rendez compte, c'est affolant, on est cernés de partout !", 
                                         "Vous avez dit 'Vache' ?", "Vous aimez les films de gladiateurs ?", 
                                         "On peut savoir pourquoi vous m'appelez tout le temps 'Monsieur'? C'est 'Pierre' !"};

                int randomIndex = random.nextInt(CitationFilm1.length);
                String randomString = CitationFilm1[randomIndex];
                // Afficher le résultat
                System.out.println("L'option choisie est : " + randomString);
                break;
                case 2:
                String[] CitationFilm2 = {"The name's Bond. James Bond.", 
                "A martini. Shaken, not stirred.", 
                "I expect you to die!", "You only live twice, Mr. Bond.", 
                "The world is not enough." };
                
                randomIndex = random.nextInt(CitationFilm2.length);
                randomString = CitationFilm2[randomIndex];
                System.out.println("L'option choisie est : " + randomString);
                break;
                
                case 3:
                String[] CitationFilm3 = {"Quand on a vingt ans, on est capable de tout.",
                "La paix, la tranquillité, le désert.",
                "L’espoir fait vivre, l’attente fait mourir.",
                "Tu sais c’que c’est un raciste ? C’est quelqu’un qui a raison avant tout le monde."};
                
                randomIndex = random.nextInt(CitationFilm3.length);
                randomString = CitationFilm3[randomIndex];
                System.out.println("L'option choisie est : " + randomString);
                break;
                case 4:
                String[] CitationFilm4 = {"Que la Force soit avec toi.",
                "Je suis ton père." ,
                "Que la Force soit avec nous." ,
                "Il est une chose, et une chose seulement, qui rend les rêves impossibles à réaliser : la peur de l'échec." ,
                "Fais-le, ou ne le fais pas. Il n'y a pas d'essai." };
                randomIndex = random.nextInt(CitationFilm4.length);
                randomString = CitationFilm4[randomIndex];
                System.out.println("L'option choisie est : " + randomString);
                break;         
                
                default:
                break;
            }
        }
        
        
        System.out.println("Au revoir !");
        
        console.close();

    }
}
