package Chap8ElementsAbstraits.ExoElementsAbstraits.VitesseMoyenVMultiLangue.Langue;

public class TradFrancaise implements Traductions {
    @Override
    public String saisieDistance() {
        return "Saisissez la distance parcourue (km) : ";
    }

    public String saisieTemps() {
        return "Saisissez le temps de parcours (min) : ";
    }

    public String debutReponse() {
        return "Vous vous êtes déplacé à ";
    }

    public String finReponse() {
        return " km/h.";
    }
}
