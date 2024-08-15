## Les relations entre les classes

## 1 . Présentation

Dans le chapitre précédent, les classes créées n'ont aucune relation avec d'autres. Ce chapitre présente comment les classes peuvent être mises en relation les unes avec les autres. Il existe trois type de relations entre deux classes:

- Tout d'abord, il y a l'_utilisation_ d'une classe par une autre
- Ensuite , il y a l'_association_ d'une classe avec une autre
- Enfin, il y a l'_héritage_ d'une classe par une autre.

## 2. L'UTILISATION d'une classe par une autre

Une classe utilise une autre classe dans différentes situations;

- lorsque la première posséde une méthode prenant en paramètre une instance de l'autre;

- lorsqu'une des méthodes de la première retourne une instance de la seconde

- lorsque la première fait appel à une méthode, à une constante ou à un constructeur de la seconde

En résumé, dès que le nom d'une classe apparaît dans une autre classe, cette dernière utilise la première.

## 3. Les ASSOCIATION

L'association d'une classe vis-à-vis d'une autre est une relation plus forte que la simple utilisation. Non seulement la classe utilise l'autre classe, mais elle stocké également une ou plusieurs instances de celle-ci au sein d'une ou plusieurs de ses attributs.

Dans le chapitre précedent, des variables de type également des classes ayant des attributs de type entier, réel, booléen, caractère ou texte, ou bien encore un tableau contenant des valeurs de l'un de ces types. Dans ce paragraphe est présentéé la création d'attributs de type d'une classe ou d'un tableau contenant des instances de classe: cela correspondant à la déclaration d'une association.

L'exemple suivant illustre ce concept d'association:

Dans la classe **Joueur**, il y a six attributs. Trois d'entre eux utilisent des types qui ne sont pas des classes( un de type texte: _private String nom;_,et deux de type entier: _private int nbBateaux = 0;private int nbBateauxCoules = 0;_). Les trois qui ne sont pas classes (un de type texte et deux de type entier)/ Les trois autres attributs ont pour type de classes, ce sont donc trois associations.

Tout d'abord, l'attribut **champDeTir** est de type Grille. À une instance de **Joueur** est donc associé une instance de **GrilleDeJeu**, c'est-à-dire la zone dans laquelle il va effectuer ses tirs avec pour objectif de couler les bateaux de son adversaire. Cette association ne va que dans un seul sens: une instance de son adversaire. Cette association ne va que dnas un seul sens: une instance de **Joueur** connaît sa grille de jeu grâce a cet attribut, mais par contre, la grille de jeu ne sait pas à quel joueur elle est associée. Cette association est dite **navigable** dans un seul sens (c'est bien le terme officiel, ce n'est pas pour rester dans la thématique de la bataille navale..). C'est donc une association **unidiretionnelle** .

Ensuite, l'attribut **bateaux** est un tableau dont les éléments sont des instances de la classe **Bateau**. Avec un attribut de type tableau, il est ainsi possible d'associer à une instance un ensemble d'instances. De cette manière chaque instance de **Joueur** est associés avec l'ensemble de ses bateaux. À nouveau, cette association est unidirectionnelle puisque le joueur accède à ses bateaux, mais ceux-ci ne connaissent pas leur propriétaire.

Enfin, l'attribut _adversaire_ est de type _Joueur_. C'est-à-dire qu'à une instance de Joueur est associé une autre instance de _Joueur_. Dans cet exemple, cela permet d'associer à un joueur un autre joueur: celui qui sera son adversaire. Ce type d'association est dire **réflexive**.

Une association peut être bidirectionnelle, c'est-à-dire navigable dans les deux sens. Pour effectuer cela, il faut réaliser deux associations unindirectionnelles, une pour naviguer dans chaque sens. Par exemple,, si la grille de jeu a également besoin de connaître le joueur auquel elle appartien, il est alors nécessaire de rajouter un attribut de type _Joueur_ au sein de la classe **GrilleDeJeu**.

La difficulté avec les associations bidirectionnelle est que l'information obtenue en navigant l'association dans un sens doit être acceptable si celle-ci est naviguée dans l'autre sens. Par exemple, si une instance de _Joueur_ est associéd à une instance de _GrilleDeJeu_, il faut que cette instance soit associée à la même instance de **Joueur**. Si celle-ci est associée à une autre instance de _Joueur_, il y a une incohérnce. Cela doit être évité à tout prix. C'est pourquoi, lorsque cela n'est pas absolument nécessaire, seules des association unidirectionnelles sont utilisées.

Une fois ces attributs déclarés définissant les associations à mettre en place , la classse peut être définie comme précedemment. Exemple:
