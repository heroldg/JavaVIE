# Les éléments abstraits

## Les classes abstraites

Dans une classe peut être déclarée abstraite. Cela empêche de créer des instances de cette classe. Cela peut sembler surprenant d'écrire une classe si aucune instance de cette classe ne peut être créeée, pourtant ces classs peuvent petre très utiles. Il est, par exemple, possible de créer une classe regroupant tout ce qui est commun à deux classes assez semblabes pour en faire leur classe parent et ainsi éviter de dupliquer du code.

Par exemple, supposons que pour la bataille navale, deux types de joueurs puissent s'affronter: soit des joueurs humains, soit des joueurs ordinateurs. C'est deux types de joueurs auront un certains nombres d'attributs commun et de méthodes communes (ajouter un nom, un champ de tir, des bateaux) et des méthodes communes (ajouter un tester l'effet d'un tir sur sa flottile...). Il est donc judicieux de créer une classe **Joueur** contenant tous ces éléments communs et de faire hériter de celle-ci deux classes: une classe **JoueurHumain** et une autre **JoueurOrdinateur**.

Dans cet exemple, nous avons besoin de créer des instances de **JoueurHumain** et de **JoueurOrdinateur**, par contre nous ne souhaitons pas qu'il soit possible de créer d'instance de la classe **Joueur**. Celle-ci n'a été créée que pour mutualiser des éléments. Cette classe est donc déclarée abstraite.

Pour déclarer une classe abstraite, il faut utiliser le mot-clé **abstraite**:

- Classe abstraite NomDeLAClasse

En Java, le caractère abstrait d'une classe est indiqué par le mot-clé _abstract_:

- public abstract class NomDeLaCLasse {
  ...
  }

Une classe abstraite peut possèder tout ce que possède une classe concréte (c'est-à-dire non abstraite): attributs d'instance ou de la classe, constantes, méthodes d'instance ou de classe et même des constructeurs. Bien qu'il soit impossible de faire appel à ces constructeurs pour créer des instances, ces constructeurs peuvent être appelés par les constructeurs des classes héritant de celle-co.

Voici par exemple la classe abstraite [ **Joueur**: ](/Chap8ElementsAbstraits/Joueur.java)
