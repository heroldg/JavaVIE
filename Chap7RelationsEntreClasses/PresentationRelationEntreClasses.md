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

Les methodes **getAdversaire()** et **setAdversaire()** sont des méthodes getters et setters. Ells permettent respectivement de récupérer ou de modifier l'instance de Joueur représenttent l'adversaire de ce joueur. Vous remarquerez qu'il n'y a pas une différence fondamentale par rapport à la méthode getNom() présenté juste au-dessus.

Dans la méthodé **ajouterBateau()**, des instructions accèdent à l'attribut bateaux pour consulter les instances référencées dans les caes du tableau ou pour en ajouter. Comme pour n'importe quel tableau, une fois que la case d'intérêt est bien spécifiée grâce a son indice, l'indice, l'instance référencée à l'intérieur peut être manipulée comme n'importe quelle autre instance.

La méthode **tirer()** accède pour sa part à l'instance de GrilleDeJeu associée au joueur grâce à l'attribut _champDeTir_. Elle possède également une instruction particulièrement intéressante:

    resultatTir <-  instance.adversaire.bateaux[n].testertir(ligne, colonne)

Tout d'abord, instance.adversaire permet d'accéder à une autre instance de la classe Joueur. Ensuite, c'est l'attribut bateau de cette autre instance qui est récupéré. Comme il s'agit d'un tableau, les crochets permettent d'indiquer l'indice de la case référence. enfin lappel à la méthode testerTir() est effetué sur l'instance de Bateau récupérée. Il est ainsi possible de chaîner des accès à des attributs avec des appels de fonction. Il faut toujours avoir en tête le type d'instaance au départ ( ce qui permet de connaître tout ce qui peut être accédé a à partir de celle-ci: attributs d'instance et méthodes d'instance) et le type d'instance obtenu après cet appel pour pouvoir enchaîner avec un nouvel appel.

## 4. L'héritage

### 4.1 La notion d'héritage

La troisième relation qu'une classe peut posséder vis-à-vis d'une autre est l'héritage. L'objectif de l'héritage est de définir une classe non pas à partir de zéro, mais à partir d'une autre classe. La classe servant de base est nommée classe parent et celle créée en se basant sur celle-ci classe enfant.

Grâce à l'héritage, la classe enfant aura déjà tous les attributs et toutes les méthodes définies dans la classe parent. Ces élémenrs sont obtenus en héritage, un peu comme les enfants géritent génétiquement de leurs parents : un enfant a par exemple la même apparence que son père et les mêmes yeux que sa mère. La grande différence par rapport aux humains, c'est que les classes n'ont qu'un parent.

En plus de ces éléments hérités, il sera possible d'ajouter des attributs et des méthodes supplémentaires.

        Pour qu'une hérite d'un parents, il faut que la classe enfant soit un cas particulier de la classe parent. Pour s'assurer de cela, n'hésitez pas à vous poser la question suivante: X est-il un cas particulier de Y ? Si oui, alors la classe X peuthériter de la classe Y. Par exemple : un vélo est-il un cas particulier de véhiculé ? Oui, alors la classe **Velo** peut hériter d'une classe **Véhicule**. Par contre, à la question: une trotinette est-elle un cas particulier de vélo, nous répondrons non. La classe **Trottinette** n'héritera donc pas de la classe **Velo**.

Les classes peuvent donc être vues comme une hiérarchie où les catégories les plus générales seraient les classes au sommet de cette hiérarchi, et de ces classes hériteraient des sous-catégories plus spécifiques.

Il faut faire tout de même attention à ne pas abuser de l'héritage. Un trop grand nombre de niveaux d'héritage nuit à la performance du programme et à sa lisibilité.

### 4.2 La déclaration

La classe parent est déclarée comme précédemment et ne porte aucune marque informant qu'il existe des classes héritant de celle-ci. C'est la classe enfant qui porte cette information d'héritage dans sa déclaration. Au sein de cette classe fille, des attributs, des constantes et des méthodes supplémentaires peuvent être définies.

voici la syntaxe de déclaration d'une classe héritant d'une autre:

    Classe Nom_classe_enfant Héritage Nom_classe_parent

FClasse

Supposons que, dans notre bataille navale, nous souhaitions ajouter un nouveau type de bateau : un porte-conteneurs. La différence par rapport au autres bateaux serait qu'il serait plus large : il utiliserait plus d'une case en largeur. Une première possibilié serait de coder une nouvelle clase à partir de rien. Néanmoins, il y aurait une grande partie du code qui serait similaire, voire identique, à celui présent dans la classe **Bateau**. Comme cela a été évoqué précedemment, la duplication de code est à éviter absolument Une seconde possibilité est bien sûr d'effectuer un héritage. Un porte-conteneurs étant bien un cas particulier de bateau, il est possiblie d'utiliser l'héritage.

Voici donc la déclaration de la classe PorteConteneurs qui hérite de la classe **Bateau**:

Classe PorteConteneurs HériteDe Bateau
Attribut largeur : entier

Méthodes

Fonction getLargeur() Retourne entier
Début
Retourner instance.largeur
Fin

FClasse

Cette classe possède déjà toutes les méthodes, les constantes et les attributs définis au sein de la classe **Bateau**. En plus, un attribut supplémentaire été ajouté: la largeur du porte-conteneurs, et une méthode getter permettant de récupérer cette information.

En java, l'héritage est également possible, mais à la condition que la classe parent n'ait pas été définie avec le mot-clé _final_ , celui-ci interdisant justement l'héritage. Ce cas de figure est assez rare.

La classe enfant indique l'héritage d'une autre classe en spécifiant celle-ci après le mot-clé extends:

    public class Nom_classe_enfant ectends Nom_classe_parent {

    }

La classe enfant hérite de toutes les méthodes, les constantes et les attributs définis dans la classe parent. Néanmoins, les éléments déclarés privés ne sont paas accessibles au sein de vette classe, puisque la visibilité privée indique que ceux-ci sont accessibles uniquement dans la classe dans laquelle ils ont été déclarés. Si ces éléments doivent petre accessibles dans la classe enfant, il faut utiliser la visibilité protégée (protected). Cette visibilité rend l'élément accesible dans la classe où cet element est défini, mais également dans toutes les classes qui en héritent ainsi que dans toutes les classes du même package.

    protected String type;
    protected int longueur;
    protected int latitude;
    protected int longitude;
    protected boolean horizontal;
    private int partiesTouchees = 0;

    private static char symboletouche = 'x';

    public static final int TOUCHE = 1;
    public static final int COULE = 2;

Dans cet exemple, les attributs type et partiesTouchees sont hérités dans la classe **PorteConteneurs**, mais ils ne sont pas accessibles en raison de leur visibilité privée. L'attribut de classe symboleTouche est également hérité, mais de même, il ne sera pas accesible dans les classes enfants. Par contre, les attributs longueur, latitude, longitude, et horizontal seront accessibles dans cette classe **PorteConteneurs**. Les constantes sont définies avec une visibilité publique donc accessibles de n'importe où, en particulier depuis la classe **PorteConteneurs**.

En Java, lorsqu'une classe n'hérite pas explicitement d'une autre (comme la classe Bateau par exemple), celle-ci herité implicitement d'une classe définie par Java se nommant Object.

Cette classe est donc l'ancétre plus ou moins lointain de toutes les classes, puisque :

- soit la classe n'a pas défini explicitement d'héritage et est donc implicitement une classe enfant de la classe Object;

- soit en remontnt dans l'héritage viendra un moment où une classe n'aura pas d'heritage explicite, donc héritera de Object.

La classe Object définit un certain nombre de méthodes dont toutes les classes héritent donc. En particulier, la méthode toString() et la méthode equals() sont très intéressantes et peuvent être redéfinis comme cela est expliqué dans la section La substitution de méthodes de ce chapitre.

### 4.3 Les constructeurs et l'héritage

#### 4.3.1 Le constructeur par défaut

En algorithmique comme en Java, lorsqu'une classe hérite d'une autre, elle n'hérite pas de ses constructeurs. Si aucun constructeur n'est défin dans la classe enfant, celle-ci bénéfici du constructeur par défaut. Dans ce cas-la, ce constructeur fait appel au constructeur de la classe parent sans argument afin d'initialiser les attributs définis dans celle-ci et initialise les attributs supplémentaires à leur valeur par défauts.

Un problème peur néanmoins survenir: la classe parent ne possède pas forcément de constructeur ne prenant aucun argument. C'est d'ailleurs le cas pour la classe **Bateau**. Dans ce cas, il y a deux solutions: soit il faut ajouter un constructeur sans argument dans la classe parent, soit il faut créer un constructeur explicitement dans la classe fille. C'est cette dernière solution qui est mise en œuvre par la suite.

#### 4.3.2 Définir un constructeur

Une classe enfant peut définir en son sein un ou plusieurs constructeurs. De manière implicite, le constructeur commence à nouveau par faire appel au constructeur de la classe parent sans argument.

Si un autre constructeur de la classe parent foit être appelé, il faut effectuer un appel explicite avec la syntaxe suivante :

Cosntructeur(liste_des_paramètres) ConstructeurParent(paramètres)
Début
#Instructions
Fin

Exemple:

    Classe PorteConteneurs HéritageDe Bateau
    Atribut largeur : entier

    Méthodes

    Constructeur(largeur : entier, longueur : entier)
    ConstructeurParent("porte-conteneurs", longueur)
    Début
        instance.largeur <- largeur
    Fin

    Fonction getLargeur() Retourne entier
    Début
        Retourner instance.largeur
    Fin

    FClasse

Pour notre classe PorteConteneurs, un constructeur a été ajouté. Il n'y a donc plus de constructeur par défaut. Ce constructeur appelle explicitement un constructeur de la classe parent en passant en paramètres une chaîne de caractères et un nombre entier. C'est donc le constructeur prenant ces deux types d'arguments qui est appelé. Il est possible de passer au constructeur soit des littéraux (comme pour le cas du premier argument dans cet exemple) soit des paramètres du constructeur (comme c'est le cas pour le second argument de cet exemple), ou un calcul à partir de ceux-ci.

en Java, le fonctionnement est similaire : pour faire appel à un constructeur de la classe parent, il faut le faire en première instruction avec le mot-clé super() et en passant en paramètres les valeurs attendues par le constructeur de la classe parent.

Il est imperatif que l'appel au constructeur de la classe parent soit la première instruction du constructeur.

### 4.4 La subtitution de méthodes

Les méthodes héritées de la classe parent ne sont pas nécessairement adaptées à la nouvelle classe. Il est alors possible de remplacer le code hérité de la classe parent pour cette méthode par un code plus adapté à cette nouvelle classe. Cela se nomme la **substitution** de léthode. il est impératif que la méthode ait exactement la même **signature**, c'est-à-dire même nom, mêmes type de paramètres dans le même ordre et même type de retour.

Afin d'indiquer cette substitution, il est nécessaire d'indiquer le mot-clé **Substitution** :

Procédure Substituée nom_procédure(paramétre)
#Déclarations
Début
#Instructions
Fin

Ou pour une fonction:

Fonction Subtituée nom_fonction(paramètre) retourne type_retour
#Déclarations
Début
#InstructionS
Retourner valeur
Fin

Par exemple, dans la classe **Bateau**, il y a une méthode utilise() permettant de savoir si le bateau compte parmi ses cases celle dont les coordonnées sont passées en paramètres. Cette méthode est héritée par la classe Porte-Conteneurs, néanmoins, elle n'est pas adaptée puisque, contrairement aux bateaux, un porte-conteneurs n'a pas toutes ses cases utilisées sur une même ligne. Celle-ci peut alors être substituée par une nouvelle version adaptée à ce cas particulier de bateau ayant plus d'une case en largeur.

Une autre stratégie consiste à remplacer dans la classe parent.

Une méthode substituée peut faire appel au code tel qu'il était avant la substitution afin d'avoir à dupliquer ce code. Pour cela, il faut indiquer **méthodeParent** et passer les éventuels paramètres nécessaires entre parenthèses :

méthodeParent(paramètres)

Exemple :

    Fonction Subsituée getNbCasesUtilisees() Retourne entier
    Début
    Retourner instance.largeur x méthodeParent()
    Fin

L'appel à méthodeParent()correspond à l'appel de la méthode getNbCasesUtilisees() telle qu'elle était définie dans la classe Bateau. Cette méthode retourne la longueur de bateau. Celle-ci est multipliee par la largeur et, ainsi, la méthode subtituée retourne bien le nombre de cases utilisées par le porte-conteneurs.

En Java, il est également possible de substituer n'importe quelle méthode héritée à condition que celle-ci ne soit pas définie avec le mot-clé final (de même que les classes refusant l'héritage sont rares, les méthodes non substituables sont des cas exceptionnels). Pour subsituer une méthode, il suffit d'écrire une méthode ayant la même signature. Facultativement, il est possible d'indiquer cette substitution en précédant la définition de la méthoode de l'annotation @Override.

### 4.5 Le transtypage

#### 4.5.1 Le transtypage ascendant

Une instance d'une classe peut naturellement être contenue dans une variable du type de cette classe. Mais cette instance peut également être stockée dans une variable de type d'une des classes ancêtres de celle-ci. Comme la classe fille est un cas particulier de la classe parent, il est possible de **généraliser**. Par exemple un porte-conteneurs étant un cas particulier de bateau, il est possible de le considérer comme n'importe quel autre type de bateau.

Par contre, il n'est pas possible de stocker une instance dans une variable d'un type qui ne sera pas une ancêtre de ce type (enfant).

Cette opération se nomme le **transtypage ascendant**, ouisque pour choisir le tpe de la variable une remontée dans la hiérarchi des classes à été effectuée par rapport au type de l'instance crée. Si la variable est bien du type de l'un des ancêtresde l'instance, rien ne peut empêcher de réaliser cette opération. En algorithmique comme en Java, aucun mot-clé particulier n'est nécessaire

Algo Transtypage
Variable poc : PorteConteneurs
Variable bat : Bateau
Début
poc <- nouveau porteConteneurs(2,5)
bat <- nouveau PorteConteneurs(2,5)
Fin

Dans cet exemple, une première instance de PorteConteneurs est créée et celle-ci est stockée normalement, sans transtypage, dans une variable de type PorteConteneurs. La seconde instance créée est par contre stockée dans uncariable de type Bateau, c'est-à-dire la classe parent de PorteConteneurs. Il y a donc une opération de transtypage ascendent qui a été réalisée.

Cette opération de transtypage ascendant peut sembler surprenant : quel est son intérêt . Tout d'abord, il est possible que vous ayez une méthode qui prenne en paramètre un Bateau. Grâce au transtypage ascendant, il est possible de passer en paramètre une instance de Bateau, mais égelement une instance de PorteConteneurs puisque cette classe hérite de Bateau. Voici un autre cas de figure où le transtypage ascendant peut être utile : touss les bateaux aussi bien des instances de la classe Bateau que des instances de la classe PorteConteneurs.

Lorsqu'une instance est condidérée dans un type plus général, seules le méthodes définies das ce type ou celle héritées par celui-ci sont accessibles.

#### 4.5.2 Le transtypage descendant

La transtypage descendant est l'opération inverse, permettant à une instance ayant un transtypage ascendant d'être à nouveau considérée dans un type plus spécifique.

Par exemple, une instance de PorteContenerus a été stockée dans le tableau contenant l'ensemble des bateaux. Afin de pouvoir faire appel à une méthode spéficique à la classe PorteConteneurs, il est nécessaire de la considérer à nouveau comme un porte-conteneurs.

Pour réaliser un transtypage descendant, il faut tout d'abord s'assurer que l'instance est bien une instance de ce type. C'est l'opérateur **est** qui est utilisé à cet effet. Il retourne une valeur boolénne : vrai si le transtypage descendant en lui-même est assuré par l'opérateur **enTantQue**.

Syntaxe:

Si uneInstance est NomClasse Alors
variableNomClasse <- uneInstance enTantQue NomClasse
...
FSi

#### 4.5.3 Le transtypage et les méthodes subtituées

Lors de la création d'une instance, la classe ayant servi à créer cette instance est référencée par instance (ce type est le type rél de l'instance). C'est d'ailleurs cela qui permet à l'opérateur **est** (**instanceoF** en Java) d'indiquer si le transtypage descendant est possible. Lors de l'appel d'une méthode, le code exécuté est celui qui est le plus adapté à l'instance, même si l'instance est considérée dans un de ses types parent avec du transtypage ascendant. Tout d'abord, le type réel de l'instance est récupéré et la méthode est recherchée dans cette classe. Si elle n'est pas présente, c'est dans la classe parent qu'elle est recherchéd, et ainsi de suite jusqu'a trouver la méthode à appeler.

## 5. La création d'instances par méthode de classe en Java

Les méthodes de classe n'ont pas besoin d'une instance pour être appelées. Elles sont par contre situées au sein de la classe et ont donc accès aux éléments privés (à condition sur ce ne soient pas des éléments d'instance). En particulier, ces méthodes ont accès à un constructeur ayant une visibilité privée. Une méthode de classe peut donc créer une instance en y faisant appel et retourner cette instance. Cette techniue se nomme une **fabrique d'instance par méthode de classe**.

### 5.1 L'encapsulation des constructeurs

À l'instar des attributs qui sont protégés en application du principe d'encapsulation, l'accès aux constructeurs peut également petre contrôlé. Pour mettre cela en place, il faut que la classe ne possède que des constructeurs privés, ou protégés si des classes en héritent . Si la classe ne possède aucun constructeur explicite, n'oubliez pas qu'un constructeur par défaut est fourni et que celui-ci est public. Dans ce cas, vous pouvez créer explicitememnt un constructeur avec une visibilité privée ou protégée ne prenan tpas d'argument et n'ayant aucune instruction,ainsi le constructeur par défaut n'est pas ajouté.

Depuis l'extérieur de la classe, il n'est plus possible de faire appel à un constructeur de celle-ci. Le seul moyen pour créer une instance est donc de faire appel à une méthode de classe retournant une instance de celle-ci. Cette encapsultion permet de n'appeler le constructeur qu'une fois que toutes les régles métier ont été vérifiés. La création d'une instance est un processus coûteux, ainsi, le constructeur n'est appelée que si réellement une instance doit être crée (lorsqu'une règle métier est vérifiée au sein d'un constructeur public et n'est pas satisfaite, il est possible d'interrompre le traitement, mais 'le mal est déja fait'). De plus, afin de produire un code efficace, il faut éviter de faire appel à des méthodes qui peuvent être suvstituées dans le constructeur.

Les classes héritant de celle-ci doivent quelque peu être modifiées, puisque les constructeurs ont évolué.
