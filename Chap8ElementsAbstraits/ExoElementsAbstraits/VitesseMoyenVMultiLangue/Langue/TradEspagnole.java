package Chap8ElementsAbstraits.ExoElementsAbstraits.VitesseMoyenVMultiLangue.Langue;

public class TradEspagnole implements Traductions {
    @Override
    public String saisieDistance() {
        return "Introduce la distancia recorrida (km) : ";
    }
    @Override
    public String saisieTemps() {
        return "Introduce el tiempo de viaje (min) : ";
    }

    @Override
    public String debutReponse() {
        return "Te moviste a ";
    }
    @Override
    public String finReponse() {
        return " km/h.";
    }
}
