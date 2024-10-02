package Chap7RelationsEntreClasses.CorrectionRelationEntreClasses;

public class VideoCorrection extends OeuvreCorrection {
    int dureeMinutes;

    VideoCorrection(String titre, String auteur, int dureeMinutes) {
        super(titre, auteur);
        this.dureeMinutes = dureeMinutes;
    }

    public int getDureeMinutes() {
        return this.dureeMinutes;
    }

    @Override
    public String getInfo() {
        return "Vidéo " + super.getInfo() + " (" +  (((this.dureeMinutes / 60) < 10 ? "0" + this.dureeMinutes / 60 :  this.dureeMinutes / 60) + "h" + ((this.dureeMinutes % 60) < 10 ? "0" + this.dureeMinutes % 60 : this.dureeMinutes % 60 ) + ")" );
    }
}
