    package Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients;

    public class Video extends Oeuvres {

    private int minutesVideo;

    // Constructeur Oeuvres Vidéo
    public Video(String titre, String auteur, int minutesVideo) {
        super(titre, auteur);
        this.minutesVideo = minutesVideo;
    }

    public int getMinutesVideo() {
        return this.minutesVideo;
    }

   // Doit convertir la durée en heures et minutes
public String getMinutesVideoInHours() {
    return ((this.minutesVideo / 60) < 10 ? "0" + this.minutesVideo / 60 : this.minutesVideo / 60)
            + "h" + ((this.minutesVideo % 60) < 10 ? "0" + this.minutesVideo % 60 : this.minutesVideo % 60);
}

    @Override
    public String getInfo() {
        return "Vidéo " + super.getInfo() + " (" +this.getMinutesVideoInHours() + ")";
    }



        
        
    }
