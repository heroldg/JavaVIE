# La programmation orientée objet

## 1. Presentation

1/.1 Qu'est-ce que la programmation orientée objet ?

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
