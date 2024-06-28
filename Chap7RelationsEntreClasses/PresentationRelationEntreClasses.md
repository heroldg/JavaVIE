## Les relations entre les classes

## 1 . Présentation

Dans le chapitre précédent, les classes créées n'ont aucune relation avec d'autres. Ce chapitre présente comment les classes peuvent petre mises en relation les unes avec les autres. Il existe trois type de relations entre deux classes. Tout d'abord, il y a l'utilisation d'une classe par une autre. Ensuite , il y a l'association d'une classe avec une autre. Enfin, il y a l'héritage d'une classe par une autre.

## 2. L'utilisation d'une classe par une autre

Une classe utilise une autre classe dans différentes situations;

- lorsque la première posséde une méthode prenant en paramètre une instance de l'autre;

- lorsqu'une des méthodes de la première retourne une instance de la seconde

- lorsque la première fait appel à une méthode, à une constante ou à un constructeur de la seconde

En résumé, dès que le nom d'une classe apparaît dans une autre clase, cette dernière utilise la première.

## 3. Les associations

L'association d'une classe vis-à-vis d'une autre est une relation plus forte que la simple utilisation. Non seulement la classe utilise l'autre classe, mais elle stocké également une ou plusieurs instances de celle-ci au sein d'une ou plusieurs de ses attributs. Dans le chapitre précedent, des variables de type également des classes ayant des attributs deetype entier, réel, booléen, caractère ou texte, oub bien encore un tavleau contenant des valeurs de l'un de ces types. Dans ce paragraphe est présentéé la création d'attributs de type d'une classe ou d'un tablrau contenant des instances de classe: cela correspondant ç la déclaration d'une association.

L'exemple suivant illustre ce concept d'association;

Dans la classe **Joueur**, il y a six attributs. Trois d'entre eux utilisent des types qui ne sont pas des classes( un de type texte et deux de type entier). Les trois qui ne sont pas classes (un de type texte et deux de type entier)/ Les trois autres attributs ont pour type de classes, ce sont donc trois associations.

Tout d'abord, l'attribut
