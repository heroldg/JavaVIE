package Chap8ElementsAbstraits.ExoElementsAbstraits.VitesseMoyenVMultiLangue.Langue;

public class TradAllemande  implements Traductions {

    @Override
    public String saisieDistance() {
        return "Geben Sie die zurückgelegte Entfernung ein (km) : ";
    }

    @Override
    public String saisieTemps() {
        return "Geben Sie die Reisezeit ein (min) : ";
    }

    @Override
    public String debutReponse() {
        return "Sie sind mit ";
    }

    @Override
    public String finReponse() {
        return " km/h gefahren.";
    }

}
