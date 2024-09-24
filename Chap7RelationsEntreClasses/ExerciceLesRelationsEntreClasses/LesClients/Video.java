package Chap7RelationsEntreClasses.ExerciceLesRelationsEntreClasses.LesClients;

public class Video extends Oeuvres {

    private int minutes;
    private int numeroVideo;
    

    // public Video () {
    //     this.titre = getTitre();
    //     this.auteur = getAuteur();         
    //     this.minutes = getMinutes();
    //     this.numeroVideo = numeroVideo + 1;
    // }

    public Video(int minutes, String titre, String auteur) {
        super( auteur, titre);
        this.minutes = minutes;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public String getTitre() {
        return this.titre;
    }

    public String getAuteur() {
        return this.auteur;
    }


    
    
}
