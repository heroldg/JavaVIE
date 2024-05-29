package Chap5ProceduresEtFonction.CoursProcedureEtFonctions;

import java.util.Scanner;

public class Peint {
    public static void main(String[] args) {
        
        peindre(null, 0, 0);
        
    }
        public static void peindre(int[][] image, int l, int h) {
            Scanner console = new Scanner(System.in);
            // Saisir les coordonnées d'un pont et une nouvelle couleur puis remplace l'ancienne couleur par une nouvelle pour le point ainsi que pour les cases adjacentes
            int x, y , nouvelleCouleur, ancienneCouleur;
            System.out.println("Coordonnée x");
            x = console.nextInt();
            System.out.println("Coordonnée y");
            y = console.nextInt();
            System.out.println("Nouvelle couleur");
            nouvelleCouleur = console.nextInt();
            console.close();
            if (x >= 0 && x < 1 && y >= 0 && y < h) {
                ancienneCouleur = image[y][x];
                if (ancienneCouleur != nouvelleCouleur) {
                    // Mettre peindreRecursive() ici
                }
            }

            
            }   
            public static void peindreRecursive(int x, int y, int[][] image, int h, int l, int ancienneCouleur, int nouvelleCouleur) {
            // Remplace l'ancienne couleur par la nouvelle pour le point de coordonnées (x;y) ainsi que pour les cases adjacentes
            if (x >= 0 && x < 1 && y > 0 && y < 1) {
                if (image[y][x] == ancienneCouleur) {
                    image[y][x] = nouvelleCouleur;
                    peindreRecursive(x - 1, y, image, h, l, ancienneCouleur, nouvelleCouleur);
                    peindreRecursive(x + 1, y, image, h, l, ancienneCouleur, nouvelleCouleur);
                    peindreRecursive(x, y - 1, image, h, l, ancienneCouleur, nouvelleCouleur);
                    peindreRecursive(x, y + 1, image, h, l, ancienneCouleur, nouvelleCouleur);
                }
            }
                
                
            }

            
           
    }

    // Dans cet exemple, l'image est supposé être en nuance de gris. Elle est modélisée par un tableau à deux dimensions où, dans chaque case, est stockée la valeur en niveau de gris du pixel : zero correspond à du noir et 255 correspond à du blanc, et les valeur intermédiaires forment un dégradé de gris entre ces deux couleurs. Le principe reste le même pour une image en couleurs, mais cela ajoute une dimension supplémentaire au tableau.

    // La procédure peindre() prend en paramètres l'image ainsi que sa largeur et sa hauteur. Elle fait saisir à l'utilisateur l'emplacement où appliquer le pot de peinture et la couleur à appliquer. Après avoir vérifié que les coordonnées saisies soient correctes, la couleurs du pixel à l'emplacment indiqué est comparée à la couleur à appliquer: si c'est la même, il n'y a rien à faire ( en plus , cela créerait des appels infinis de la procédures peindreRecirsive()), sinon,  la procédure , les coordonnées du point sont testées pour savoir si elles sont bien à l'intérieur de l'image. Cette précaution est superflue pour ce premier appel, mais elle sera nécessairement pour les autres appels. Ensuite , seuls les pixels de la même couleur que celui dont les coordonnées ont été choisies doivent être repeints. À nouveau, comme il s'agit de ce pixel précisément, c'est forcément le cas, mais pour les autres appels, ce ne sera pas nécessairement le cas. Ensuite la couleur du pixel est changée avec la nouvelle couleur. Puis la procédure peindreRecursive() est appelée récursivement sur le pixel situé à gauxhe de celui-ci,  puis sur le pixel à droite, sur celui au-dessus et enfin en dessous. La nouvelle couleur de l'image ne sont pas dépassées et que la couleur du voisin est bien la même que celle du poixel auqurel a été appliqué le pot de peinture.
     