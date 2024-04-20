package Condition.ExerciceCondition;

import java.util.Scanner;

public class TempsDeCuisson {
    public static void main(String[] args) {
      
     Scanner console = new Scanner(System.in);
     String typeDeViande;
     String modeDeCuisson = "";
     int poidsDeLaViande = 0;
     double tempsDeCuisson = 0;

     // Choix de la viande
     System.out.println("Quelle viande souhaitez vous ?");
     System.out.println("- Pour du boeuf, tapez 'boeuf'");
     System.out.println("- Pour de  l'agneau, tapez 'agneau'");
     typeDeViande = console.nextLine();
     

    
     
    if (typeDeViande == "boeuf") {
        System.out.println("Quelle cuisson souhaitez vous ?");
        System.out.println("- Pour une cuisson bleu, tapez 'bleu'");
        System.out.println("- Pour une cuisson à point, tapez 'point'");
        System.out.println("- Pour une cuisson bien cuit, tapez 'cuit'");
        modeDeCuisson = console.nextLine();
       
        if (modeDeCuisson == "bleu") {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 1.2;
        }
        if (modeDeCuisson == "point") {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 2.04;
            
        }
        if (modeDeCuisson== "cuit") {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 3;
            
        }
    } else if (typeDeViande == "agneau") {
         // Choix de la cuisson
     System.out.println("Quelle cuisson souhaitez vous ?");
     System.out.println("- Pour une cuisson bleu, tapez 'bleu'");
     System.out.println("- Pour une cuisson à point, tapez 'point'");
     System.out.println("- Pour une cuisson bien cuit, tapez 'cuit'");
     modeDeCuisson = console.nextLine();
     
        if (modeDeCuisson == "bleu") {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 2.25;
            
            
        }
        if (modeDeCuisson == "point") {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 3.75;
            
        }
        if (modeDeCuisson== "cuit") {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 6;
            
        }

    }
    
    
    System.out.println("Pour une viande de " + typeDeViande + " avec une cuisson " + modeDeCuisson + " et la quantité de " + poidsDeLaViande + " mg le temps de cuisson est de " + tempsDeCuisson );
    


        
        console.close();
        

    }
}
