package Condition.ExerciceCondition;

import java.util.Scanner;

public class TempsDeCuisson {
    public static void main(String[] args) {
      
     Scanner console = new Scanner(System.in);
     int typeDeViande;
     int modeDeCuisson = 0;
     int poidsDeLaViande = 0;
     double tempsDeCuisson = 0;

     String messageViande = "";
     String messageCuisson = "";

     // Choix de la viande
     System.out.println("Quelle viande souhaitez vous ?");
     System.out.println("- Pour du boeuf, tapez '1'");
     System.out.println("- Pour de  l'agneau, tapez '2'");
     typeDeViande = console.nextInt();
     
        if (typeDeViande == 1) {
        System.out.println("Quelle cuisson souhaitez vous ?");
        System.out.println("- Pour une cuisson bleu, tapez '1'");
        System.out.println("- Pour une cuisson à point, tapez '2'");
        System.out.println("- Pour une cuisson bien cuit, tapez '3'");
        modeDeCuisson = console.nextInt();
       
        if (modeDeCuisson == 1) {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 1.2;
        }
        if (modeDeCuisson == 2) {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 2.04;
            
        }
        if (modeDeCuisson == 3) {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 3;
            
        }
    } else if (typeDeViande == 2) {
         // Choix de la cuisson
     System.out.println("Quelle cuisson souhaitez vous ?");
     System.out.println("- Pour une cuisson bleu, tapez '1'");
     System.out.println("- Pour une cuisson à point, tapez '2'");
     System.out.println("- Pour une cuisson bien cuit, tapez '3'");
     modeDeCuisson = console.nextInt();
     
        if (modeDeCuisson == 1) {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 2.25;        
        }
        if (modeDeCuisson == 2) {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 3.75;
        }
        if (modeDeCuisson == 3) {
            System.out.println("Quelle quantité en gramme souhaitez vous ?");
            poidsDeLaViande = console.nextInt();
       
            tempsDeCuisson = poidsDeLaViande * 6;
            
        }

    }
    
    switch (typeDeViande) {
        case 1:
            messageViande = "beauf";
            break;
    
        case 2:
            messageViande = "agneau";
            break;
    
        default:
            break;
    }

    switch (modeDeCuisson) {
        case 1:
            messageCuisson = "blue";
            break;
    
        case 2:
            messageCuisson = "à point";
            break;
    
        case 3:
            messageCuisson = "bien cuit";
            break;
    
        default:
            break;
    }
    
    System.out.println("Pour une viande de " + messageViande + " avec une cuisson " + messageCuisson + " et la quantité de " + poidsDeLaViande + " mg le temps de cuisson est de " + tempsDeCuisson  / 60 + " minutes" );
        
        console.close();
        

    }
}
