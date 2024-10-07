package Chap8ElementsAbstraits.ExoElementsAbstraits.VitesseMoyenVMultiLangue.Langue;

public class TradAnglaise implements Traductions {
    @Override
    public String saisieDistance() {
        return "Enter the distance traveled (km) : ";
    }

    @Override
    public String saisieTemps() {
        return "Enter the travel time (min) : ";
    }
    @Override
    public String debutReponse() {
        return "You moved at ";
    }
    @Override
    public String finReponse() {
        return " km/h.";
    }
}
