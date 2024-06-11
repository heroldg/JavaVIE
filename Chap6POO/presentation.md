# La programmation orientée objet

## 1. Presentation

Qu'est-ce que la programmation orientée objet ?

La programmation orientée objet , souvent abrégé en POO , est un autre paradigme de la programmation, qui vient s'ajouter aux paradigmes de programmation impérative et procédurale utilisés précédemment.

En programmation orientée objet, nous définissons donc des classes representant les objets que nous souhaitons modéliser. Chaque classe d"fnint un concept : il est possible d'en donner une définition . Par exemple, un bateau de bataille navale est défini par son type, sa longueur et ses coordonnées mais également par le fait de pouvoir être touché par un tir de l'adversaire , voir également coulé. Tous les bateaux de ce jeu respectent cette définition de la classe _Bateau_. Il y a un ensemble de bateaux intervenant dans une partie de bataille navale. Ces différents bateaux correspondent aux instances de la classe _Bateau_ . Une instance d'une classe est donc un élément respectant la définition de cette classe. Dans notre jeu de bataille navale, il sera nécessaire de créer une classe _Bateau_ et, à partir de cette classe, de créef dix instances pour représenter les bateaux des deux joueurs.

## 2. Les attibuts d'instance

Il existe quatre visibilité:

**private**

        Elle indique que l'élément est accesible uniquement au sein de cette classe.

**public**

        Elle signifie que l'élément est accesible de n'importe où

**package**

        La visibilité package est celle qui est utlisée lors qu'auncun mot-clé n'est infiqu". Les éléments déclarés avec cette visibilité sont accesibles uniquement au sein de classes qui appartiennent au même package.

**protected**

        En plus d'être accessible depuis les classes appartenant au même package, les éléments sont accessibles au sein des classes qui héritent de cette classe (cette notion est abordée en detail dans le chapitre Les relations entre les classes).

De manières similaire aux fonctions et procédures qui sont responsables des variables qu'elles contiennet, une classe responsable de ses attributs. Ainsi, pour éviter que les valeurs des attributs puissent être modifiées par n'importe qui, les visibilités **public** et **package** sont à bannir pour un attribut. Cette régle se nomme le **_principe d'encapsulation_**.

## 3. Les méthodes d'instance

Les méthodes d'instance sont les actions réalisables sur les instances. Elles correspondent aux procédures et fonctions qui manipulent les variables allant bien ensemble citées en introduction.

Les méthodes d'instance peuvent accéder au attributs d'instance à la différence des méthodes statique. Les visibilités proposées pour une méthode sont les mêmes que celles présentées pour les attributs et les constantes. Une méthode d'instance peut accéder à un attribut d'instance. Pour cela, il faut utiliser le nom de l'attribut d'instance, éventuellement précedé de _this_ (cela n'est obligatoire que si un attribut porte le même nom qu'un paramètre ou qu'une variable, afin de lever l'ambiguÏté).

## 4. Les méthodes Getters & Setters

Il est possible de créer des méthodes ayany pour objet la récupération de la valeur d'un attribut. Ces méthodes s'appellent des accesseurs ou _getters_. Rappelez-vous, les attributs sont privées, il n'est donc pas possible de récupérer directement leur valeu depuis l'exterieur de cette classe. Ces méthodes vont permettre de rendre accessibles ces valeurs, mais par ce biais, il ne sera pas possible de changer la valeur contenue dans l'attribut.

Le nom de ces méthodes est généralement composé de _get_ suivi du nom de l'atribut.

Il existe également des méthodes appelés mutateurs ou _setters_ permettant de modifier la valeur d'un attibut. Géneralement, avant d'effectuer la modification, une méthode _getter_ vérifie si la nouvelle valeur respect les régles souhaitées (le nom d'une personne doit forcement être renseigné par exemple) et elle formate la valeur suivant ses souhaits (par exemple, le nom est passé tout en majuscules).

## 5. La surcharge de méthodes

En algorithmique, il est possible de définir plusieurs méthodes portant le même nom au sein d'une même classe. C'est ce qui se nomme la **surcharge** de méthodes. Afn qu'il n'y ait pas d'ambiguîté sur la méthode à appeler, il est nécessaire que les différentes méthodes portant le même nom au sein d'une même classe aient des types d'arguments différents ou un nombre d'arguments différents. Par exemple, il n'est pas possible d'avoir deux méthodes de même nom prenant toutes deux un nombre entier de paramètre. Par contre, il est possible d'avoir une méthode prenant en paramètre un entier, une autre de même nom prenant en paramètre deux entiers et même une troisième portant également le même nom prenant en paramètre une chaîne de caractères.

En fonction du nombre et du type des paramètres passés, il n'y a dans ce cas pas d'ambiguité sur la méthode à appeler.

Afin de distinguer les méthodes , voici les éléments qui sont pris en compte :

        - La classe dans laquelle la méthode est déclarée
        - le nom de la méthode
        - le nombre d'arguments
        - le type d'argument

Deux méthodes doivent absolument avoir au moins un de ses quatre éléments qui difère pour qu'elles puissent être distinguées l'une de l'autre lors d'un appel.
Remarquez que le type de retour d'une méthode ne fait pas partie des élémenrs permettant de distinguer les méthodes entre elles.

## 6. La création d'une instance

### 6.1 La déclaration et l'instanciation d'une variable de type classe

nous savons maintenant créer des classes, il est grand temps d'apprendre à y faire appel ! Ce paragraphe a donc pour objectif d'expliquer comment créer une instance et comment faire appel à une méhtodes.

**L'écriture d'une classe correspond à la création d'un nouveau type. il est possible de déclarer des variables de ce type.**

Syntaxe :

        Variable nom_instance: Nom_de_la_classe

Exemple :

        Variable croiseur : Bateau

Tout comme pour les tableaux dont la taille n'a pas été indiqué entre les crochets, cette déclaration n'a crée qu'une variable capable de contenir une instance de **Bateau** dans cette variable, il faut la créer. Cette opération s'appelle **l'instanciation**

Exemple :

                croiseur <-  nouveau Bateau()

Il est également possible de créer simultanément l'instance et la variable permettant de la stocker en écrivant:

        Variable nom_instance : Nom_de_la_classe <- nouveau Nom_de_la_classe()

une fois linstance crée il est possible de faire appel à ses méthodes d'instance en utilisant la syntaxe suivante:

        nom_instance.comDeLaMethodeDInstance(paramètres)

### 6.2 Les tableaux d'instances

en algorithmique comme en Javan il est également possible de créer des tableaux dont le type des casses est une classe. La syntaxe de déclaration de ce tableau est la même que précedemmment : il suffit d'indiquee comme type le nom de la classe.

## 7. Les constructeurs

Lors de la création d'une instance (exp: croiseur <- nouveau Bateau()), différentes opérations sont réalisées. tout d'abord , il est nécessaire de reserver l'espace mémoire nécessaire pour stocker les information de l'instance (cet aspect-là est expliqué dans le chapitre La mémoire). Ensuite , les attributs d'instance sont initialisés grâce au constructeur. nfin , la variable devant contenir l'instance est valorisée.

### 7.1 Le constructeur par défaut

En algorithmique comme en Java, dans une classe, en absence de la déclaration d'au moins un constructeur, il existe un constructeur par défaut. Ce constructeur est alors implicitement ajouté à la classe. Le constructeur par défaut ne prend pas d'argument. Il fait appel au constructeur sans argument de la classe parent ( cela est abordé dans la section L'héritage du chapitre prochain) et initialise les attributs à leurs valeurs par défaut (faux pour des booléens, zéro pour des nombres, le caractère nul pour les caractères et l'absence de valeur (null) pour les instance).

Dans l'exemple de la bataille navale, aucun constructeur n'a été explicitement déclaré. Un constructeur par défaut y a donc impliciment été ajouté et c'est celui-ci était appelé lors de la création de l'instance.

### 7.2 Les constructeurs

Il est possible de déclarer un ou des constructeurs afin d'initialiser les attriibuts d'instance avec des valeur plus daptées ou des valeurs choisies. Pour définr un constructeur, il faut utiliser la syntaxe suivante au sein de la section _Méthodes_ de la classe:

        Constructeur(liste_des_paramètres)
        Début
                #instructions
        Fin

Lorsque le constructeur prend en pramètres deux valeurs: Il utilise ces paramètres pour initialiser deux attributs. Une fois qu'au moins constructeur à été défini, il n'existe plus de constructeur par défaut.

### 7.3 La surcharge de constructeurs

En algorithmique comme en Java , il est possible de définir plusieurs constructeurs au sein d'une classe. À l'instar des méthodes, c'est ce qui se nomme la surcharge de constructeurs. Tout comme avec les méthodes, il ne faut pas qu'il y ait d'ambiguîté sur le constructeur à appeler. Une différence toutefois par rapport aux méthodes est qu'il n'est pas possible d'utiliser le nom pour différencier deux constructeurs.

Voici les éléments permettant de distinguer deux constructeurs:

        - la classe dans laquelle le constructeur est déclaré
        - le nombre d'arguments
        - le type d'argument

## 8. Les attrubuts de classe

Il existe deux catégories d'attributs:

- Les attributs d'instance
- Les attributs de classe

### 8.1 Les attributs d'instance

Les attributs d'instance représente des elements qui sont propres à chaque instance. Dans l'exemple de la bataille navale , chaque instance de bateau possède son propre type, sa propre longueur, son propre positionnement (latitude, longitude et orientation verticale ou horizontale) et son propre compteur de tirs l'ayant endommagé. Pour tous ces attributs d'instance, une modification de valeur n'affecte qu'une seule instance. Par exemple, si un tir atteint l'un des bateaux d'un joueur, seule la valeu de l'attribut **partiesTouchees** de ce bateau est modifiées. Les valeurs de cet attributs pour toutes les autres instances restent inchangées.

### 8.2 Les attibuts de classe

Les attributs de classe, représente les éléments qui sont communs ou collectifs à la classe.

Les éléments communs correspondent à une valeur qui serait la même pour l'ensemble des instances de cette classe. Le caractères pour afficher une partie de bateau indemne et celui pour afficher une partie de bateau atteinte par un tir sont des élémenrts communs à toutes les instances. Ces valeurs sont partagées entre toutes les instances: si le caractère **x** est utilisé pour indiquer qu'un bateau est touché, c'est ce même caractère qui est utilisé pour afficher tous les tirs ayant atteint n'importe quel bateau..

Les éléments collectifs correspondent, pour leur part ,aux élémenents dont la valeur sdépend de l'ensemble des instances. Par exemple, la longueur maximale de l'ensemble des bateaux ou le nombre de bateaux coulés osnt des éléments collectifs . Dans cette catégories , l'ajout d'une instance ou la modification de l'une d'entre elle peut affecter la valeur collective; si l'un des bateaux est coulé, la valeur partagée comptant le nombre de bateaux coulées est incrémentée.

## 9. Les méthodes de classe

Les méthodes de classe, à l'instar des attributs de classe, sont des méthodes dont l'éxecution ne dépend pas d'une instance particulière. Ces méthodes travaillent donc sur la classe et non sur les instances de celle-ci.

Par exemple, une méthode de classe pourrait afficher les régles de positionnement d'un bateau sur la grille de la bataille navale. Cette méthode ne dépend pas d'un bateau plutôt sur la grille de la bataille navale. Cette méthode de classe. Les méthodes dee classe peuvent accéder aux attributs de classe, par contre elles ne peuvent pas accèder aux attributs d'instance puisque ces attributs dépendent d'une instance.

### 9.1 Récapitulatif des méthodes de classe par rapport aux méthodes d'instance

voici un petit tableau répapitulatif indiquant les principales différences entre les méthodes d'instance et les méthodes de classe:

|                                |                   Méthode d'instance                    |                          Methode de classe                          |
| ------------------------------ | :-----------------------------------------------------: | :-----------------------------------------------------------------: |
| Mot-clé en Java                |                        Ø(aucun)                         |                          oui : **static**                           |
| Accès aux attributs d'instance |                           oui                           |                                 non                                 |
| Appel depuis la classe en Java | this.nomMethodeInstance(): exemple: this.testerTir(3,2) | nomClasse.nomMethodeClasse() exemple: Bateau.setSymboletouche('\*') |
| Appel hors la classe en Java   | nomMethodeInstance(): exemple: croiseur.testerTir(3,2)  | nomClasse.nomMethodeClasse() exemple: Bateau.setSymboletouche('\*') |
