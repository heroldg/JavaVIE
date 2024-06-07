package Chap6POO.CoursPOO;

public class Bateau {

    // Une classe responsable de ses attributs. Ainsi, pour éviter que les valeurs des attributs puissent être modifiées par n'importe qui, le visibilité private y est placés pour ses attributs.
    private String type;
    private int longueur;
    private int latitude;
    private int longitude;
    private boolean horizontal;
    private int partiesTouchees = 0;

    // Cela dit il n'est pas nécessaire de mettre les constantes en privée comme elle n'ont pas vocation à être changées.
    public static final int TOUCHE = 1;
    public static final int COULE = 2;

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
    

    // methodes d'instance qui est une procédures permettant d'initialiser les caractéristiques d'un bateau
    public void initialiser(String type, int longueur) {
        this.type = type;
        this.longueur = longueur;

    }

    public void positionner(int latitude, int longitude, boolean horizontal) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.horizontal = horizontal;
    }

    public boolean utilise(int latitude, int longitude) {
        return
            this.horizontal && this.latitude == latitude && this.longitude <= longitude && longitude < this.longitude + this.longitude ||
            !this.horizontal && this.longitude == longitude && this.latitude <= latitude && latitude < this.latitude + this.longueur;

    }

    public int testerTir(int latitude, int longueur) {
        int ret = 0;
        boolean touche = utilise(latitude, latitude);
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

}
