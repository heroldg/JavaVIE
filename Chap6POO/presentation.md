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

### 7.1 La déclaration et l'instanciation d'une variable de type classe

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
