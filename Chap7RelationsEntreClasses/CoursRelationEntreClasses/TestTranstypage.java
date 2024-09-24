package Chap7RelationsEntreClasses.CoursRelationEntreClasses;

import Chap6POO.CoursPOO.Bateau;

public class TestTranstypage {

    // Dans cet exemple, des instances de Bateaux et une instance de Porte-Conteneurs sont créées et stockées dans un tableau. Le fait de stocker une instance de PorteConteneurs dans un tableau de type Bateau entraine une opération de transtypage ascendant. La boucle itére sur les différentes cases du tableau et teste si elle contient une instance de PorteConteneurs. Si tel est le cas, l'instance est alors considérée et stockée dans une variable de son vrai type, celui utilisé pour créer l'instance. Il est ensuite possible de faire appel à la méthode getLargeur(), qui est spécifique à ce type.

    // En Java, pour tester si le transtypage descendant est possible, il faut utiliser l'opérateur instanceOf. L'opérateur de cast() permet pour sa part de réaliser le transtypage descendant. 
    
    
    public static void main(String[] args) {
        Bateau[] lesBateaux = new Bateau[5];
        lesBateaux[0] = new Bateau("porte-avions", 5);
        lesBateaux[1] = new Bateau("croiseur", 4);
        lesBateaux[2] = new PorteConteneurs(2, 5);
        lesBateaux[3] = new Bateau("contre-torpilleur", 3);
        lesBateaux[4] = new Bateau("sous-marin", 3);

        for (int i = 0; i < lesBateaux.length; i++) {
            if (lesBateaux[i] instanceof PorteConteneurs) {
                PorteConteneurs p = (PorteConteneurs) lesBateaux[i];
                System.out.println("Porte-conteneurs de taille" + p.getLargeur() + " x " + p.getLongueur());
            } else {
                System.out.println(lesBateaux[i].getType() + " de longueur " + lesBateaux[i].getLongueur());
            }
        }
    }
}
