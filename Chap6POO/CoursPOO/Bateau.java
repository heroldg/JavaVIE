package Chap6POO.CoursPOO;

import Chap7RelationsEntreClasses.CoursRelationEntreClasses.PorteConteneurs;

public class Bateau {
    

    // Une classe responsable de ses attributs. Ainsi, pour éviter que les valeurs des attributs puissent être modifiées par n'importe qui, le visibilité private y est placés pour ses attributs. Ses attributs sont des attributs d'instance
    protected String type;
    protected int longueur;
    protected int latitude;
    protected int longitude;
    protected boolean horizontal;
    private int partiesTouchees = 0;

    // Cette attribut est un attribut de classe
    private static char symboletouche = 'x';

    // Cela dit il n'est pas nécessaire de mettre les constantes en privée comme elle n'ont pas vocation à être changées.
    public static final int TOUCHE = 1;
    public static final int COULE = 2;
    
    protected Bateau() {

    }

    public static Bateau creerBateau(String type, int longueur) {
        Bateau ret = null;
        if (type.equals("")) {
            System.out.println(("Le type du bateau ne peut être vide"));


        } else if (longueur <= 0) {
            System.out.println("La taille du bateau doit être strictement positive");
        } else {
            ret = new Bateau();
            ret.initialiser(type, longueur);
        }

        return ret;
    }

    public static Bateau creerEtPositionnerBateau(String type, int longueur, int latitude, int longitude, boolean horizontal) {
        Bateau ret = creerBateau(type, longueur);
        if (ret != null) {
            ret.positionner(latitude, longitude, horizontal);
        }
        return ret;
    }

    protected void initialiser(String type, int longueur) {
        this.type = type;
        this.longueur = longueur;
    }



    //constructeur 
    public Bateau(String type, int longueur) {
        this.type = type;
        this.longueur = longueur;
    }

    // Il est impératif que cet appel soit la première instruction du constructeur. Il faut indiquer le mot-clé this suivi entre parenthèses des valeurs attendues par le constructeur appelé.
    public Bateau(String type, int longueur, int latitude, int longitude, boolean horizontal) {
        this(type, longueur); //Ceci fait référence au constructeur :  public Bateau(String type, int longueur) 
        this.positionner(latitude, longitude, horizontal);
    }

    public int getLongueur() {
        return this.longueur;
    }

    public String getType() {
        return this.type;
    }

    public void SetType(String type) {
        if (type.equals("")) {
            System.out.println("Le type du bateau ne peut être vide");
        } else {
            this.type = type;
        }
    }

    public static Bateau creerParType(String type) {
        Bateau ret = null;
        switch (type) {
            case "porte-avions":
                ret = creerBateau(type, 5);
                
                break;

            case "croiseur":
                ret = creerBateau(type, 4);
                
                break;

            case "contre-torpilleur":
            case "sous-marin":
                ret = creerBateau(type, 3);
                
                break;

            case "torpilleur":
                ret = creerBateau(type, 2);
                
                break;
            case "porte-conteneurs":
                ret = new PorteConteneurs(2, 5);
                
                break;
        
            default:
                System.out.println("ce type de bateau est inconnu !");
                break;
        }

        return ret;
    }

    // méthode de classe afficherReglesPositionnement(): Cette méthode peut même être appelée alors qu'aucune instance de la classe bateau n'a été créée. Il est ainsi possible d'afficher les régles de possionnement des bateaux à un joueur avant même d'avoir commencé une partie et donc crée des instances de bateaux. La capacité des méthodes de classe à être appelées sans avoir d'instance est une caractéristique intéressante. Il est par exemple possible de créer une méthode de classe capable de créer des instances de celle-ci. 
    public static void afficherReglesPositionnement() {
        System.out.println("Les bateaux doivent être possitionnés soit horizontalement , soit verticalement mais jamais en biais.");
        System.out.println("Les bateaux ne peuvent pas se superposer. Il est néamoins possible qu'ils se touchent.  ");
        System.out.println("Les bateaux doivent être positionnés intégralement dans la grille de jeu de la bataille navale");
        System.out.println("Une fois positionnés, les bateaux ne peuvent être déplacés. ");
    }

    // les deux autres méthodes de classe sont les getter et le setter pour l'attribut de classe symboleTouche. Ces méthodes peuvent accéder à cet attribut , car c'est un attriibut de classe. Il aurait été impossible d'accéder à un attribut d'instance.
    public static char getSymbole() {
        return Bateau.symboletouche;
    }

    public static void setSymboleTouche(char symboletouche) {
        Bateau.symboletouche = symboletouche;
    }
    

    // // methodes d'instance qui est une procédures permettant d'initialiser les caractéristiques d'un bateau
    // public void initialiser(String type, int longueur) {
    //     this.type = type;
    //     this.longueur = longueur;

    // }

    public void positionner(int latitude, int longitude, boolean horizontal) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.horizontal = horizontal;
    }

    public void positionner(int latDeb, int longDeb, int latFin, int longFin) {
        if (latDeb == latFin) {
            if (longFin - longDeb + 1 == this.longueur) {
                this.horizontal = true;
                this.latitude = latDeb;
                this.longueur = longDeb;

            } else {
                System.out.println("Les coordonnées de début et de fin du tableau ne sont pas cohérentes avec la taille du bateau" );
            }
        } else {
            if (longDeb == longFin) {
                if (latFin - latDeb  + 1 == this.longueur) {
                    this.horizontal = false;
                    this.latitude = latDeb;
                    this.longitude = longDeb;

                } else {
                    System.out.println("Les coordonnées de début et de fin du tableau ne sont pas cohérentes avec la taille du bateau");
                }
            } else {
                System.out.println("Le bateau doit être positionnée soit verticalement soit horizontalement.");
            }
        }
    }

    public boolean utilise(int latitude, int longitude) {
        return this.horizontal && this.latitude == latitude && this.longitude <= longitude && longitude < this.longitude + this.longueur ||
               !this.horizontal && this.longitude == longitude && this.latitude <= latitude && latitude < this.latitude + this.longueur;
    }
    

public int testerTir(int latitude, int longitude) {
    int ret = 0;
    boolean touche = utilise(latitude, longitude);
    if (touche) {
        this.partiesTouchees++;
        if (this.partiesTouchees == this.longueur) {
            ret = Bateau.COULE;
        } else {
            ret = Bateau.TOUCHE;
        }
    }
    return ret;
}


public int getNbCasesUtilisees() {
    return this.longueur;
}


}


