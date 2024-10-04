package Chap8ElementsAbstraits.BatailleNavaleWithAbstraction;


import Chap6POO.CoursPOO.Bateau;
import Chap7RelationsEntreClasses.CoursRelationEntreClasses.Outils;
import Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.ClassAbstract.Joueur;
import Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.ClassConcreteJoueur.JoueurHumain;
import Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.ClassConcreteJoueur.JoueurOrdinateur;
import Chap8ElementsAbstraits.BatailleNavaleWithAbstraction.InterfaceBN.Jouable;

public class BatailleNavaleAbstract implements Jouable{
        private Joueur[] joueurs = new Joueur[2];

        public static void main(String[] args) {
            System.out.println(" *** Bataille Navale*** ");
            BatailleNavaleAbstract bn = new BatailleNavaleAbstract();
            String[] menu = { "Afficher les régles de positionnement des bateaux", "Joueur", "Quitter"};

            int choix;
            do {
                choix = Outils.choix("Menu", menu);
                switch (choix) {
                    case 0:
                        Bateau.afficherReglesPositionnement();

                        break;
                    case 1:
                    bn.jouer();
                    break;
                    default:
                        break;
                }
            } while (choix != 2);
        }

        @Override
        public void jouer()  {
            // Création des joueurs
            String[] possibilites = {"Humain", "Ordinateur"};
            for (int i = 0; i < joueurs.length; i++) {
                int choix = Outils.choix("Quel type de joueur pour le joueur n°" + (i + 1), possibilites);
                if (choix == 0) {
                    this.joueurs[i] = new JoueurHumain();

                } else {
                    this.joueurs[i] = new JoueurOrdinateur();
                }
            }

            joueurs[0].setAdversaire(this.joueurs[1]);
            joueurs[1].setAdversaire(this.joueurs[0]);
            // Positionnement des bateaux
            for (Joueur joueurs : joueurs) {
                System.out.println("C'est à " + joueurs.getNom() + " de positionner ses bateaux");
                joueurs.positionnerBateau(Bateau.creerBateau("porte-avions", 5));
                // joueurs.positionnerBateau(Bateau.creerBateau("croiseur", 4));
                // joueurs.positionnerBateau(Bateau.creerBateau("contre-torpilleur", 3));
                // joueurs.positionnerBateau(Bateau.creerBateau("sous-marin", 3));
                // joueurs.positionnerBateau(Bateau.creerBateau("torpilleur", 2));

            }

            // début de la partie
            Joueur courant = joueurs[0];
            boolean gagne;
            do {
                System.out.println("C'est au tour de " + courant.getNom() + " de joueur");
                gagne = courant.tirer();
                if (gagne) {
                    System.out.println("C'est " + courant.getNom() + " qui gagne !");
                }
                courant = courant.getAdversaire();
            } while (!gagne);
        }

        @Override
        public String getNomDuJeu() {
            return "Bataille Navale";
        }
}
